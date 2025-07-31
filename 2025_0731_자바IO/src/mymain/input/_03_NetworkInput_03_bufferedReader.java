package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class _03_NetworkInput_03_bufferedReader {
	public static void main(String[] args) throws Exception {

		String host = "https://www.naver.com/";

		// TODO Uniform Resource Locator (웹의 컨텐츠의 위치를 지정하는 주소형식)
		URL url = new URL(host);

		//1byte
		InputStream is = url.openStream();
		//char 2byte					 (주소 , "인코딩값")
		Reader isr = new InputStreamReader(is,"utf-8");
		//Line 단위
		BufferedReader br=new BufferedReader(isr);
		

		while (true) {
//			int ch = isr.read();
//			if (ch == -1) {
//				break;
//			}
//			System.out.printf("%c", ch);
			
			String data =br.readLine(); //줄단위로 읽는다. (스페이스 or 공백포함해서 읽고 엔터가 구분자 : 입력표시해줄때 엔터는 버린다.)
			if (data==null) {
				break;
			}
			System.out.println(data);
			Thread.sleep(100);
		}
		
		System.out.println("");
		System.out.println("----[이클립스 종료]----");
	}
}
