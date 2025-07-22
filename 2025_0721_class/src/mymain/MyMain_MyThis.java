package mymain;

import myutil.MyThis; 

public class MyMain_MyThis {
	public static void main(String[] args) {
		
		MyThis my = new MyThis();
		MyThis my2 = new MyThis();
		
		
		my.displayThis(); // 내부 this
		System.out.println("외부에서 my:   "+my); // 외부 this
		
		my2.displayThis(); // 내부 this
		System.out.println("외부에서 my2:   "+my2); // 외부 this
	}
}
