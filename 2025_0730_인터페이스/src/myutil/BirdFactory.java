package myutil;

public class BirdFactory {
 //싱글톤 변수
	static BirdFactory single =null;
	
	//메소드
	public static BirdFactory getInstence() {
		if(single==null) {
			single=new BirdFactory();
		}
		
		return single;
	}
	
	//생성자 비공개 (new 를 방지하기위해서)
	private BirdFactory() { 
		
	}
	
	//new Eagle() , new Sparrow()
	public Bird getEagle() {
		return new Eagle();
	}
	public Bird getSparrow() {
		return new Sparrow();
	}
	
}
