package mymain.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyboardInput_03_bufferedReader {
	public static void main(String[] args) throws IOException {
		//표준 입출력 장치
		//입력 : System.in
		//출력 : System.out
		InputStream is = System.in;
		
		//Filter : byte stream -> char stream 변환
		// InputStreamReader() 는 1byte를 char(2byte)로 변환해준다
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		System.out.println("데이터를 입력해보세요(종료:Ctrl+Z)");
		
		while(true) {
//			//read()가 키보드 버퍼로 부터 1byte 씩 읽어 옵니다.
//			//예외처리도 해줘야한다.
//			int ch=isr.read();
//			
//			if(ch==-1) {break;}//Ctrl+Z 는 -1 을 전달
//			System.out.printf("%c",ch);
			
			String data=br.readLine();
			if(data==null) {
				break;
			}
			System.out.println(data);
		}//end:while
		System.out.println("---[End]---");
	}//end:main
}
