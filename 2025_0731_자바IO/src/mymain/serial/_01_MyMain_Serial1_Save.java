package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _01_MyMain_Serial1_Save {
public static void main(String[] args) throws Exception{
	PersonVo p1 =new PersonVo("홍길동",30,"서울시 관악구 남부순환로123");
	
	System.out.println(p1.toString());
	//System.out.println(p1);
	
	//열기
	OutputStream os =new FileOutputStream("person.dat"); //.dat 2진파일
	
	//객체를 저장하는 Stream : 직렬화처리 데이터는 binary data 2진타입데이터
	ObjectOutputStream oos =new ObjectOutputStream(os);
	
	//객체저장(직렬화 : 객체정보를 분해해서 저장처리)
	//직렬화 할때 JVM에게 PersonVo 클래스가 직렬화가 가능하다고 알려줘야한다. 
	oos.writeObject(p1);
	
	//닫기(역순)
	oos.close();
	os.close();
}
}
