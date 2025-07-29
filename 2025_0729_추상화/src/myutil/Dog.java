package myutil;

public class Dog extends Animal{
	@Override
	public void animal_name() {
		System.out.println("[강아지]");
	}
	@Override
	public void cry() {
		System.out.println("울음:왈왈");
	}
	@Override
	public void eat() {
		System.out.println("밥:사료");
	}
	
}
