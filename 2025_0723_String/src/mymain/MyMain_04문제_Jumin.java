package mymain;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myutil.Jumin;

public class MyMain_04문제_Jumin {
	public static void main(String[] args) {
		
		//주민번호 입력 받기
		Scanner scanner =new Scanner(System.in);
		String jumin_no;
		String y_n="y";
		
		Jumin jumin = new Jumin();
		
		/*		정규식
		 *      * : 0 ... n
		 *      + : 1 ... n
		 *      ? : 0 or 1
		 */
		//TODO 정규식 체크1 (패턴 넣는다)
		String regular_jumin="^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01]))-(?:[12][0-9]{6}|4[0-9]{6})$";
		Pattern patten = Pattern.compile(regular_jumin);
		
		while(true) {
			System.out.println("[주민번호입력하시오(xxxxxx-xxxxxxx)]");
			jumin_no=scanner.next();
			
			//TODO 정규식 체크2 (매칭준비)
			Matcher matcher = patten.matcher(jumin_no);
			
			
			
			
			
			//TODO 패턴에 일치하지않으면
			if(matcher.find()==false) {//발견이 되었는지 매칭이 되었는지 확인
				System.out.println("****주민번호 형식이 틀립니디!!****");
				continue; //현재 실행을 종료하고 다시 실행해라
			};
			
			//주민번호객체에게 번호를 넣어준다.
			jumin.setJumin_no(jumin_no);
			
			//주민번호가 존재할수 있는지 유효 체크
			boolean isValidi=jumin.getisValid();
			System.out.printf("유효한주민번호? : %b\n",isValidi);
			if(isValidi==false) {
				
				System.out.println("****주민번호가 유효하지않습니다.****");
				continue; //현재 실행을 종료하고 다시 실행해라
			}
			//부가정보 추출(출생년도/나이/띠/성별....
			int year = jumin.getYear();
			System.out.printf("출생년도	: %d\n",year);
			int age=jumin.getAge();
			System.out.printf("나      이 : %d\n",age);
			String tti=jumin.getTti();
			System.out.printf("띠        : %s\n",tti);
			String gender=jumin.getGender();
			System.out.printf("성      별 : %s\n",gender);
			String local=jumin.getLocal();
			System.out.printf("출 생 지 역 : %s\n",local);
			String season=jumin.getSeason();
			System.out.printf("태어난계절  : %s\n",season);
			String ganji=jumin.getGanji();
			System.out.printf("10간지    : %s\n",ganji);
			
			
			//사용 여부
			System.out.println("계속하시겠습니까?(y or n)");
			y_n=scanner.next();
			if(!(y_n.equalsIgnoreCase("y"))) {
				break;
			}
		}
		System.out.println("[---End---]");
		scanner.close();
	}
}
