package mymain;

import java.util.Scanner;

public class _06_for2 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int dan=0;
		System.out.print("단 : ");
		dan = scanner.nextInt(); 
		
		//입력한 값을 검증
		if ( !(2<=dan&&dan<=9)) {
			System.out.print("dan은 2~9사이 값만 입력하세요");
			return; //종료
		}
		
		// dan * i = (dan * i)
		//  5  * 1 =   5
		//  5  * 2 =   10
		
		for(int i=1; i<=9 ;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
}
