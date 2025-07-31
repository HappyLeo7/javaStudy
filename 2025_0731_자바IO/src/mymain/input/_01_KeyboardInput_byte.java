package mymain.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyboardInput_byte {
	public static void main(String[] args) throws IOException {
		//표준 입출력 장치
		//입력 : System.in
		//출력 : System.out
		InputStream is = System.in;
		
		System.out.println("데이터를 입력해보세요(종료:Ctrl+Z)");
		
		while(true) {
			//read()가 키보드 버퍼로 부터 1byte 씩 읽어 옵니다.
			//예외처리도 해줘야한다.
			int ch=is.read();
			
			if(ch==-1) {break;}//Ctrl+Z 는 -1 을 전달
			System.out.printf("%c",ch);
		}//end:while
		System.out.println("---[End]---");
	}//end:main
}
