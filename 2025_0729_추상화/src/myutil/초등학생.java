package myutil;
//XXX The type 초등학생 must implement the inherited abstract method 학생.공부하기() 
// 재정의 필요
public class 초등학생 extends 학생{
	
	@Override
	public void 공부하기() {
		System.out.println("초등학생 : 구구단");
	}

	
}
