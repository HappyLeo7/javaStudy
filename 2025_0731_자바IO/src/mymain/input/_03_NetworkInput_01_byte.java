package mymain.input;

import java.io.InputStream;
import java.net.URL;

public class _03_NetworkInput_01_byte {
	public static void main(String[] args) throws Exception {

		String host = "https://www.naver.com/";

		// TODO Uniform Resource Locator (웹의 컨텐츠의 위치를 지정하는 주소형식)
		URL url = new URL(host);

		InputStream is = url.openStream();

		while (true) {
			int ch = is.read();
			if (ch == -1) {
				break;
			}
			System.out.printf("%c", ch);
			
			Thread.sleep(0);
		}
		
		System.out.println("----[이클립스 종료]----");
	}
}
