package mymain;
import java.util.Scanner;

import myutil.MyArrays2;
import myutil.MySnail_달팽이;
public class MyMain_달팽이 {
	public static void main(String[]args) {
		int chasu;
		String y_n="y"; //계속할지 여부 체크
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("차수 : ");
			chasu=scanner.nextInt();
			
			//달팽이 객체생성 ->출력
			int[][] result_snail=MySnail_달팽이.make(chasu);
			MyArrays2.display2(result_snail);
			
			//계속?
			System.out.print("계속?(y/n) : ");
			y_n=scanner.next();
//			if(!y_n.equalsIgnoreCase("y")) {break;} //이코드가 속도는 조금 더 빠르다.
			if(y_n.equalsIgnoreCase("y")==false) {break;}
		
		}
		
		scanner.close();
		
	}
}
