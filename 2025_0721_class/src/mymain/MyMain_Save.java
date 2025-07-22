package mymain;


import myutil.Save;

public class MyMain_Save {
	public static void main(String[] args) {
		// stack에 저장  =  new 한건 heap에 저장
		Save [] s_array= new Save[]{
				new Save("일길동", 1000000),
				new Save("이길동", 2000000),
				new Save("삼길동", 3000000)
				
		};
		
		//TODO 이율설정 => 정적변수 표현방법 : 클래스명.변수명
		Save.rate=0.1;
		
		//TODO The static field Save.rate should be accessed in a static way
//		s_array[0].rate=0.1;
		
		System.out.println("--[첨자를 이용한 for문]--");
		for(int i=0;i<s_array.length;i++) {// i = 0 1 2
			s_array[i].display();
			
		}
		
		Save.rate=0.3;
		
		System.out.println("---[개선loop방식]---");
		for(Save s : s_array) {
			s.display();
		}
		int[] nr= {1,2,3,4,5,6,6,7,7,8,8,9,0,0,12,31,54,25,34,56,326,456};
		for(int z :nr ) {
			System.out.println(z);
		}
	}
}
