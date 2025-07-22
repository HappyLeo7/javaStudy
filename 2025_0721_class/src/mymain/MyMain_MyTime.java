package mymain;

import myutil.MyTime;

public class MyMain_MyTime {
	public static void main(String[] args) {
		
		MyTime time0=new MyTime();
		MyTime time1=new MyTime(16,4,33);
		MyTime time2=new MyTime(5);
		MyTime time3=new MyTime(17);
		
		System.out.println("[현재시간]");
		time0.display1();
		time0.display2();
		time0.display3();
		System.out.println();
		System.out.println("[16,4,33]");
		time1.display1();
		time1.display2();
		time1.display3();
		System.out.println();
		System.out.println("[5]");
		time2.display1();
		time2.display2();
		time2.display3();
		System.out.println();
		System.out.println("[17]");
		time3.display1();
		time3.display2();
		time3.display3();
		System.out.println();
		time0.display4();
		
	}
}
