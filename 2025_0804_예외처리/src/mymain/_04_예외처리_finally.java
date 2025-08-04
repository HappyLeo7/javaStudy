package mymain;

import java.io.FileReader;
import java.io.IOException;

public class _04_예외처리_finally {
	public static void main(String[] args) {
		
		FileReader fr =null;
		try {
			//파일열기
			fr=new FileReader("a.txt");
			
			String str = null;
			int len =str.length();
			
//			//파일닫기 위에 에러가 나기때문에 finally에서 해준다
//			fr.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[파일을 찾을수 없습니다]");
		} finally {
			try {
				if(fr!=null) {
				fr.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
