package mymain;

import java.util.Calendar;
import java.util.Date;

import myutil.MySingleton;

public class MyMain_static_싱글톤 {
	public static void main(String[] args) throws InterruptedException {
		/*TODO Design Pattern(설계(개발)방법론)
		 *     1.Singleton Pattern : 객체 1개만 생성해서 재활용 하자
		 * */
		
		while(true) {
			
			//자원낭비 요소 존재
			//현재 시스템 구간구하기(년월일시분초)
//			Date now = new Date();
//			int hour = now.getHours();
//			int minute = now.getMinutes();
//			int second = now.getSeconds();
			
			
			//현재시스템 구함
			//싱글톤
			Calendar now= Calendar.getInstance();
			int hour = now.get(Calendar.HOUR_OF_DAY);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			
			
			System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
//			MySingleton ms = new MySingleton();
			MySingleton ms = MySingleton.getInstance();
			ms.display_line();
			
			
			Thread.sleep(1000);
		}
		
		
	}
}
