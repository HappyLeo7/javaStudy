package mymain;

import java.util.Scanner;

import myutil.AdvanceCalc;

public class MyMain_Calc {
	public static void main(String[] args) {
		AdvanceCalc ac=new AdvanceCalc();
		int x = 10 ,y=3 , result;
		result = ac.plus(x,y);
		System.out.printf("%d + %d = %d\n",x,y,result);
		
		result =ac.hap(x);
		System.out.printf("%d까지의 합 = %d\n",x,result);
	
		int a =2, b=10;
		double result1=ac.pow(a, b);
		System.out.printf("%d's %d승 = %.0f\n",a,b, result1);
		
	}
}
