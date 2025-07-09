package mymain;

public class _02_정수형 {
	public static void main(String[] args) {
		//정수형 자료형 : byte short  int(기본형)  long
		//상수(리터럴)  : 1  0  <- 소숫점이 없는 수 
		//			 : 1L <- long
		//출력서식     : %d (decimal : 10진수 출력)
		//           : %o (octal   :  8진수 출력)
		//           : %x (hexa    : 16진수 출력)
		
		System.out.printf("10진수 : %d\n",100);
		System.out.printf(" 8진수 : %o\n",100);
		System.out.printf("16진수 : %x\n",100);
		
		
		// 8진수 표현 : 0144   
		//16진수 표현 : 0x64
		System.out.printf("0144 : %d\n",0144);
		System.out.printf("0x64 : %d\n",0x64);
		
		//변수 선언
		//자료형 변수명 : 
		int n =123;
		//Type mismatch: cannot convert from int to byte
//		byte b1=200;
		byte b1=100;
		
		//자릿수를 지정해서 출력
		
		// %정수d : 정수 -> 출력공간의 크기
		System.out.printf("[%10d]\n" , n); //right align 10칸을 띄운다
		System.out.printf("[%010d]\n" , n); //right align 10칸을 띄운다 + 빈공견에 0으로 출력
		System.out.printf("[%-10d]\n" , n); //left align
		
		System.out.printf("[%5d]\n" , n); //left align
		
	}
}
