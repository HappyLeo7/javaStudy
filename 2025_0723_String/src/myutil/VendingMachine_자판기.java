package myutil;

public class VendingMachine_자판기 {
	private final int COLA = 2000;
	private final int CYDER = 1800;
	private final int JUICE = 3000;
	private final int MILK = 1400;

	private int money;
	private int drink;
	private String drink_name;

	// 생성자
	public VendingMachine_자판기() {

	}

	public int insertCoin(int money) {

		return this.money = money;
	}

	public int getmoney() {
		return this.money;
	}

	public int selectDrink(int drink) {
		String[] drink_ar = { "콜라", "사이다", "쥬스", "우유" };
		for (int i = 0; i < drink_ar.length; i++) {

			if (drink == i) {
				this.drink_name = drink_ar[drink - 1];
			}
		}
		return this.drink = drink;
	}

	public void displayResult() {
		System.out.printf("받은금액 : %d원\n", this.money);
		if(drink==1&&this.money<COLA||drink==2&&this.money<CYDER||drink==3&&this.money<JUICE||drink==3&&this.money<MILK) {
			System.out.println("구매 할 수 있는 물품이 없습니다.");
			System.out.printf("거스름돈 : %d원\n",this.money);
		}else {
			
		switch (drink) {
		case 1:
			this.money = this.money - this.COLA;
			System.out.printf("선택한음료 : %s(%d원)\n거스름돈 : %d원\n", this.drink_name, this.COLA, this.money);
			break;
		case 2:
			this.money = this.money - this.CYDER;
			System.out.printf("선택한음료 : %s(%d원)\n거스름돈 : %d원\n", this.drink_name, this.CYDER, this.money);
			break;
		case 3:
			this.money = this.money - this.JUICE;
			System.out.printf("선택한음료 : %s(%d원)\n거스름돈 : %d원\n", this.drink_name, this.JUICE, this.money);
			break;
		case 4:
			this.money = this.money - this.MILK;
			System.out.printf("선택한음료 : %s(%d원)\n거스름돈 : %d원\n", this.drink_name, this.MILK, this.money);
			break;
		}
		}
		

	}

}
