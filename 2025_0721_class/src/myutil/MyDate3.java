package myutil;

/*
 * 생성자(Constructor) Method
 * 1. 객체생서시 자동호출되는 메소드(1회)
 * 2. 객체내에 변수 및 기타 초기화 기능 수행
 * 3. 형식) 클래스명()
 * 		   반환형은 없다.
 * 4. 생성자는 생략가능함(생성자가 모두 없을시에만)
 * 	 (생략시 JVM에 의해서 기본생성자를 만들어서 처리함 하지만 overload 된 생성자가 있으면 기본생성자를 만들어 주진 않는다.)
 * 5. Method Overload 가능하다(중복선언)
 * */


public class MyDate3 {
	//main 에서 new 했기 때문에 heap 메모리에 저장되어서 자동으로 아래 변수를 초기화시켜줌
	 int year;
	 int month;
	 int day;
	 
	 //반환형이 안들어가야 생성자로 사용이 가능하고 초기화 시킬수 있다.
	 //생성자는 클래스명() 이다.
	 //기본생성자 (default constructor)
	 public MyDate3() {
		 //객체 생성시 자동 호출
		 System.out.println("---MyDate3()---");
		 
		 year=2025;
		 month=day=1;
	 }
	 
	 public MyDate3(int year,int month,int day) {
		 this.year=year;
		 this.month=month;
		 this.day=day;
	 }

	 public MyDate3(int year) {
		 this.year=year;
		 month=8;
		 day=8;
	 }
	 
	 public MyDate3(int year,int month) {
		 this.year=year;
		 this.month=month;
		 this.day=01;
	 }
	 
	 public void display() {
		 System.out.printf("%04d-%02d-%02d\n", year,month,day);
	 }
}
