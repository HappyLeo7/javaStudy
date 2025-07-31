package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.TextVo;

public class _02_MyMain_Serial2_Open1 {
	public static void main(String[]args) throws Exception{
		//파일 불러오기  //FileInputStream() 예외처리
		InputStream is= new FileInputStream("personfile.dat");
		//역직열화
		ObjectInputStream ois=new ObjectInputStream(is);
		
		//데이터 읽어오기
		
		TextVo a=new TextVo(ois.readObject());
		//a=(TextVo)ois.readObject();
		System.out.println(a.to());
	}
}
