package mymain;

public class _07_for3 {
	public static void main(String[] args) {

		// ABCDEF ........ XYZ
		for (int i = 'A'; i <= 'Z'; i++) { // i = 65
			System.out.printf("%c", i);
		}
		System.out.println();// 줄바꾸기

		// ABCDEF ........ XYZ
		for (int i = 65; i <= 90; i++) { // i = 65
			System.out.printf("%c", i);
		}
		System.out.println();// 줄바꾸기

		// ABCDEF ........ XYZ
		for (int i = 0; i < 26; i++) { // i = 65
			System.out.printf("%c", 65 + i);
		}
		System.out.println();// 줄바꾸기

		// 대소대소대소... 'A' : 65 <- (32) -> 'a' : 97
		// AbCdEfGhIj ..........
		for (int i = 'A'; i <= 'Z'; i++) { // i = 65
			if (i % 2 == 0) {

				System.out.printf("%c", i + 32);
			} else {
				System.out.printf("%c", i);

			}
		}
		System.out.println();// 줄바꾸기

		// AbcDefGhi...
		for (int i = 'A'; i <= 'Z'; i++) { // i = 65
			if (i % 3 == 2) {

				System.out.printf("%c", i);
			} else {
				System.out.printf("%c", i + 32);

			}
		}
		System.out.println();// 줄바꾸기

		// ABC-DEF-GHI-
		for (int i = 'A'; i <= 'Z'; i++) { // i = 65
			System.out.printf("%c", i);
			if (i % 3 == 1) {
				System.out.printf("%c", '-');

			}
		}
		System.out.println();// 줄바꾸기

		// A-B=C~D-E=F~G-H=I~....
		int n = 0;
		for (int i = 'A'; i <= 'Z'; i++) { // i = 65

			System.out.printf("%c", i);
			if (n%3==0) {
				System.out.printf("%c", '-');				
			}  
			if (n%3==2) {
				System.out.printf("%c", '~');				
			}  
			if (n%3==1) {
				System.out.printf("%c", '=');				
			}  
			n = n + 1;

//			System.out.printf("%c",'-');
//			System.out.print(i);
//			System.out.print(n);
			
		}
		System.out.println();// 줄바꾸기

	}// main_end
}
