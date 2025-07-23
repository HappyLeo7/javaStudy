package mymain;

public class MyMain_02_String2_문자열_불변적특징 {
 public static void main(String[]args  ) {
	 //문자열 불변적특징
	 String str ="i am groot";
	 
	 System.out.println(str);
	 
	 //원본데이터를 이용해서 대문자로 바꾼 새로운 객체 생성
	 String str1 = str.toUpperCase(); //대문자로 변환
	 
	 System.out.println(str);
	 System.out.println(str1);
	 
	 //원본데이터 + 새로운 문자열이 결합된 새로운 객체가 생성
	 String str2 = str + " You are a Jane?";
	 
	 System.out.println(str);
	 System.out.println(str2);
	 
 }
		 
}
