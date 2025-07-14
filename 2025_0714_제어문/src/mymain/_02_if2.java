package mymain;

import java.util.Scanner;

public class _02_if2 {
	public static void main(String[]a) {
		String weekday;
		
		String job="";
		String food="";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요일 : ");
		weekday = scanner.next();
		
		// == 같은지 비교하는건 일반적으로 : primitive (기본형) 자료형
		// String 같은 객체형자료형의 체크 : String변수.equals()를 사용한다.
		if(weekday.equals("월")) {
			job="제어문 공부한다.";
			food="제육볶음";
		}else if(weekday.equals("화")) {
			job="제어문(while) 공부한다.";
			food="순대국";
		}else if(weekday.equals("수")) {
			job="클래스(메소드) 공부한다.";
			food="부대찌개";
		}else if(weekday.equals("목")) {
			job="클래스(생성자) 공부한다.";
			food="초밥";
		}else if(weekday.equals("금")) {
			job="클래스(static) 공부한다.";
			food="삼겹살+소주";
		}else if(weekday.equals("토")||weekday.equals("일")) {
			job="휴식(잠자기+영화보기)";
			food="짜파게티";
		}
		
		System.out.printf("%s(요일) \n일정:%s \n점심:%s\n",weekday,job,food);
		
		
		scanner.close();
		
	}//main_end
}
