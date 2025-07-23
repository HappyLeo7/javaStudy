package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_04문제_Jumin {
	public static void main(String[] args) {
		
		//주민번호 입력 받기
		Scanner scanner =new Scanner(System.in);
		String jumin_no;
		String y_n="y";
		
		Jumin jumin = new Jumin();
		
		while(true) {
			System.out.println("주민번호입력하시오(xxxxxx-xxxxxxx)");
			jumin_no=scanner.next();
			
			//주민번호객체에게 번호를 넣어준다.
			jumin.setJumin_no(jumin_no);
			
			//부가정보 추출(출생년도/나이/띠/성별....
			int year = jumin.getYear();
			System.out.printf("출생년도 : %d\n",year);
			int age=jumin.getAge();
			System.out.printf("나이 : %d\n",age);
			String tti=jumin.getTti();
			System.out.printf("띠 : %s\n",tti);
			String gender=jumin.getGender();
			System.out.printf("성별 : %s\n",gender);
			String local=jumin.getLocal();
			System.out.printf("출생지역 : %s\n",local);
			
			//사용 여부
			System.out.println("계속하시겠습니까?(y or n)");
			y_n=scanner.next();
			if(!(y_n.equalsIgnoreCase("y"))) {
				break;
			}
		}
		System.out.println("---End---");
		scanner.close();
	}
}
