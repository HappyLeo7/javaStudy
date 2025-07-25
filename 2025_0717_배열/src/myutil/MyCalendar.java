package myutil;

import java.util.Calendar;

public class MyCalendar {
	//					 1  2  3  4  5  -> month 
	//					 0  1  2  3  4  -> index = month-1
	int [] month_array= {31,28,31,30,31,30,31,31,30,31,30,31};
	int [][]cal_array=null;
	int year;
	int month;
	
	//필드에 데이터 저장
	public void setDate(int year,int month) {
		this.year=year;
		this.month=month;
		
		make_calendar();
	}
	
	
	//year 이 윤년 여부 
	boolean isYoon() {
		//			조건1    or     조건2
		return (year%400==0)||(year%4==0&&(year%100!=0));
	}
	
	int getToralDays() {
		//윤년체크
		if(isYoon()) {
			month_array[1]=29;
		}else {
			month_array[1]=28;
		}
		
		//총날수 1년 1월 1일을 기준으로
		int total_days=0;
		total_days=((year-1)*365);
		
		//윤년에 따른 일수 추가
		total_days+=(year/400) + (year/4) -(year/100);
		//월의수 누적 (전 달까지만 누적)
		for(int i=0;i<month-1;i++) {
			total_days+=month_array[i];
		}
		//해당 달의 1일 추가
		total_days++;
		return total_days;
	}
	
	
	//내부에서 쓰는 메소드이기 때문에 private를 준다.
	// 달력 배열 만들기
	private void make_calendar(){
		
		cal_array = new int [6][7];
		
		int week = 0; //행첨자,세로
		int yoil=0;   //열첨자,가로
		//윤년체크
		if(isYoon()) {
			month_array[1]=29;
		}else {
			month_array[1]=28;
		}
		//방법1)
		//지정된 날짜의 요일 구한다
//		Calendar my_date=Calendar.getInstance();
//		my_date.set(this.year, month-1, 1); //month 0: 1월  1: 2월
//		yoil=my_date.get(Calendar.DAY_OF_WEEK)-1; // 요일 1:sun  2:mon
		
		//방법2)
		yoil=getToralDays()%7;
		System.out.println(yoil);

		// 요일 타이틀 출력
//		String []str_yoil= {"일","월","화","수","목","금","토"};
		System.out.println("-----------------------------");
		String []str_yoil= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		for(int i =0;i<7;i++) {
			System.out.printf("%4s",str_yoil[i]);
		}
		System.out.println("\n-----------------------------");
		
		
		// TODO 방법1) 이전달 날짜 채우기
//		int yoil_m=my_date.get(Calendar.DAY_OF_WEEK)-2;
		if(yoil > 0) {
			int prev_last_day=0;
			if(month==1) {
				prev_last_day=31;
			}else {
				prev_last_day=month_array[month-2];
			}
			for(int i =yoil-1;i>=0;i--) {
				
				cal_array[week][i]=prev_last_day--;
//				yoil_m--;
//				if(yoil_m==-1) {
//					yoil_m++;
//					break;
//				}
			}
		}
		
		//현재월의 마지막 날
		int last_day =month_array[month-1];
		//현재달 달력채우기
		for(int i =1;i<=last_day;i++ ) { // 1 2 3 4 ....마지막 일까지
			cal_array[week][yoil]=i;
			
			//다음칸이동
			yoil++;
			if(yoil>6) {//다음줄로 이동
				week++; //다음행으로 이동
				yoil=0; // 첫번째열로 이동
			}
			
		}//end for(i)
		
//		System.out.printf("%d,%d\n",week,yoil);
		//다음달 출력
		for(int i =1;i<=20;i++) {
			cal_array[week][yoil]=i;
			yoil++;
			if(yoil>6) {
				week++;
				yoil=0;
			}
			if(week>=6) {
				break;
			}
		}
		
		
		
	};
	
	public void display() {
		
		
		//달력 숫자 출력
		for(int i = 0 ;i<6;i++) { //행(주차)
			for(int k=0;k<7;k++) { //열(요일)
				
				System.out.printf("%4d", cal_array[i][k]);
				
			}//end for2(k)
			System.out.println(); //줄바꾸기
		}//end for1(i)
	};
}
