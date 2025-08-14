package itutil;

import java.util.Date;

public class Personnel {
	/** 직원이름 */
	private String name;
	/** 직원번호 */
	private int no;
	/** 직급 */
	private String rank;
	/** 부서이름 */
	private String departmentName;
	/** 이메일 */
	private String email;
	/** 전화번호 */
	private String tel;
	/** 입사일 */
	private String date_of_employment;
	/** 근무시간 */
	private int working_hours;
	/** 시급 */
	private int pay;
	/** 입금계좌 */
	private String bank_account;
	/** 월급지급일 */
	private int payday;
	/** 근무평가 */
	private String evaluation;

//	bonus
	/** 보너스A */
	double BONUS_A = 0.1;
	/** 보너스B */
	double BONUS_B = 0.08;
	/** 보너스C */
	double BONUS_C = 0.06;
	/** 보너스D */
	double BONUS_D = 0.04;
	/** 보너스F */
	double BONUS_F = 0.0;

	public Personnel() {

	};

	public void setPersonnel(String name, int no, String rank, String departmentName, String email, String tel,
			String date_of_employment, int working_hours, int pay, String bank_account, int payday, String evaluation) {
		this.name = name;
		this.no = no;
		this.rank = rank;
		this.departmentName = departmentName;
		this.email = email;
		this.tel = tel;
		this.date_of_employment = date_of_employment;
		this.working_hours = working_hours;
		this.pay = pay;
		this.bank_account = bank_account;
		this.payday = payday;
		this.evaluation = evaluation;

	}

	@Override
	public String toString() {
		String S = String.format(
				"직원이름 : %s\n직원번호 : %d\n직급 : %s\n부서이름 : %s\n이메일 :%s\n전화번호 : %s\n입사일 : %s\n근무시간 : %d\n시급 : %d\n입금계좌 : %s\n월급지급일 : %d\n근무평가 : %s\n",
				name, no, rank, departmentName, email, tel, date_of_employment, working_hours, pay, bank_account,
				payday, evaluation);
		return S;
	}

	public int getNo() {
		
		return this.no;
	}
	public double getBonus(int no) {

		double bonus = -1.0;
		if(no==this.no) {
			if(evaluation.equals("A")) {
				bonus=working_hours * pay * BONUS_A;
			}else if(evaluation.equals("B")) {
				bonus=working_hours *pay*BONUS_B;
			}else if(evaluation.equals("C")) {
				bonus=working_hours *pay*BONUS_C;
			}else if(evaluation.equals("D")) {
				bonus=working_hours *pay*BONUS_D;
			}else if(evaluation.equals("F")) {
				bonus=working_hours *pay*BONUS_F;
			}
		}
		return bonus;
	}
	
	public int getMonthPay(int no){
		int money =-1;
		if(no==this.no) {
			money=this.pay*this.working_hours;
		}
		return money; 
	}

}
