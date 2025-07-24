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
//		char ch_gender = jumin_no.charAt(7);
//		int gender = ch_gender-'0'; //'0'은 48아스키코드 숫자의 시작값을 빼면 원하는 숫자나온다.
		
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
				"신(申): 원숭이", //0
				"유(酉): 닭", //1
				"술(戌): 개",
				"해(亥): 돼지",
			"자(子): 쥐",
			"축(丑): 소",
			"인(寅): 호랑이",
			"묘(卯): 토끼",
			"진(辰): 용",
			"사(巳): 뱀",
			"오(午): 말",
			"미(未): 양" //11
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
		String str_local=jumin_no.substring(8,8+2);
		int int_local=Integer.parseInt(str_local);
		String local="";
		if(55==int_local||int_local==56){	
			local="광주광역시";
		}else if(int_local==76) {
			local="대구광역시";
		}else if(int_local==85||int_local==90) {
			local="울산광역시";
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
		}else if(48<=int_local&&int_local<=54) {
			local="전라북도";
		}else if(55<=int_local&&int_local<=56) {
			local="전라남도";
		}else if(67<=int_local&&int_local<=69) {
			local="대구광역시";
		}else if(70<=int_local&&int_local<=75) {
			local="경상북도";
		}else if(77<=int_local&&int_local<=81) {
			local="경상북도";
		}else if(82<=int_local&&int_local<=84) {
			local="경상남도";
		}else if(86<=int_local&&int_local<=89) {
			local="경상남도";
		}else if(90<=int_local&&int_local<=92) {
			local="경상남도";
		}else if(93<=int_local&&int_local<=95) {
			local="제주특별자치도";
		}
		return local;
	}//end : getLocal
	
	public String getSeason() {
		String season_no=jumin_no.substring(2,2+2);
		String season = "";
		switch(season_no) {
		case "03":
		case "04":
		case "05": season="봄"; break;
		case "06":
		case "07":
		case "08": season="여름"; break;
		case "09":
		case "10":
		case "11": season="가을"; break;
		case "12":
		case "01":
		case "02": season="겨울";break;
		}
		return season;
	}
	
	public String getSeason2() {
		int month = Integer.parseInt(jumin_no.substring(2,2+2));
		
		//TODO else를 안써도 되는 이유는 return으로 코드 종료하기 때문이다.
		if(3<=month&&month<=5) {return "봄";}
		if(6<=month&&month<=8) {return "여름";}
		if(9<=month&&month<=11) {return "가을";}
		
		return "겨울";
	}//XXX end getSeason2
	
	public String getSeason3() {
		int month = Integer.parseInt(jumin_no.substring(2,2+2));
		switch(month/3) {
		case 1: return "봄";
		case 2: return "여름";
		case 3: return "가을"; 
		}
		return "겨울";
	}
	
	public String getGanji() {
		String []ganji = { "경(庚)", "신(辛)","임(壬)", "계(癸)","갑(甲)", "을(乙)", "병(丙)", "정(丁)", "무(戊)", "기(己)"};
		int ganji_index=getYear()%10;
		return ganji[ganji_index];
	}
	
	public String getGanji2() {
		int gan_index = this.getYear()%10;
		int ji_index= this.getYear()%12;
		
		char gan ="경신임계갑을병정무기".charAt(gan_index);
		char ji ="신유술해자축인묘진사오미".charAt(ji_index);
		
		//XXX 아래코드 연산법은 메모리낭비가 있기때문에 지양한다.
//		String str = ""+gan+ji+"년";
		
		return String.format("%c%c년", gan,ji);
	}
	
	public boolean getisValid() {
//		int [] is_valid= {2,3,4,5,6,7,8,9,2,3,4,5};
		int num=2;
		int total_num=0;
		int jumin_num=0;
		for(int i=0;i<jumin_no.length()-1;i++) {
			if(jumin_no.charAt(i)=='-') {
			
				continue;
			}
			jumin_num=jumin_no.charAt(i)-'0';
//			if(jumin_num==-3) {
//				
//				num--;
//				jumin_num=0;
//			}
			
			
//			System.out.println("jumin_num:"+jumin_num);
//			System.out.println("num : "+num);
			total_num+=jumin_num*num;
//			System.out.println("total_num : "+total_num);
			num++;
			if(num==10) {
				num=2;
			}
		}
//		System.out.println(total_num);
		int last_num=(11-(total_num%11))%10;
		
		
		
		int last_no=jumin_no.charAt(13)-'0';
		System.out.println(last_num);
//		System.out.println(last_no);
		boolean isValid=last_num==last_no?true:false;
		
		return isValid;
	}
	
	public boolean getisValid2() {
		//주민번호 체크식
        int sum = 0;

        int [] su_array = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; // 주민 번호 해설을 위한 암호 키값 

        for (int i = 0; i < 13; i++) {
            if (i == 6) {
                continue;
            }
            sum = sum + (this.jumin_no.charAt(i)-'0') * su_array[i];

        }


        int checksum;
        //방법1)
        // sum = sum % 11; // 합계에서 11을 나눈 나머지
        // sum = 11 - sum; // 11에서 sum을 뺀다
        // checksum = sum % 10; //10나눈 나머지

        //방법2)
        checksum = (11 - (sum % 11)) % 10;
        System.out.printf("checksum : %d\n",checksum);
        int last_num = ((this.jumin_no).charAt(13));
        return (checksum == last_num);
	}//end : getisValid2
	

	
}
