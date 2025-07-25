package mymain;

import java.util.Scanner;

import myutil.BaseBall;

public class MyMain_야구게임 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] user_no = new int[3];
		int out_count = 0;
		BaseBall baseBall = new BaseBall();
		baseBall.make_no();
		while (out_count < 10) {
			
			System.out.print("숫자 1~9중 3개 입력 :");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			
			// 유효성 체크
			baseBall.setUser_no(user_no);
			String result = baseBall.check1();
			System.out.println(result);
//			int result2 = baseBall.check2();
//			System.out.println(result2);
			out_count++;
			
			if(baseBall.end==0||user_no[0]==0) {
				break;
			}
			System.out.printf("아웃 카운트 : (%d)\n",out_count);
		}
		System.out.print("[---게임종료---]");
	}
}
