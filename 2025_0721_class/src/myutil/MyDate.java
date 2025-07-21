package myutil;

public class MyDate {
	/*
	  
	  	[ Access Modifier(접근제한자) ]
		public : 공개모드 (어디서든 접근이 가능하다.)
		protected : 보호모드
				    1) 동일패키지 허용
	 	            2) 자식클래스 허용
        (생략)     : default
        			1) 동일패키지 허용
        private   : 비공개모드
        
        접근 허용 범위 : public > protected > default > private
	 	            
	 */
	
	
	//Member Field  or 멤버변수 or 인스턴스변수
	//[ Encapsulation(캡슐화) or (은닉화) ]
	//객체지향에서는 변수를 외부로부터 직접 접근하지 못하도록 설계한다.
	public int year;
	protected int month;
	private int day;
			int weekday;
			
	// Setter Method
	// 형식) set + month
	//      setMonth() Camel표기
	public void setYear(int year) {
		this.year=year;
	}
			
	public void setMonth(int month) {
		// this : 객체자신
		this.month=month;
	}
	
	public void setDay(int day) {
		this.day=day;
	}
	
	public void setWeekday(int weekday) {
		this.weekday=weekday;
	}
	
	// Getter Method
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public int getWeekday() {
		return this.weekday;
	}
	
	public void display() {
		System.out.printf("%d-%02d-%02d %d요일\n",year,month,day,weekday);
	}
}
