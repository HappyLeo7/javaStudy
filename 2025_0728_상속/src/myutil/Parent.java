package myutil;

public class Parent {
	protected int p_money;

	public Parent() {
		super();
		System.out.println("----Parent()----");
		p_money=1000000000;
	}

	// Parent p = new Parent(10000);
	public Parent(int p_money) {
		super();
		this.p_money = p_money;
	}
	
	public void display() {
		System.out.printf("Parent's money=%d\n", p_money);
	}

	
	
}
