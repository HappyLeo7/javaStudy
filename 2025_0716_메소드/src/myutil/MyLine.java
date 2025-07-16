package myutil;

public class MyLine {
	// Call By Name(이름을 이용해서 호출)
	public static void drawLineTop() {
		System.out.println("┌─────────────────────────────────────────────┐");
	}

	public static void drawLine() {
		System.out.println("│---------------------------------------------│");

		return;
	}

	public static void drawLineMid() {
		System.out.println("├─────────────────────────────────────────────┤");
	}

	public static void drawLineBottom() {
		System.out.println("└─────────────────────────────────────────────┘");
	}

	// 2개 메소드관계
	// Method Overload(중복 메소드)
	// 메소드명 동일하나 + 호출인자정보가 틀린메소드

	// Call By Value (값을 넘겨서 호출 받는다)
	public static void drawLine(int len) {
		System.out.print("│");
		for (int i = 1; i <= len; i++) {
			System.out.print("-");
		}
		System.out.print("│");
		System.out.println();// 줄바꾸기
	}

	// Call By Value (그리기모양 , 길이)
	public static void drawLine(char pattern, int len) {
		System.out.print("│");
		for (int i = 1; i <= len; i++) {
			System.out.print(pattern);
		}
		System.out.print("│");
		System.out.println();// 줄바꾸기
	}

	
	// * - 패턴그리기 ('*',1 , '-' ,2 , 10)
	// *--*--*--*
	public static void drawLine(char pattern1, int len1, char pattern2, int len2, int len) {

		//방법1)
		int tol = len1 + len2;
		int index = 0;
		for (int i = 0; i < len; i++) {


			// 자리수 len1+len2
			index = i % tol;
			if ((index) < len1) {
				System.out.print(pattern1);
			} else {
				System.out.print(pattern2);
			}

		}
		System.out.println();
		
//		//방법2)while 방법
//		int count = 0 ;
//		while(true) {
//			//패턴1출력
//			for(int i=0;i<len1;i++) {
//				System.out.print(pattern1);
//				count++;
//				if(count==len) {
//					System.out.println();
//					return;
//				}
//			}
//			//패턴2출력
//			for(int i=0;i<len2;i++) {
//				System.out.print(pattern2);
//				count++;
//				if(count==len) {
//					System.out.println();
//					return;
//				}
//			}
//			
//		}//while_end
	}

	//3개 패턴 
	public static void drawLine(char pattern1, int len1, char pattern2, int len2,char pattern3, int len3, int len) {
		
		for (int i = 0; i < len; i++) {
			if(i%(len1+len2+len3)<len1) {
				System.out.print(pattern1);
			}else if(i%(len1+len2+len3)-len1<len2) {
				System.out.print(pattern2);
				
			}else {
				
				System.out.print(pattern3);
			}
			
			
			
			
			
		}
	}

}
