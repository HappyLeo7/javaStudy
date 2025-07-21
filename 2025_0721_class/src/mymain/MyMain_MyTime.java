package mymain;

import myutil.MyTime;

public class MyMain_MyTime {
	public static void main(String[] args) {
		
		MyTime time0=new MyTime();
		MyTime time1=new MyTime(16,4,33);
		MyTime time2=new MyTime(5);
		MyTime time3=new MyTime(17);
		
		time0.display3();
		time1.display1();
		time1.display2();
		time1.display3();
		time2.display3();
		time3.display3();
		
	}
}
