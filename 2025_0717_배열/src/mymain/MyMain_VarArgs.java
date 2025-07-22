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
		//가변인자 : 전달인자가 정해지지 않았다.
		display(10);
		display(10,12);
		display(10,12,13);
		System.out.println();
		
		int result = MyMath.greatest(500,1,3,2,10,12,141,23,111,12,51,5,16,1234274);
		System.out.println("제일큰수 : "+result);
		int result1 = MyMath.least(5,1,3,2,-1);
		System.out.println("제일작수 : "+result1);
		
	}
}
