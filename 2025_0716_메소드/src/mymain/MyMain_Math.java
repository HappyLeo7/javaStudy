package mymain;

public class MyMain_Math {

	// public : 접근 허용
	// static : 미리 다 만들어둔다 메소드를 미리 만들어둔다. 자원의 활용성
	// 접근제한자 정적 반환형 메소드명(인자1,인자2)
	public static int plus(int a, int b) {
							//int a =x int b=y 가인자
		int c = a + b;

		return c;
	}

	// void (무취형) :
	public static void main(String[] args) {

		int x = 10, y = 5;
		// 클래스명,메소드명()
		int result = MyMain_Math.plus(x, y);// 실인자
		System.out.printf("%d+%d = %d\n", x, y, result);

	}
}
