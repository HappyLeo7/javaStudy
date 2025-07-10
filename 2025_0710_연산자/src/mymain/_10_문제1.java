package mymain;

import java.util.Scanner;

public class _10_문제1 {
	 public static void main(String[] args) {
		
			/*		 
				1.키를 입력받는다 (cm)
				2.단위환산 (ft / inch)
				
					1 inch =2.54 cm
					1 ft   =12 inch
			*/		 
		 
		 
		 int kiCm = 0;
		 System.out.print("키를 적어주세요");
		 Scanner scanner = new Scanner(System.in);
		 
		 kiCm=scanner.nextInt();
		 
		 double inch = 2.54;
		 double kiInch=0.0;
		 kiInch=kiCm/inch;
		 System.out.println(kiInch);
		 
		 double ft=12.0;
		 double kiFt=0;
		 double kiFt2=0.0;
		 
		 kiFt=(kiInch/ft);
		 kiFt2 = (kiInch%ft);
//		 System.out.println("kiFt:"+kiFt);
//		 System.out.println("kiFt2:"+kiFt2);
		 
		 System.out.printf("%d(ft) %.1f(inch) ",(int)kiFt,kiFt2);
		 
		 
		 
		 scanner.close();
	}
}
