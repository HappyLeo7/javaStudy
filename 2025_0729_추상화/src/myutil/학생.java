package myutil;

public abstract class 학생 {
	int 학년;
	int 학번;

	void 공부한다() {
		// method body
	};
	
	//추상메소드 : 
	public abstract void 공부하기(); // abstract는 메소드를 추상화해준다. 추상메소드는 바디{}가 필요없다
}
