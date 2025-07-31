package mymain.output;

import java.io.IOException;
import java.io.OutputStream;

public class _01_MonitorOutput_01 {
	public static void main(String[] args) throws Exception {
		//표준출력장치 : System.out <- PrintStream <- OutputStream
		//부모타입 
		OutputStream os =System.out;


		//write 는 출력버퍼에 기록하는 행위.
		// .write(int ?) 구조
		os.write(65);

		os.write('B');
		
		os.write('1');
		
		String msg = "안녕하세요";
		//String -> byte[]
		byte [] byte_msg=msg.getBytes(); //getBytes() 는 문자를 하나하나 Byte단위로 나눈후 합쳐서 저장한다.
		os.write(byte_msg);
		
		int n = 123;
		//모든값 -> String생성 :
		//방법 1) String.valueOf()
		//방법 2) n+""; (처리가 안좋음 속도 느림 비효율적 쓰지말자)
		String strN=String.valueOf(n); //volueOf 는 숫자를 문자로 바꿔준다.
		os.write(strN.getBytes());
		
		// 출력버퍼를 비우기 -> 버퍼내용이 화면으로 전송 
		os.flush();
	}
}
