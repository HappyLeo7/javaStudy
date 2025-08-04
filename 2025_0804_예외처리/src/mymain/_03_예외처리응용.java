package mymain;

import java.util.Scanner;

public class _03_예외처리응용 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int su=5;
		while (true) {
			
			try {
				System.out.print("숫자입력하세요(종료:0): ");
				su = scanner.nextInt();//입력 오류가 나면 바로 catch부분으로 빠진다.
				
				if(su==0)break;
				System.out.printf("입력된 숫자는 [%d]입니다.\n",su);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				scanner.nextLine();
				e.printStackTrace();
				System.out.println("숫자만 입력하세요");
				
//				System.out.println(su);
//				
//				su=0;
				
			}
			
		}//end : while
		
		scanner.close();
		System.out.println("----[End]----");
	}//end : main
}
