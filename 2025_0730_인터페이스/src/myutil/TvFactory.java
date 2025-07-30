package myutil;

public class TvFactory {
	
	//싱글톤 변수 만들기
	static TvFactory single = null;
	
	//공개 미리만들어진 팩토리타입 싱글톤을 통해서 객체 생성하는 메서드 만들기
	public static TvFactory getInstance() {
			if(single==null) {
				single=new TvFactory();
			}
		return single;
	}
	
	//생성자 비공개
	private TvFactory() {
		
	}
	
	//공통된 타입 기능이 있는 클래스 객체 생성
	public RemoteCon getTv() {
		
		return new TV();
	}
	
	
}
