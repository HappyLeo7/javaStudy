package mymain;

import java.util.Scanner;

public class _98_문제2_이름을숫자로쓰기 {
	public static void main(String[] args) {

		// Q1. 이름을 숫자로 출력
		char s = '서';	
		char k = '경';
		char w = '원';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10진수 : [");
		System.out.print((int)s);
		System.out.print(".");
		System.out.print((int)k);
		System.out.print(".");
		System.out.print((int)w);
		System.out.print("]\n");
		
		System.out.print("2진수 :[");
		System.out.print(Integer.toBinaryString(s));
		System.out.print(".");
		System.out.print(Integer.toBinaryString(k));
		System.out.print(".");
		System.out.print(Integer.toBinaryString(w));
		System.out.print("]\n");
		
		System.out.print("16진수 :[");
		System.out.print(Integer.toHexString(s));
		System.out.print(".");
		System.out.print(Integer.toHexString(k));
		System.out.print(".");
		System.out.print(Integer.toHexString(w));
		System.out.print("]\n");
		
		// Q2. 화씨 => 섭씨 바꾸기
		//(1°C × 9/5) + 32 = 33.8°F
		//(1°F − 32) × 5/9 = -17.22°C
		
		double fahrenheit=0 ;
		double celsius =0;
		
		System.out.print("\n");
		System.out.println("섭씨(℃)를 적어주세요");
		celsius=scanner.nextDouble();
		 fahrenheit=(celsius * 9.0/5.0)+32.0;
		 System.out.println("화씨 : ["+fahrenheit+"]℉");
		 
		 
		 System.out.print("\n");
		 System.out.println("화씨(℉)를 적어주세요");
		 fahrenheit=scanner.nextDouble();
		 celsius=(fahrenheit-32.0)*5.0/9.0;
//		 System.out.println("섭씨 : ["+celsius+"]℃ 일때 화씨 : ["+fahrenheit+"]");
		 System.out.printf("섭씨 : [%.1f]℃ 일때 화씨 : [%.1f]]℉",celsius,fahrenheit);


		scanner.close();
		
	}
}
