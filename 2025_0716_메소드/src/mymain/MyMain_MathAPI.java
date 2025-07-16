package mymain;

import myutil.MyMath;

public class MyMain_MathAPI {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 12;
		
		int result;
		result = Math.max(a, b);
		
		System.out.printf("%d,%d중에 큰수는 %d\n", a,b,result);
		
		result = Math.min(a, b);
		
		System.out.printf("%d,%d중에 작은수는 %d\n", a,b,result);
		
		
		System.out.print("==== 내가만든 API====");
		System.out.println();
		result= MyMath.max(a, b);
		System.out.printf("%d,%d중 큰수는 %d 이다\n",a,b,result);
		
		//3개의 수중 큰수 구하기
		a=2;b=1;c=3;
		result= MyMath.max(a, b, c);
		System.out.printf("%d,%d,%d중 큰수는 %d 이다\n",a,b,c,result);
		
		//1~n까지의 합
		int n=100;
		result=MyMath.hap(n);
		System.out.printf("%d까지의 합은[%d]이다\n",n, result);
		
		//1~n까지의 m의 배수의 합
		int m=3;
		n=10;
		result=MyMath.hap(n, m);
		System.out.printf("%d까지의 %d의 배수의 합은[%d]이다\n",n,m,result );
		
		//1~n까지의 홀수의 합
		n=3;
		result=MyMath.hap(n);
		System.out.printf("%d까지의 홀수의 합은[%d]이다\n",n,result );
		
		//fatorial : 4!
		double num=4.0;
		double result1=0.0;
		result1=MyMath.factorial(num);
		System.out.printf("%.0f의 fatorial은 [%.0f]이다\n",num, result1);
		
		//m's n승
		n=5;
		m=2;
		result1=MyMath.pow(n, m);
		System.out.printf("%d's %d승은 [%.0f]이다\n",m,n,result1);
		
		//솟수의 합
		result=MyMath.prime(n);
		System.out.printf("%d", result);
			
		
		
	}
}
