package myutil;

// 자바의 모든 객체는 Object 로 부터 상속 받는다.
public class BaseCalc /* extends Object */ {
	//BaseCalc는 4개의 기능을 가지고 있다
	
	
	public int plus(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public int divide(int a, int b) {
		return b==0? 0:a / b;
	}
}
