package myutil;

public class Eagle implements Bird{

	@Override
	public String fly() {
		return "독수리가 날아갑니다";
	}

	@Override
	public String eat() {
		return "독수리가 토끼를 잡아먹습니다.";
	}

}
