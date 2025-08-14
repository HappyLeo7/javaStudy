package itutil;

public class MyConsole {

	String text;
	
	public MyConsole(){
		
	}
	public MyConsole(String text){
		this.text=text;
	}
	public String toString() {
		return String.format("%s", this.text);
	}
}
