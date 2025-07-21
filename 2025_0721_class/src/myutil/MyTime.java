package myutil;

import java.util.Calendar;

public class MyTime {
	// 필드 변수 hour, minute, second
	private int hour;
	private int minute;
	private int second;
	Calendar date = Calendar.getInstance();

	// 생성자 4개
	public MyTime() {
		this.hour = date.get(Calendar.HOUR_OF_DAY);
		this.minute = date.get(Calendar.MINUTE);
		this.second = date.get(Calendar.SECOND);

	}

	public MyTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public MyTime(int h, int m) {
		this.hour = h;
		this.minute = m;
	}

	public MyTime(int h) {
		this.hour = h;
//		this.minute=0;
//		this.second=0;
	}
	// getter / setter

	public void display1() {
		System.out.printf("%02d : %02d : %02d\n", hour, minute, second);
	}

	public void display2() {
		System.out.printf("%02d시 %02d분 %02d초\n", hour, minute, second);
	}

	public void display3() {
		String am_pm = "";
		if (0>hour || hour > 24) {
			System.out.println("잘못된 시간입니다");
		}else {
			if (hour >= 0 && hour <= 12) {
				am_pm = "오전";
			} else if (hour > 12) {
				this.hour = hour - 12;
				am_pm = "오후";
			}
			System.out.printf("%s %02d : %02d : %02d\n", am_pm, hour, minute, second);
			
		}

	}

}
