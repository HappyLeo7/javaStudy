package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _03_MyMain_Serial3_Save {
public static void main(String[] args) throws Exception{
	
	PersonVo p1 =new PersonVo("홍길동",30,"서울시 관악구 남부순환로123");
	
	System.out.println(p1.toString());
	//System.out.println(p1);
	
	PersonVo[]p_array= {
			new PersonVo("일길동",31,"서울시 관악구 남부순환로11"),
			new PersonVo("이길동",32,"서울시 관악구 남부순환로12"),
			new PersonVo("삼길동",33,"서울시 관악구 남부순환로13"),
			new PersonVo("사길동",34,"서울시 관악구 남부순환로14"),
			new PersonVo("오길동",35,"서울시 관악구 남부순환로15"),
			new PersonVo("육길동",36,"서울시 관악구 남부순환로16"),
			new PersonVo("칠길동",37,"서울시 관악구 남부순환로17"),
			new PersonVo("팔길동",38,"서울시 관악구 남부순환로18"),
			new PersonVo("구길동",39,"서울시 관악구 남부순환로19"),
			new PersonVo("십길동",40,"서울시 관악구 남부순환로20")
				
	};
	
	
	//열기
	OutputStream os =new FileOutputStream("person_array.dat"); //.dat 2진파일
	
	//객체를 저장하는 Stream : 직렬화처리 데이터는 binary data 2진타입데이터
	ObjectOutputStream oos =new ObjectOutputStream(os);
	
	//객체저장(직렬화 : 객체정보를 분해해서 저장처리)
	//직렬화 할때 JVM에게 PersonVo 클래스가 직렬화가 가능하다고 알려줘야한다. 
	oos.writeObject(p_array);
	
	//닫기(역순)
	oos.close();
	os.close();
}
}
