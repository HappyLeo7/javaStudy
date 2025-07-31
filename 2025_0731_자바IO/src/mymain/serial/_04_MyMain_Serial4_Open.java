package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class _04_MyMain_Serial4_Open {
	public static void main(String[] args) throws Exception{
		
		//2진법
		InputStream is = new FileInputStream("person_array.dat");
		
		//객체를 읽는 Stream(역직렬화 : 재조립)
		ObjectInputStream ois = new ObjectInputStream(is);
		
		//객체 읽어오기
//		PersonVo p = ois.readObject();
//		Object p = ois.readObject();
		PersonVo []p_array = (PersonVo [])ois.readObject();
		for(PersonVo p : p_array) {
			
			System.out.println(p);
		}
		for(int i=0;i<p_array.length;i++) {
			System.out.println(p_array[i]);
		}
		
		//닫기
		ois.close();
		is.close();
	}
}
