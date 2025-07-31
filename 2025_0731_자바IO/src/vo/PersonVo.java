package vo;

import java.io.Serializable;

//TODO VO (Value Object)
//           : 값을 저장관리하는 객체
//           cf)DTO(Data Transfer Object) : 전달객체(Rest API)
//TODO                           직렬화가 가능한 객체라고 알려주는것
public class PersonVo implements Serializable{
	String name;
	int age;
	String addr;
	
	@Override
	public String toString(){
		return String.format("%s - %d - %s", this.name,this.age,this.addr);
	}
	
	public PersonVo() {
		// TODO Auto-generated constructor stub
	}
	public PersonVo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
