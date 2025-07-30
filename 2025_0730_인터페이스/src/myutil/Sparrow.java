package myutil;

public class Sparrow implements Bird{

	@Override
	public String fly() {
		return "참새가 날아갑니다.";
	}

	@Override
	public String eat() {
		return "참새가 벌레를 먹습니다.";
	}

}
