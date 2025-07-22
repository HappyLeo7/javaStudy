package mymain;

import myutil.MyTime2;

public class MyMain_MyTime2 {
	int m=0;
	public static void main(String[]args) {
		
			MyTime2 time = new MyTime2();
			time.display4();

			MyTime2 time2 = new MyTime2(15);
			time2.display4();

			MyTime2 time3 = new MyTime2(18,30);
			time3.display4();
			
	}
}
