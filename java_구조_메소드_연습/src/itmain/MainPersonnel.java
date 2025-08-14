package itmain;

import itutil.Personnel;

public class MainPersonnel {
	public static void main(String[] args) {
		Personnel m1=new Personnel();
		m1.setPersonnel("서경원", 1, "사원", "인사팀", "suh@insa.com", "010-1234-1234", "2025-08-14", 160, 50000, "114-1234-123456", 10, "A");
		System.out.println(m1.toString());
		int money=m1.getMonthPay(m1.getNo());
		double bonus=m1.getBonus(m1.getNo());
		System.out.printf("월급 : %d원\n" , money);
		System.out.printf("보너스 : %.0f원\n",bonus);
		System.out.printf("총지급금 : %.0f원\n",(double)money+bonus);
		System.out.println("===============================");
		
		m1.setPersonnel("이시원", 2, "사원", "총무팀", "li@insa.com", "010-1234-1234", "2025-08-14", 160, 55000, "114-1234-123455", 15, "A");
		System.out.println(m1.toString());
		int money2=m1.getMonthPay(m1.getNo());
		double bonus2=m1.getBonus(m1.getNo());
		System.out.printf("월급 : %d원\n" , money2);
		System.out.printf("보너스 : %.0f원\n",bonus2);
		System.out.printf("총지급금 : %.0f원\n",(double)money2+bonus2);
		System.out.println("===============================");
		
		m1.setPersonnel("홍길동", 3, "인턴", "계획팀", "hung@insa.com", "010-1234-1211", "2025-08-14", 150, 30000, "114-1234-123451", 1, "F");
		System.out.println(m1.toString());
		int money3=m1.getMonthPay(m1.getNo());
		double bonus3=m1.getBonus(m1.getNo());
		System.out.printf("월급 : %d원\n" , money3);
		System.out.printf("보너스 : %.0f원\n",bonus3);
		System.out.printf("총지급금 : %.0f원\n",(double)money3+bonus3);
		System.out.println("===============================");
	}
}
