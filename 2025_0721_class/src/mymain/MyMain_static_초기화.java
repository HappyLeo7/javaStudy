package mymain;

public class MyMain_static_초기화 {
	
	//TODO static 초기화 부분
	static {
		System.out.println("---0. 무슨소리 내가 먼저 실행되는데 ---");
		System.out.println("---(main 실행전 준비과정 여기서 처리)---");
		System.out.println("---(DB Driver 초기화 / 이미지 로드)---");
		
	}
	
	public static void main(String[] args) {
		System.out.println("---1. main() 내가 제일 먼저 실행된다.---");
	}
}
