package mymain.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _02_FileInput_01_byte {
	public static void main(String[] args) throws Exception {
		//예외처리가 필요
		//File Open
		InputStream is = new FileInputStream("src/mymain/input/_02_FileInput_byte.java");
		
		while(true) {
			int ch =is.read();
			//마지막에 end 부분이 -1을 보내준다.
			if(ch==-1) {
				break;
			}
			System.out.printf("%c",ch);
			//예외처리필요
			Thread.sleep(50);
		}
		
		//예외처리필요
		//Close
		is.close();
	}
}
