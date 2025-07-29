package mymain;

class A{
	void sub() {};
	final void final_sub() {}; //final 하면 메소드 재정의 금지선언
}
final class B extends A{
	void sub() {}
	//Cannot override the final method from A
	//void final_sub(){}; //재정의가 불가능
}
//The type C cannot subclass the final class B
//class C extends B{ //B클래스를 final 했기 때문에 더이상 확장이 불가
//	
//}


//class MyString extends String{
//	
//}

public class MyMain_final {

	public static final double PI=3.141592; 
	
	// final
	// 1.final 변수 : 상수선언
	// 2. final method : 재정의 금지
	// 3. final class : 상속금지
	
	public static void main(String[] args) {
		//The final field MyMain_final.PI cannot be assigned
		//XXX 선언불가
		//PI =3.14;
	}
}
