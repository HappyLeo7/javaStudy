package myutil;

import java.util.Calendar;

public class Jumin {
	private String jumin_no;
	
	public Jumin() {
		
	}
	
	public String getJumin_no() {
	return jumin_no;
	};
	public void setJumin_no(String jumin_no) {
	 this.jumin_no=jumin_no;
	}
	
	
	//             01234567890123  <-index
	// jumin_no = "991212-1234567"
	
	/*
	성별 코드
				내국인	외국인
				남 녀		남 녀 
	1800		9  0 	
	1900        1  2    5  6
	2000		3  4    7  8
	*/
	
	//출생년도 구하기
	public int getYear() {
		String jumin_02_no=this.jumin_no.substring(0,0+2);
		String jumin_7_no=this.jumin_no.substring(7,8);
		int ye_02_no=Integer.parseInt(jumin_02_no);
		int ye_7_no=Integer.parseInt(jumin_7_no);
		
		//TODO char로 문자 1개 받아와서 변환하는방법
		char ch_gender = jumin_no.charAt(7);
		int gender = ch_gender-'0'; //'0'은 48아스키코드 숫자의 시작값을 빼면 원하는 숫자나온다.
		
		int year=0;
		switch(ye_7_no) {
		case 0: 
		case 9: year =1800+ye_02_no; break;
		case 1:  
		case 2: 
		case 5: 
		case 6: year =1900+ye_02_no;break;
		case 3: 
		case 4: 
		case 7: 
		case 8: year=2000+ye_02_no;break;
 			
		}
		
	
		
		return year;
	}
	
	public int getAge() {
		Calendar date=Calendar.getInstance();
		int age=date.get(Calendar.YEAR)-this.getYear();
		return age;
	}
	
	public String getTti() {
		String[] tti= {
				"신(申): 원숭이",
				"유(酉): 닭",
				"술(戌): 개",
				"해(亥): 돼지",
			"자(子): 쥐",
			"축(丑): 소",
			"인(寅): 호랑이",
			"묘(卯): 토끼",
			"진(辰): 용",
			"사(巳): 뱀",
			"오(午): 말",
			"미(未): 양"
		
		};
		int tti_index=getYear()%12;
		
		return tti[tti_index];
	}
	
	public String getGender() {
		char ch_gender = jumin_no.charAt(7);
		int int_gender=ch_gender-'0';
		String str_gender="";
		switch(int_gender) {
		case 1:
		case 3:
		case 9: str_gender="국산남자"; break;
		case 5:
		case 7: str_gender="외국남자"; break;
		case 6:
		case 8: str_gender="외국여자";break;
		default: str_gender="국산여자";break;
		}
		return str_gender;
	}
	
	public String getLocal() {
		String str_local=jumin_no.substring(8,9);
		int int_local=Integer.parseInt(str_local);
		String local="";
		if(55==int_local||int_local==56){	
			local="광주광역시";
		}else if(int_local==76) {
			local="대구광역시";
		}else if(int_local>=0&&int_local<=8) {
			local="서울특별시";
		}else if(9<=int_local&&int_local<=12) {
			local="부산광역시";
		}else if(13<=int_local&&int_local<=15) {
			local="인천광역시";
		}else if(16<=int_local&&int_local<=25) {
			local="경기도";
		}else if(26<=int_local&&int_local<=34) {
			local="강원도";
		}else if(35<=int_local&&int_local<=39) {
			local="충청북도";
		}else if(40<=int_local&&int_local<=41) {
			local="대전광역시";
		}else if(44==int_local||int_local==96) {
			local="세종특별차치시";
		}else if(42<=int_local&&int_local<=47) {
			local="충청남도";
		}
		return local;
	}
	
}
