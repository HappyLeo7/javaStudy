package mymain;

public class MyMain_01_String1_묵시_명시적생성방법 {
	public static void main(String[] args) {
		//TODO String : 문자열 관리하는 객체
		//		1.생성방법
//				1)묵시적생성방법
					String name ="홍길동";
//				2)명시적생성방법 (heap 메모리에 저장)
					String name2=new String("박길동");
					
					//묵시적방벙
					String s1 ="Twinkle";
					String s2 ="Twinkle";
					
					System.out.println(s1);
					System.out.println(s2);
					if(s1==s2) {
						System.out.println("==같다==");
					}else {
						System.out.println("==다르다==");
					}
					
					
					//명시적방법
					String s3 =new String("little Star");
					String s4 =new String("little Star");
					System.out.println(s3);
					System.out.println(s4);
					
					
//					if(s3==s4) {
					if(s3.equals(s4)) {  // 문자열포함 모든 객체의 비교는 equals() 사용해야한다. 
						System.out.println("==같다==");
					}else {
						System.out.println("==다르다==");
					}
	}
}
