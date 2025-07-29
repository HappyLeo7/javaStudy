package myutil;

public class Cat extends Animal{
	@Override
	public void animal_name() {
		System.out.println("[고양이]");
	}
	@Override
	public void cry() {
		System.out.println("울음:냐옹");
	}
	@Override
	public void eat() {
		System.out.println("밥:쥐,생선");
	}
	
}
