package mymain;

import java.util.Calendar;
import java.util.Scanner;

import myutil.MyArrays;

public class MyMain_Array1_활용2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		String tti[]= {	
		"신(申):원숭이",
		"유(酉):닭",                     
		"술(戌):개",                     
		"해(亥):돼지",                     
		"자(子):쥐",                     
		"축(丑):소",                     
		"인(寅):호랑이",                     
		"묘(卯):토끼",                     
		"진(辰):용",                     
		"사(巳):뱀",                     
		"오(午):말",                     
		"미(未):양"                      
		};
		
		String ganji[]= {
	
		"경(庚)",	"신(辛)",	"임(壬)",	"계(癸)",	"갑(甲)",	"을(乙)",	"병(丙)",	"정(丁)",	"무(戊)",	"기(己)"
		};
		
		String color[]= {
"흰색",
"검은색",
"파란색",
"빨간색",
"금색"		
		};
		
		
		
		System.out.print("출생년도");
		do {
			
		year = scanner.nextInt();
		
		int x=year%tti.length;
		int y=year%ganji.length;
		int color_index= year%10/2;
		String z=color[color_index];
//		switch(y) {
//		case 0:    
//		case 1: z=color[0];break; 
//		case 2:    
//		case 3: z=color[1];break; 
//		case 4:    
//		case 5: z=color[2];break; 
//		case 6:    
//		case 7: z=color[3];break; 
//		case 8:    
//		case 9: z=color[4];break; 
//		}
		
		//현재시스템 시간구하기 : 년월일시분초APMP요일
		Calendar now = Calendar.getInstance();
		
		//System.out.print(		now.get(Calendar.MONTH)+1+"월"	);
		System.out.println(now.get(Calendar.YEAR)-year+"살");
		System.out.print(ganji[y]);
		StringBuffer str = new StringBuffer(tti[x]);
		str.insert(5, z);
		System.out.println(str);
//		System.out.print(z);
		
		
		}while(true);
		
		
		
		
//		scanner.close();
	}
}
