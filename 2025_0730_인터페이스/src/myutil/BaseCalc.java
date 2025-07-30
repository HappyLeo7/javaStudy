package myutil;


/**
 * 인터페이스는 사용자를 위한 설명서 이다.
 */
public interface BaseCalc {
	//  상수/추상메소드(body 가 없는 메소드)/default 메소드
	// 인터페이스내의 모든 항목의 접근제한자는 public 
	// 모든 변수는 static final 로 정의 된다.
	public static final double PI2=3.14;
						double PI = 3.14;
						
	// 모든 메소드는 abstract 추상 메소드로 정의된다.
	public abstract int plus2(int a, int b);
					int plus(int a, int b);
					int minus(int a, int b);
					
	// default 메소드는 jdk8.0 버전에서부터 지원
	// optional 메소드(필요에 따라서 Override 해라)
	default int hap(int n) {return 0;};
	
}
