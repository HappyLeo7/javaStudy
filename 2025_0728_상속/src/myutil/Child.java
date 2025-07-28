package myutil;

public class Child extends Parent{

	protected int c_money;

	//Child child =new Child();
	public Child(){
		super(); // 생략되어있는거다. Parent() call
		System.out.println("----Child()----");
		c_money=300000;
	}
	
	//Child child =new Child(50000000);
	public Child(int c_money) {
		super(); // Parent() call
		System.out.println("----Child(c_money)----");
		this.c_money=c_money;
	}

	
	//Child child =new Child(999999999,50000000);
	public Child(int p_money, int c_money) {
		// 부모껀 부모가 초기화 할수 있게 하는 구조가 좋다
		super(p_money); //Parent call
//		super.p_money=p_money;
		System.out.println("----Child(p_money,c_money)----");
		this.c_money=c_money;
	}
	
	public void display() {
		super.display();
		System.out.printf("Child's c_money=%d\n",c_money);
	}
}
