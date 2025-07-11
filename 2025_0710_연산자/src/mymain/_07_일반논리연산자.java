package mymain;

public class _07_일반논리연산자 {
	public static void main(String[] args) {
		//일반논리연산자 : &&  ||
		System.out.println("------[ && ]------");
		System.out.printf("true && true : %b\n", true && true);
		System.out.printf("true && false : %b\n", true && false);
		System.out.printf("false && false : %b\n", false && false);

		
		System.out.println("------[ || ]------");
		System.out.printf("true || true : %b\n", true || true);
		System.out.printf("true || false : %b\n", true || false);
		System.out.printf("false || false : %b\n", false || false);
	}
}
