package mymain;

import java.io.IOException;

public class _09_while2_keyboard {
	public static void main(String[] args) throws IOException {
		int ch;
		int count = 0;
		int alpha_upper_count = 0; // 대문자 갯수
		int alpha_lower_count = 0; // 소문자 갯수
		int number_count = 0; // 숫자
		int white_count = 0; // (화이트문자)공백(' ' ASCII=>32) , 엔터 \r , 줄바꾸기 \n , 텝 \t
		int etc_count = 0; // 그외 기타문자

		System.out.println("종료하려면 Ctrl+Z 누르세요");
		// 조건에 true 계속참 , 무한 loop
		while (true) {

			// 키보드 버퍼로부터 1byte씩 읽어온다.
			ch = System.in.read(); // 입력받는 함수 //예외처리 throws IOException

			if (ch == -1)
				break; // while문을 끝내라(탈출)

			if ('A' <= ch && ch <= 'Z') {
				alpha_upper_count++;
			} else if ('a' <= ch && ch <= 'z') {
				alpha_lower_count++;
			} else if ('0' < ch && ch <= '9') {
				number_count++;
			}else if (' '==ch||'\n'==ch||'\r'==ch||'\t'==ch) {
				white_count++;
			}else {
				etc_count++;
			}

			System.out.printf("%c", ch);
			count++;// 총문자수
		} // while_end
		System.out.println("입력받은 전체문자수 : " + count);
		System.out.println("입력받은 대문자수 : " + alpha_upper_count);
		System.out.println("입력받은 소문자수 : " + alpha_lower_count);
		System.out.println("입력받은 숫자문자수 : " + number_count);
		System.out.println("입력받은 화이트문자수 : " + white_count);
		System.out.println("입력받은 기타문자수 : " + etc_count);
		System.out.println("--End--");
	}// main_end
}
