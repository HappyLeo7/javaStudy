package mymain;

import java.util.Scanner;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc {
	
	static void onlyBaseCalc(BaseCalc bc) {
							//BaseCalc bc = ac; <=  Up-casting(권한축소)
		
		System.out.println("--- [BaseCalc] ---");
		int a = 10,b=3,result;
		result = bc.plus(a, b);
		System.out.printf("%d + %d = %d\n", a,b,result);
		
		// result = bc.hap(a); //사용할수 없다.
	}
	
	static void onlyObject(Object ob) {
						  //Object ob = ac  <= Up-casting(권한축소)  
		System.out.println("--- [Object] ---");
		System.out.println(ob.toString());
		
		//확장시키기 down-casting : 영역의 확장 : 강제형변환
		int n=10,result;
		result = ((AdvanceCalc)ob).hap(n);
		
		System.out.printf("%d까지의 합 : %d\n",n,result);
		
		
		
		//Object ob1 =new Object();
		//AdvanceCalc ac= (AdvanceCalc)ob1; // 오류뜸 변환 할수 없기때문에
	}
	
	public static void main(String[] args) {
		AdvanceCalc ac=new AdvanceCalc();
		
		onlyObject(ac);
		
		onlyBaseCalc(ac);
		
		System.out.println("--- [AdvanceCalc] ---");
		
		
		int x = 10 ,y=3 , result;
		result = ac.plus(x,y);
		System.out.printf("%d + %d = %d\n",x,y,result);
		
		result =ac.hap(x);
		System.out.printf("%d까지의 합 = %d\n",x,result);
	
		int a =2, b=10;
		double result1=ac.pow(a, b);
		System.out.printf("%d's %d승 = %.0f\n",a,b, result1);
		
		Object ob = ac; // 자동형변환 casting이 이루어 져서 대입했다.
		BaseCalc bc = ac;
		
	}
}
