package mymain;

import myutil.MyInteger;

public class _01_단항연산자 {
	public static void main(String[] args) {
		// 단항연산자 : ~ ! ++ -- (cast) -(부호)
		// ~ (tilde) : 이진논리 Not 연산자 (1의 보수)

		int n = 10;
		System.out.printf("[%32s]\n", Integer.toBinaryString(n)); // Integer.toBinaryString(n)
		System.out.printf("[%32s]\n", Integer.toBinaryString(~n));
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(n));

		n = 0xf0f0f0f0;
		System.out.printf("[%32s]\n", Integer.toBinaryString(n)); // Integer.toBinaryString(n)
		System.out.printf("[%32s]\n", Integer.toBinaryString(~n));

		// ! : 일반 논리 Not 연산자
		boolean b0k = !true;
		int a = 3, b = 2;
		boolean b1k = !(a > b);
		System.out.printf("!(%d>%d) : %b\n", a, b, b1k);

		// ++ -- 증감연산자, 감소연산자
		// ++변수 : 전위형 (모든연산에 앞서 먼저 연산)
		// 변수++ : 후위형 (모든연산이 끝나고 마지막에 연산)
		int m = 10;
		System.out.printf("++m : %d  , m++ : %d\n", ++m, m++);

		// 형변환(Type Conversion)
		/*
		 * 1. 자동형변환(Promotion) : 묵시적형변환 1)대입(치환)시 변수=값 (좌)=(우) 좌변항의 타입으로 맞춰진다.(조건 : 좌변항에
		 * 클경우 [좌>우])
		 * 
		 * 2)연산시 : ㅏㅈ료형이 큰쪽으로 맞춰진다.
		 * 		1+1.0
		 */

		// 1.자동/대입시형변환
		double d = 100; // int -> double : 100 -> 100.0
		
		// 2. 강제형변환
		float f = (float)1.0;
	}
}
