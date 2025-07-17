package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_Array1 {
	public static void main(String [] args) {
		
		// 1차원 배열
		//stack에 선언한 변수는 초기화가 안된다. (직접 초기화 해야함)
		int n=0;
		
		//heap에 할당된 변수는 자동초기화 된다.
		//정수형 : 0
		//실수형 : 0.0
		//boolean : false
		//참조형 : null
		
		//mr은 참조변수도
		int [] mr = new int[4];
		
		mr[0]=1;
		mr[1]=2;
		mr[2]=3;
		mr[3]=4;
		
		MyArrays.display(mr);
		System.out.println(mr[3]);
		System.out.println(mr);
		System.out.println("[I@58372a00");
		System.out.println(n);
		
		Arrays.fill(mr,0);
		MyArrays.display(mr);
		MyArrays.fill(mr, 0);
		MyArrays.display(mr);
		
		
	}
}
