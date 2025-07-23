package myutil;

public class MySingleton {
	
	//TODO Singleton 구현
	static MySingleton single =null;
	
	public static MySingleton getInstance() {
		
		//XXX 객체가 없으면 생성해라
		if(single==null) {
			single= new MySingleton();
		}
		return single;
	}
	
	//XXX 싱글톤 사용시 생성자는 private으로 해야한다.
	private MySingleton(){
		System.out.println("==MySingleton()==");
	}
	
	
	public void display_line() {
		System.out.println("-----------------------");
	}
}
