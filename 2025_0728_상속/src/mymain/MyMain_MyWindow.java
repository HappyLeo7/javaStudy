package mymain;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

// JAVA 패키지중 AWT(Abstract Window Toolkit) 패키지: 윈도우관련기능 정의
// Frame		<- awt
// └> JFrame		<- swing
public class MyMain_MyWindow extends JFrame {

	//화면 해상도를 저장할 변수
	int screen_w;
	int screen_h;
	
	// 기본생성자
	public MyMain_MyWindow() {
		//타이틀
		super("내가 처음 만든 윈도우"); // JFrame("")생성자 호출

		//화면해상도 구하기 Dimension 폭과 높이 정보를 가짐
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
		this.screen_w=d.width;
		this.screen_h=d.height;
		System.out.printf("w: %d  h: %d\n",screen_w,screen_h);

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
