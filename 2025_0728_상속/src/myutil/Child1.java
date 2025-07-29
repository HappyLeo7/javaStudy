package myutil;

public class Child1 extends Parent1{ //상속
	// @이름 : annotation(어노테이션) (프로그램 주석 : 꼬리표)
	// 재정의 : Method Override
	//         조건1) 1. 메소드 이름과 파라메터정보가 동일 해야함
	//		   조건2) 2. 접근제한자는 크거나 같아야 함
	@Override // <= 어노테이션
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("---Child1.sub() call---");
	}

	/** 
	 합을 구할수 있는 메소드 */
	@Override
	public void sub(int n) {
		// TODO Auto-generated method stub
		super.sub(n);
	}
	
	
}
