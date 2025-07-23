package myutil;

public class MyMath {
	// 두수중에 큰수 구해라
	public static int max(int a, int b) {
		int re = 0;
		re = (a >= b) ? a : b;

		return re;
	}

	// 세수중에 큰수 구해라
	public static int max(int a, int b, int c) {
		int re = 0;
		re = a > b ? a : b;
		re = c > re ? c : re;

		if (a > b) {
			re = a;
		} else {
			re = b;
		}
		if (re < c) {
			re = c;
		}

		return re;
	}

	//TODO 재귀호출을 이용한 합구하기
	public static int hap_recursive(int n) {
		if(n==0)return 0;
		return n+hap_recursive(n-1);
	}
	
	// 1~n까지의 합
	public static int hap(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// 1~n까지의 m의 배수의 합
	public static int hap(int n, int m) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	// 1~n까지의 홀수의 합
	public static int odd_hap(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (!(i % 2 == 0)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	// fatorial: 4! 4*3*2*1 1*2*3*4
	public static double factorial(double n) {
		double multiplication = 1.0;
		for (double i = 1.0; i <= n; i++) {
			multiplication = multiplication * i;
		}
		return multiplication;
	}

	// m's n승
	public static double pow(int n, int m) {
		double re = 1.0;
		for (int i = 0; i < n; i++) {
			re = re * m;
		}
		return re;
	}

	// 솟수의 합
	public static int prime(int n) {
		int sum = 0;
		// 2 3 5 7 
		for (int i = 1; i <= n; i++) {
			
		}
		return sum;
	}

}// MyMath_end
