package mymain;

import myutil.Child;

public class MyMain_Child {
	
	//super   : 부모의 참조변수
	//super() : 부모의 생성자
	
	//초기화 순서 : 부모부터 초기화 
	
	public static void main(String[] args) {
		Child c1 =new Child();
		c1.display();
		
		Child c2 =new Child(150000000);
		c2.display();
		
		Child c3 = new Child(200000000,1000000000);
		c3.display();
	}
}
