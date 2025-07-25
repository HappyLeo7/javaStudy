package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_만년달력 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int year;
		int month;
		String y_n="y";
		
		MyCalendar mc =new MyCalendar();
		while(true) {
			System.out.print("년도/월");
			year = scanner.nextInt();
			month=scanner.nextInt();
			
			
			//달력 만들기 -> 출력
			//년월정보 전달
			mc.setDate(year, month);
			
			mc.display();
			
			//계속?
			System.out.print("계속(y/n)");
			y_n=scanner.next();
			if(!y_n.equalsIgnoreCase("y")) {
				break;
			};
		}//end while
		
		System.out.println("[----End----]");
		
		scanner.close();
	}//end main
}
