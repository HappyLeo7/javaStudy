package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class _02_MyMain_Serial2_Open {
	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("person.dat");
		
		//객체를 읽는 Stream(역직렬화 : 재조립)
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//객체 읽어오기
//		PersonVo p = ois.readObject();
//		Object p = ois.readObject();
		PersonVo p = (PersonVo)ois.readObject();
		System.out.println(p);
		
		//닫기
		ois.close();
		is.close();
	}
}
