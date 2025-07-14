package mymain;

import java.util.Scanner;
public class _04_switch2 {
	public static void main(String[] args) {
		
		//  1  2  3  4  5  6  7  8  9 10 11 12
		// 31 28 31 30 31 30 31 31 30 31 30 31
		
		int month;
		int lastday;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("월: ");
		month = scanner.nextInt();
		
		//JDK 14이상
		//람다식은 화살표 오른쪽 값이 바로 리턴되기때문에 break를 넣지 않아도 탈출한다.
		lastday = switch(month)
				{ 
				case 1,3,5,7,8,10,12 ->{ yield 31;}
				case 4,6,9,11 ->{ yield 30;}
				default ->{ yield 28;}
				};
				
		
		System.out.printf("[%d]월은 [%d]일까지 있습니다\n", month,lastday);
				
		scanner.close();
	}
}
