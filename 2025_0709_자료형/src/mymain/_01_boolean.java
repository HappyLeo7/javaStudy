package mymain;

public class _01_boolean {

	public static void main(String[] args) {
		
		//논리형 자료형 : boolean
		//상수 : true or false (리터럴)
		//출력서식 : %b or %B
		//        cf)줄바꾸기 서식 : %n , \n
		boolean a= true;
		boolean b= false;
		System.out.printf("%b %n %B\n", a,b );
		
		// 변수 선언
		// 자료형 변수명
		boolean b0k;
		b0k = 3>2;
		System.out.printf("3>2:%b\n", b0k);
		
		b0k ="파리"=="새";
		System.out.printf("파리==새 : %B\n",b0k );

		b0k ="파리"=="파라";
		System.out.printf("파리==파라 : %B\n",b0k );
		
		//상수 선언 final
		           //(상수) = (리터럴)
		final boolean bMan = true;
//		bMan=false;
		double PI = 3.14;
	}
}
