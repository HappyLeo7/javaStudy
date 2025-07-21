package mymain;

import myutil.MyDate;

public class MyMain_MyDate{
	public static void main(String[] args) {
		//   참조변수= new 클래스명() <-객체
		//          MyDate의 인스턴스(객체)       
		MyDate date= new MyDate();
		
		// public 변수
		date.year=2025; // public 변수를 통해서 바로 했기때문에 룰에 어긋난다.
		date.setYear(2025); //우회하여서 변수에 접근하는 방법을 사용해라
		
		// The field MyDate.month is not visible
		// MyDate클래스 필드에서 month가 보이지 않습니다.
		// protected 변수인데 같은 패키치가 아니고 자식클래스가 아니라 불가
		//date.month=7;
		date.setMonth(7);
		
		// The field MyDate.day is not visible
		// private 변수는 사용불가
		//date.day=21;
		date.setDay(21);
		
		// default 변수는 패키지가 같아야 사용 가능
		//date.weekday=2;
		date.setWeekday(2);
		
		date.display();
		
		//값 얻어오기
		int year =date.getYear();
		
		int month = date.getMonth();
		int day = date.getDay();
		int weekday = date.getWeekday();
		
		System.out.printf("년도:%d\n월:%d\n일:%d\n요일:%d\n", year,month,day,weekday);
	}
}
