package mymain.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class _03_NetworkInput_02_char {
	public static void main(String[] args) throws Exception {

		String host = "https://www.naver.com/";

		// TODO Uniform Resource Locator (웹의 컨텐츠의 위치를 지정하는 주소형식)
		URL url = new URL(host);

		InputStream is = url.openStream();
		//								 (주소 , "인코딩값")
		Reader isr = new InputStreamReader(is,"utf-8");
		

		while (true) {
			int ch = isr.read();
			if (ch == -1) {
				break;
			}
			System.out.printf("%c", ch);
			
			Thread.sleep(0);
		}
		
		System.out.println("");
		System.out.println("----[이클립스 종료]----");
	}
}
