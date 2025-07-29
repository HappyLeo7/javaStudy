package mymain;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// JAVA 패키지중 AWT(Abstract Window Toolkit) 패키지: 윈도우관련기능 정의
// Frame		<- awt
// └> JFrame		<- swing
public class MyMain_MyWindow extends JFrame {

	//화면 해상도를 저장할 변수
	int screen_w;
	int screen_h;
	
	JButton jbt_kor;
	JButton jbt_eng;
	JButton jbt_jpn;
	JButton jbt_mun;
	
	// 기본생성자
	public MyMain_MyWindow() {
		//타이틀
		super("내가 처음 만든 윈도우"); // JFrame("")생성자 호출

		//화면해상도 구하기 Dimension 폭과 높이 정보를 가짐
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
		this.screen_w=d.width;
		this.screen_h=d.height;
		System.out.printf("w: %d  h: %d\n",screen_w,screen_h);

		//버튼생성
		jbt_kor = new JButton("한글");
		jbt_eng = new JButton("영문");
		jbt_jpn = new JButton("일어");
		jbt_mun = new JButton("문어");
		//배치방법은 3행 1열로 배치
		this.setLayout(new GridLayout(2,2)); //(행,열)

		//버튼추가
		this.add(jbt_kor);
		this.add(jbt_eng);
		this.add(jbt_jpn);
		this.add(jbt_mun);
		this.add(jbt_mun);
		
		//버튼이벤트 처리
		//jbt_kor버튼이 클릭이 되면 on_click_kor() 호출하겠다.
		jbt_kor.addActionListener((e)->{ on_click_kor(); });
		jbt_eng.addActionListener((e)->{ on_click_eng(); });
		jbt_jpn.addActionListener((e)->{ on_click_jpn(); });
		jbt_mun.addActionListener((e)->{ on_click_mun(); });
		
		
		// 위치지정
		super.setLocation(300, 200);

		// 크기지정 w h
		super.setSize(500, 500);

		// 보여주기
		super.setVisible(true);

		// 크기변경불가
		super.setResizable(false);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 키보드 이벤트 설정
		// Delegation Event Mode (위임 이벤트 모델)
		this.addKeyListener(new MykeyAdapter());
	}

	//버튼처리 메서드
	private void on_click_mun() {
		JOptionPane.showConfirmDialog(this, "무너무너누누어어어"); // 예 아니요 취소 선택 버튼
	}

	private void on_click_jpn() {
		
		JOptionPane.showMessageDialog(this, "일본어 인사말 : 사요나라");
	}

	private void on_click_eng() {
		JOptionPane.showMessageDialog(this, "영어 인사말 : alright");
		
	}

	private void on_click_kor() {
		JOptionPane.showMessageDialog(this, "한국어 인사말 : 안녕하세요");
	}

	// 키보드 이벤트 처리 객체
	class MykeyAdapter extends KeyAdapter {
		
		//키가 눌렸을때 발생하는 메소드
		@Override
		public void keyPressed(KeyEvent e) {
			
			//눌린 키 값
			int key=e.getKeyCode(); 
//			System.out.println(e);
			
			//현재 윈도우의 위치 알아보기
			Point pt=MyMain_MyWindow.this.getLocation();// Point : x , y 좌표값을 갖고 있음
			int gan=10;
			
			
			//				 VK_ (Virtual Key) 가상키값?
			if(key==KeyEvent.VK_LEFT) { //LEFT
				
				pt.x -=gan;
			}else if(key==KeyEvent.VK_UP) { //UP
				pt.y -=gan;
				
			}else if(key==KeyEvent.VK_RIGHT) { //RIGHT
				pt.x +=gan;
				
			}else if(key==KeyEvent.VK_DOWN) { //DOWN
				pt.y +=gan;
				
			}
			//상하좌우벗어났을때
			if(pt.x>=1920) {
				pt.x=-500;
			}else if(pt.x<=-500) {
				pt.x=1920;
			}else if(pt.y<=-500) {
				pt.y=1080;
			}else if(pt.y>=1080) {
				pt.y=-500;
			}
			//새로운 위치지정
			setLocation(pt);//Point 값
		}
	}

	public static void main(String[] args) {
		new MyMain_MyWindow();
	}
}
