package mymain;

import java.io.FileReader;

public class _10_while3_fule {
	public static void main(String[] args) throws Exception  {
		
		//파일열기
		FileReader fr = new FileReader("src/mymain/data.txt");
		int ch;
		int count=0;
		int ko_count=0;//'가'44032  '힣'55203
		int upper_count=0;
		int lower_count=0;
		int number_count=0;
		int white_count = 0;
		int etc_count = 0;
		
		while(true) {
			ch= fr.read();//fr위치에 문자 1개를 읽어온다.
			
			//모든 텍스트 파일의 끝은 (EOF:-1) 으로 끝난다
			if(ch==-1) {break;}
			
			if('가'<=ch&&ch<='힣'||'ㄱ'<=ch&&ch<='ㅎ'||'ㅏ'<=ch&&ch<='ㅣ') {
				ko_count++;
			}else if ('A' <= ch && ch <= 'Z') {
				upper_count++;
			} else if ('a' <= ch && ch <= 'z') {
				lower_count++;
			} else if ('0' < ch && ch <= '9') {
				number_count++;
			}else if (' '==ch||'\n'==ch||'\r'==ch||'\t'==ch) {
				white_count++;
			}else {
				etc_count++;
			}
			
			System.out.printf("%c",ch);
			count++;
			
			Thread.sleep(1000/60);
			
			
			
		}//while_end
		
		System.out.println("전체문자수 : " + count);
		System.out.println("한글문자 갯수 : "+ko_count);
		System.out.println("대문자수 : " + upper_count);
		System.out.println("소문자수 : " + lower_count);
		System.out.println("숫자문자수 : " + number_count);
		System.out.println("화이트문자수 : " + white_count);
		System.out.println("기타문자수 : " + etc_count);
		System.out.println("--End--");
        
		for(int i =0 ; i <50 ;i++) {
			
			System.out.printf("[%d : %c]" ,(int)'ㅏ'+i,'ㅏ'+i);
//			System.out.printf("%c]" ,'ㅏ'+i);
			System.out.println();
		}
		
		
		//파일닫기
		fr.close();
	}
}
