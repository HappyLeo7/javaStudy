package mymain;

public class _07_문자열 {
	public static void main(String[] args) {
		//문자열 :String
		//상수(리터럴) : "ABC" <- 'A' 'B' 'C'
		//출력서식  : %s
		
		String name = "ㅎㅗㅇㄱㅣㄹㄷㅗㅇ";
		System.out.printf("이름: %s\n", name);
		
		String str= "우리나라대한민국";
		//m.ns : m(전체자릿수) n(출력문자수);
		System.out.printf("%.4s\n", str);
	}
}
