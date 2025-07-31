package mymain.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _02_FileInput_02_char {
	public static void main(String[] args) throws Exception {
		//예외처리가 필요
		//File Open
		InputStream is = new FileInputStream("src/mymain/input/_02_FileInput_char.java");
		
		//Filter
		InputStreamReader isr= new InputStreamReader(is);
		while(true) {
			int ch =isr.read(); //char 단위로 읽기
			//마지막에 end 부분이 -1을 보내준다.
			if(ch==-1) {
				break;
			}
			System.out.printf("%c",ch);
			//예외처리필요
			Thread.sleep(1);
		}
		
		//예외처리필요
		//닫기:열린 역순으로Close
		isr.close();
		is.close();
	}
}
