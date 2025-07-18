package mymain;

import java.util.Scanner;

public class MyMain_Array1_활용1 {
	
	public static void main(String[] args) {
							//        0  1  2  3  4  5  6  7  8  9 10 11 <-index : month-1
							//		  1  2  3  4  5  6  7  8  9 10 11 12 <-month 
		int[] month_array= new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int month;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
		System.out.print("월: ");
		month = scanner.nextInt();
		if(0<month&&month<=12) {
		
			int lastday=month_array[month-1];
			
			System.out.printf("[%d]월의 마지막날은 [%d]일 입니다.\n", month,lastday);
		}else {
			System.out.println("다시입력해");
			
		}
		
		
		}while(true);
//		scanner.close();
		
	}
	
}
