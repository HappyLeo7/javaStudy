package mymain;

import java.util.*;

public class _09_일반논리연산자3 {
	public static void main(String[] args) {
		//1. 년도를 입력받는다.
		//2. 윤년/평년 구한다.
		
		// 조건1. 4의 배수 이면서 100의 배수가 아닌것
		// 조건2. 400의 배수 
		
		
		System.out.println("몇년도 입니까?");
		Scanner scanner = new Scanner(System.in);
		int year=scanner.nextInt();
		boolean condition1 = (year%4==0)&&(year%100!=0);
		boolean condition2 = (year%400==0);
		if(condition1 || condition2) {
			System.out.print(year+"년은 윤년입니다.");
		}else {
			System.out.printf("%d년은 평년입니다.",year);
			
		}
		
		
		
		
		
		
		scanner.close();
		
	}
}
