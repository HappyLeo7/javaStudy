package mymain;

import myutil.MyMath;

public class MyMain_VarArgs {
	
//	static void display() {
//		
//	}
//	static void display(int n) {
//		
//	}
//	static void display(int n,int m) {
//		
//	}
//	static void display(int n,int m,int a) {
//		
//	}

	//TODO ellipsis : ...  가변인자로 사용 가능
	static void display(int ... nr) {
		//				int [] nr = {10}
		//				int [] nr = {10,12}
		//				int [] nr = {10,12,13}
		
		System.out.print("[");
		for(int n : nr) {
			System.out.printf("%3d",n);
		}
		System.out.print(" ]");
	}
	
	public static void main(String[] args) {
		//TODO 가변인자 : 전달인자가 정해지지 않았다.
		display(10);
		display(10,12);
		display(10,12,13);
		System.out.println();
		
		//TODO Math 는  거의 static 구조로 되어있음
		int m = Math.max(10, 5); 
		
		
		//TODO MyMath는 static 메소드 이므로 클래스를 import 한 후에 아래와 같이 바로 쓸수있다.
		//TODO static 메소드가 아닌 경우에는  new 해서 객체 생성후 사용
		int result = MyMath.greatest(10,2,3,4,50,6,7,80,90);
		System.out.println("제일큰수 : "+result);
		int result1 = MyMath.least(-5,1,3,-2,-1);
		System.out.println("제일작수 : "+result1);
		
	}
}
