package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class _01_MyMain_Serial1_Save1 {
	public static void main(String[] args) throws Exception{
		
		String p = "안녕";
		
		// 열기 파일만들기 
		OutputStream os = new FileOutputStream("personfile.dat");
		
		//객체를 2진법으로 저장 직열화
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		oos.writeObject(p);
	}
}
