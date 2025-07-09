package mymain;

import java.util.Scanner;

public class _05_문제2 {
	public static void main(String[] args) {
		//조건 1 : 반지름 입력받는다.
		//조건 2 : 원둘레 = 2 * PI * 반지름
		//조건 3 : 원면적 = 반지름 * 반지름 * PI
		//조건 4 : 구의 부피 = 4/3 * PI * 반지름^3
		//조건 5 : 출력시 소숫점 1자리까지 출력
		
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름 입력하세요 : ");
		r=scanner.nextDouble();
		
		double circumference = 2.0*Math.PI*r;
		double area = r*r*3.14;
		double volume_of_a_sphere=(4.0/3.0)*3.14*(Math.pow(r,3));
		
		System.out.printf("원의 반지름 : %.1f(m)\n", r);
		System.out.printf("원의 둘레 : %.1f(m)\n", circumference);
		System.out.printf("원의 면적 : %.1f(㎡)\n", area);
		System.out.printf("구의 부피 : %.1f(㎥)\n", volume_of_a_sphere);

	
		scanner.close();
		
		
		
	}
}
