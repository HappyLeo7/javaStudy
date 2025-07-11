package mymain;

import myutil.MyInteger;

public class _05_이진논리연산자 {
	public static void main(String[] args) {
		
		int a =7;
		int b=5 ;
		
		System.out.printf("[%32s] : %d\n",MyInteger.toBinaryString(a),a);
		System.out.printf("[%32s] : %d\n",MyInteger.toBinaryString(b),b);
		System.out.printf("[%32s] : %d & %d \n",MyInteger.toBinaryString(a&b),a,b);
		System.out.printf("[%32s] : %d | %d \n",MyInteger.toBinaryString(a|b),a,b);
		System.out.printf("[%32s] : %d ^ %d \n",MyInteger.toBinaryString(a^b),a,b);
	}
}
