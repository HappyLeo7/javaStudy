package mymain;

import myutil.MyInteger;

public class _03_쉬프트연산자 {
	public static void main(String [] args) {
		
		int n = 10;
		System.out.printf("[%32s]:n\n", MyInteger.toBinaryString(n));
		// >> 오른쪽으로 2번 밀고 나머지는 부호비트로 채워준다. 양수기때문에 0으로 채워준다.
		System.out.printf("[%32s]:n>>2\n", MyInteger.toBinaryString(n>>2));
		
		System.out.printf("[%32s]:n<<2\n", MyInteger.toBinaryString(n<<2));
		
		n=-1;
		System.out.printf("[%32s]:n\n", MyInteger.toBinaryString(n));
		System.out.printf("[%32s]:n>>4\n", MyInteger.toBinaryString(n>>4));
		System.out.printf("[%32s]:n<<4\n", MyInteger.toBinaryString(n<<4));
		// -1 은 아무리 밀어도 부호 비트 1로 채워지기 때문에 항상 -1이다.
		System.out.printf("[%32s]:n>>100\n", MyInteger.toBinaryString(n>>100));
		// >>> 은 밀고 새로운 공간에 무조건 0으로 채워준다.
		System.out.printf("[%32s]:n>>>4\n", MyInteger.toBinaryString(n>>>4));
	}
}
