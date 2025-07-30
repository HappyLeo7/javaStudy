package mymain;

import java.util.Scanner;

import myutil.Channel;
import myutil.RemoteCon;
import myutil.TV;
import myutil.TvFactory;
import myutil.Volume;

public class MyMain_TV {
	public static void main(String[] args) {
		//   	  인터페이스	=     클래스
//		RemoteCon remoteCon = new TV();
		RemoteCon remoteCon = TvFactory.getInstance().getTv();
		remoteCon.onOff(); // 켜짐
		remoteCon.onOff(); // 꺼짐
		remoteCon.onOff(); // 켜짐
		
		remoteCon.volumeZero(); //음소거 설정
		remoteCon.volumeZero(); //음소거 해제
		
		int v = 100 ;
		for(int i=0;i<v;i++) {
			
		remoteCon.volumeUp(); // 볼륨 +
		}
		
		remoteCon.volumeDown(); // 볼륨 -
		
		
		int chUp = 100 ;
		for(int i=0;i<chUp;i++) {
			
			remoteCon.channelUp(); // 볼륨 +
		}
		
		//Up-casting
		Volume volume = remoteCon;
		for(int i=0;i<v;i++) {
			volume.volumeDown();
		}
		
		//Up-casting
		int chDonw=50;
		Channel channel = remoteCon;
		for(int i=0;i<chDonw;i++) {
			channel.channelDown();;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 채널을 입력하시오");
		int chNum=scanner.nextInt();
		remoteCon.setChanel(chNum);
		scanner.close();
	}
}
