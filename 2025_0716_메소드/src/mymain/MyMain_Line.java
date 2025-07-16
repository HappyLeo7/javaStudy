package mymain;

import myutil.MyLine;
public class MyMain_Line {

	/*
		메소드 호출방법에 따른분류
		1. Call By name
		2. Call By Value
		3. Call By Reference
	*/
	public static void main(String[] args) {
	   MyLine a=new MyLine();
		System.out.printf("%20s\n","[성적관리]");
		
		int line_length =45;
		MyLine.drawLineTop();//System.out.println("┌────────────────────────────────────┐");
		System.out.println("│  N │   이름은  │  ko  │  eg  │   mt  │   SUM  │");
		System.out.println("│------------------------------------│");
		System.out.println("│  1 │   홍길동  │  99  │  89  │   70  │");
		MyLine.drawLine();
		System.out.println("│  1 │   홍길동  │  99  │  89  │   70  │");
		a.drawLine();
		System.out.println("│  1 │   홍길동  │  99  │  89  │   70  │");
		MyLine.drawLine(line_length);
		System.out.println("│  1 │   홍길동  │  99  │  89  │   70  │");
		MyLine.drawLineMid();//System.out.println("├────────────────────────────────────┤");
		System.out.println("│  S │         │ ???  │ ???  │  ???  │");
		MyLine.drawLineBottom();//System.out.println("└────────────────────────────────────┘");
		MyLine.drawLine(line_length);
		MyLine.drawLine('=',line_length);
		
		MyLine.drawLine('*',2,'-',3,10);
		MyLine.drawLine('*',5,'-',3,'=',2,100);
		
		
		// 패턴
		// *--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-
		// **--**--**--**--**--**--**--**--**--**--**--**-
		// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
		
	}
}
