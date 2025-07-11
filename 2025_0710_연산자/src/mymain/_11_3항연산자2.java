package mymain;

import java.util.Scanner;

public class _11_3항연산자2 {
	public static void main(String[] args) {
	
		int kor;
		String grade="F";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어: ");
		kor = scanner.nextInt();
		
		//0~100
		if(kor>=0&&kor<=101) {
			grade = (kor==101)? "조기졸업" : (kor>=95)? "A+": (kor>=90)? "A": (kor>=87)? "A-": 
						(kor>=85)? "B+":(kor>=80)?"B": (kor>=77)?"B": 
							(kor>=75) ? "C+": (kor>=70) ? "C": (kor>=67) ? "C": 
						(kor>=65) ? "D+" : (kor>=60) ? "D(재수강불가)" :"F(재수강가능)";
			System.out.printf("국어 점수 : %d (점) / 등급 : %s\n", kor , grade);
 		}else {
 			System.out.println("잘못된 성적이 입력되었습니다.");
 			
 		}
		
		
		scanner.close();
	}
}
