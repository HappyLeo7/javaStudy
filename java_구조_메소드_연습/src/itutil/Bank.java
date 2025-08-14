package itutil;

public class Bank {
	//필드
	private long 연봉;
	private String name;
	
	//생성자 : 초기화
	public  Bank() {
		
	}
	public String toString(){
		return "a";
	}
	public Bank(long m) {
		this.연봉=m;
	}
	
	public void display() {
		System.out.print(this.name);
		System.out.printf("%d원 입금처리 되었습니다.",this.연봉);
	}
	public void setName(String n){
		this.name=n+"님 : ";
	}
	public String getName(){
		return this.name;
	}
	public void set연봉(long 연봉){
		this.연봉=연봉;
	}
	public long get연봉(){
		return this.연봉;
	}
}
