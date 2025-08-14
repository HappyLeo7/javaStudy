package itmain;

import itutil.Bank;

public class Jab {

	public static void main(String[] args) {

		Bank bank = new Bank(1000000000);
		bank.setName("홍길동");
		bank.display();
		Bank b = new Bank();// 16진법주소로
		System.out.println(b.toString());
		Bank aa=new Bank();
		aa.setName("바보");
		aa.set연봉(10000);
		Bank bb=new Bank();
		bb.setName("바보");
		bb.set연봉(1000);
		
		System.out.printf("%s %d\n",aa.getName(),aa.get연봉());
		System.out.printf("%s %d\n",bb.getName(),bb.get연봉());
		System.out.println(true);

	}
}
