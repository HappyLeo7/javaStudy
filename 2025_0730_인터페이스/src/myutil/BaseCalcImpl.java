package myutil;

public class BaseCalcImpl implements BaseCalc {

	//재정의
	@Override
	public int plus2(int a, int b) {
		return a + b;
	}

	//재정의
	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	//재정의
	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	//interface 에서 default 는 재정의가 필요하면 해도된다.
	@Override
	public int hap(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		;
		return sum;
	}

}
