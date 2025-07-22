package myutil;

public class Save {
	private String name;
	private long money;
	
	//정적(공유)변수
	public static double rate; //전체 공유를 하기위해서
	
	//TODO 기본생성자
	public Save() {
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMoney() {
		return money;
	}


	public void setMoney(long money) {
		this.money = money;
	}



	//TODO name,money로 가변오는 생성자
	public Save(String name, long money) {
		this.name = name;
		this.money = money;
	}
	
	public void display() {
						// 이름  저축액  이자
		System.out.printf("[%s]-[%d]-[%d]달러\n",
				this.name,money,(long)(money*rate));
	}
	
}
