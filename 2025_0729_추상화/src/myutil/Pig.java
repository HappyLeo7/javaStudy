package myutil;

public class Pig extends Animal {
	
	@Override
	public void animal_name() {
		System.out.println("[돼지]");
		
	}
	@Override
	public void cry(){
		System.out.println("울음:꿀꿀꿀");
	}
	@Override
	public void eat() {
		System.out.println("밥:꿀꿀이죽");
	}
	
}
