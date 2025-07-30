package mymain;

import myutil.BaseCalc;
import myutil.CalcFactory;

public class MyMain_Calc {
	public static void main(String[] args) {
		System.out.println(BaseCalc.PI);
		
		
		//XXX The final field BaseCalc.PI cannot be assigned
		//BaseCalc.PI=3.141592;
		
		//인터페이스 = new 클래스()
		// 설명서   = new 설계서()
		//BaseCalc calc =new BaseCalcImpl();
		//Factory pattern
		//BaseCalc calc = new CalcFactory().getCalc(); // 사용자가 많아지면 Factory가 계속 만들어 지니 싱글톤으로 만든다.
		//singleton pattern
		BaseCalc calc = CalcFactory.getInstance().getCalc();
		
		int x = 10 , y = 5 , result;
		result = calc.plus(x, y);
		System.out.printf("%d + %d = %d\n",x,y,result);
		result = calc.hap(x);
		System.out.printf("%d 까지의 합은 %d\n",x,result);
		
	}
}
