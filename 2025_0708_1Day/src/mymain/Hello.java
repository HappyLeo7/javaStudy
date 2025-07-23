package mymain;

public class Hello {

	// 단축키
	// 1라인 주석    : ctrl + /(toggle)
	// 여러라인 주석  : ctrl + shift + / (설정) & ctrl + shift + \ (해체)
	// 화면 크기 조절 : ctrl + shift + "+" or "-"
	
	// 화면 정렬 	   : ctrl + shift + F
	// import정렬   : ctrl + shift + o
	
	// 복사         : ctrl + alt + 방향키

	public static void main(String[] args) {
//		System : 클래스명
//		out    : 객체명
//		println: 메소드명(함수명) print + line next (줄바꾸기)
//		print  : 출력만
//		printf : 출력서식대로 출력해라
		
		
//		CUI (Console User Inteface) console은 단순한 입출력장치
//		TUI (Text    User Interface)

		System.out.println("안녕하십니까?");
		System.out.println("안녕하십니까?");
		System.err.println("에러메세지");
		
		String name = "홍삼동"; // %s  <- String 문자
		int age =30;		  // %d <-Decimal 정수
		double ki = 180.5;	  // %f <- 실수
		
		System.out.printf("이름 : %.1f\n 나이 : %s(살)\n신장:%d\n%s",
				                 ki,       name,       age, name);
		
		// write(문자)
		System.out.write(65);
		System.out.flush(); //위에 숫자를 출력할수 없기 때문에 flush()가 필요		

		
	}

}
