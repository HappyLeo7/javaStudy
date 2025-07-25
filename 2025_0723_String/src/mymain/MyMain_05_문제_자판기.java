package mymain;

import java.util.Scanner;
import java.util.regex.Pattern;

import myutil.VendingMachine_자판기;

public class MyMain_05_문제_자판기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money;
		int drink;
		String y_n="y";
		
		
		System.out.print("금액 : ");
		money = scanner.nextInt();
		VendingMachine_자판기 vendingMachine = new VendingMachine_자판기();
		while(true) {
			
			System.out.print("[음료선택]\n1.콜라(2000)\n2.사이다(1800)\n3.쥬스(3000)\n4.우유(1400)\n ");
			drink=scanner.nextInt();
			if(0>=drink||drink>=5) {
				System.out.println("존재하지않는 음료입니다.");
				break;
			}
			//VendingMachin에게 금액과 선택음료정보전달
			vendingMachine.insertCoin(money);
			vendingMachine.selectDrink(drink);
			
			//결과출력
			vendingMachine.displayResult(); //방법1) 잔돈에서도 계속해서 구매가능
//			vendingMachine.displayResult2(); //방법2) 1번만 구매되고 다시 돈넣고 실행해야함
//			vendingMachine.displayResult3(); //방법3) 1번만 구매되고 다시 돈넣고 실행해야함
			money=vendingMachine.getmoney();
			
			System.out.println("계속하시겠습니까? ('y' or 'n')");
			y_n=scanner.next();
			if(!y_n.equalsIgnoreCase("Y")) {
				break;
			}
		}//end : while()
		System.out.println("---[End]---");
		scanner.close();
	}
}
