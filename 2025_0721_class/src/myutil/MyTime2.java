package myutil;

import java.util.Calendar;

public class MyTime2 {

	int hour;
	int minute;
	int second;
	
	//this()생성자
	
	public MyTime2() {
		System.out.println("---MyTime2()---");

		//TODO 			현재시간구하기 : 년월일시분초...
		Calendar now = Calendar.getInstance();
		this.hour    = now.get(Calendar.HOUR_OF_DAY);
		this.minute  = now.get(Calendar.MINUTE);
		this.second  = now.get(Calendar.SECOND);
	}
	
	public MyTime2(int hour) {
		//TODO Constructor call must be the first statement in a constructor (this()생성자는 항상 맨위에 존재해야 한다!)
		this(); //MyTime2()을 표현한다.   (자기자신의 생성자를 호출)
		System.out.println("---MyTime2(hour)---");
//		Calendar now = Calendar.getInstance();
//		this.minute  = now.get(Calendar.MINUTE);
//		this.second  = now.get(Calendar.SECOND);
		this.hour = hour;
	}

	public MyTime2(int hour, int minute) {
		this(hour);
		System.out.println("---MyTime2(hour,minute)---");
//		this.hour = hour;
		this.minute = minute;
	}

	public void display4() {
		String am_pm = hour<12 ? "오전":"오후";
		System.out.printf("[%s]%02d:%02d:%02d\n", 
				am_pm,
				hour>12?hour-12:hour,
						minute,
						second);
	}
}
