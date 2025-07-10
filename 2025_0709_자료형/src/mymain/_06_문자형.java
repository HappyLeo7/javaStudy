package mymain;

public class _06_문자형 {
	public static void main(String [] args) {
		//문자형 자료형 : char
		// 상수 (리터럴) : 'A' '9' '한' '韓'
		//출력서식 : %c
		// ASCII (American Standard Code for Information Interchange)
		// 0~31 : 제어및 통신문자
		//			\r : carriage return (HOME 키)
		//			\n : new line (Enter 키)
		//			\t : Tab
		//			\b : left arrow (빽키?) 
		// 32~126 : 일반문자 (영문자/숫자/기호..)
		//			'A':65  'a':97  '0':48  '공백':32
		
		System.out.printf("%c\n",65);
		
		char ch ='한';					      //(타입) <-강제형변환연산자
		System.out.printf("%c's code : %d\n",ch,(int)ch);
		
		System.out.printf("%c\n",54620);
		System.out.printf("%c\n",'한');
		
		
		// %n : java 에서 OS 에 맞게 해석처리
		// \n : 있는 그대로 해석
		//윈도우에서 엔터 : \r\n
		//유닉스계열 운영체제 : \n
		
		System.out.println("A\nB\nC\n");
		System.out.println("A\tB\tC\n");
		System.out.println("ABC\b\bX\n");
		System.out.println("A\rB\rC\r");
		
	}
}
