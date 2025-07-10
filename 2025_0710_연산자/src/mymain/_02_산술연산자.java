package mymain;

public class _02_산술연산자 {
	public static void main(String[] args) {
		//산술연산자
		//	*  /  %
		//	+ -
		
		int a = 10, b=3;
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
		System.out.printf("%d - %d = %d\n",a,b,(a-b));
		System.out.printf("%d * %d = %d\n",a,b,(a*b));
		
		//몫(정수/정수)
		System.out.printf("%d / %d = %d\n",a,b,(a/b));
		
		//나머지 : printf에서 %를 문자로 인식시키려면%%
		System.out.printf("%d %% %d = %d\n",a,b,(a%b));
		
		System.out.println((10/3.0));
		System.out.println((int)(10/3.0));
		System.out.println(Math.floor(10/3.0));
		
		// 피젯수%젯수 : 
		System.out.println(3%10);
	}
}
