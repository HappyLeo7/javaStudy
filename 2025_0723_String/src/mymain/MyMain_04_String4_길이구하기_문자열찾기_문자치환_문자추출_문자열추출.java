package mymain;

public class MyMain_04_String4_길이구하기_문자열찾기_문자치환_문자추출_문자열추출 {
	public static void main(String[] args) {
		//		      01234567890123456789012
		String str = "I am TOM You are a Jane";
		
		System.out.println("---[길이구하기]---");
		//길이구하기
		int length=str.length();
		System.out.printf("str's length : [%d]\n",length);
		
		System.out.println("");
		System.out.println("---[검색기능]---");
		//검색기능 ( 왼쪽부터 오른쪽으로 검색 )
		int index =str.indexOf('a');
		System.out.printf("a's 위치 index : [%d]\n",index);
		
		//검색기능 ( 문자열도 찾는다. )
		index=str.indexOf("You");
		System.out.printf("You's 위치 index : [%d]\n",index);
		
		//검색기능 ( '찾을문자' , 몇번째부터 체크를 시작해라 )
		index=str.indexOf('a',10);
		System.out.printf("index 10부터 검색된 a's 위치 index : [%d]\n",index);

		//검색기능 ( 오른쪽에서 왼쪽방향으로 찾는다 )
		index=str.lastIndexOf('a');
		System.out.printf("뒷쪽부터 검색된 a's 위치 index : [%d]\n",index);
		
		System.out.println("");
		System.out.println("---[치환기능]---");
		//치환기능 
		String str1 = str.replace("TOM", "톰"); // TOM이라는걸 다바꿔줌
		String str2 = str.replaceFirst("a", "에이"); //첫번째꺼만 바뀜
		String str3 = str.replaceAll("a", "에이"); //다바꾼다.
//		str = str.replace("TOM", "톰");
		System.out.printf("원본: [%s]\n",str);
		System.out.printf("사본: [%s]\n",str1);
		System.out.printf("사본: [%s]\n",str2);
		System.out.printf("사본: [%s]\n",str3);
		
		
		//추출기능
		//문자추출
		System.out.println("");
		System.out.println("---[추출기능,문자추출]---");
		index = 5;
		char ch = str.charAt(index);
		System.out.printf("index [%d]번째 문자는 [%c]\n",index,ch);
		
		System.out.println("");
		System.out.println("---[추출기능,문자열추출]---");
		//문자열추출
		String str4=str.substring(9); // index 9부터 끝까지 출력
		System.out.println(str4);
		//					   5<=추출범위 <8
		String str5=str.substring(5,5+3); // index 5~8까지만 출력해서 "TOM"만 가져오기
		System.out.println(str5);
		
		//반복출력기능
		System.out.println("");
		System.out.println("---[문자반복출력기능]---");
		String str6 ="안녕".repeat(3);
		System.out.println(str6);
		
		//분리기능
		System.out.println("");
		System.out.println("---[분리기능]---");
		String str7 = "딸기 참외 수박 만두 짜장 사과";
		String [] fruit_array= str7.split(" "); //공백을 기준으로 배열로 만들어진다.
		//String [] fruit_array ={"딸기","참외","수박","만두","짜장","사과"};
		for(int i=0;i<fruit_array.length;i++) {
			System.out.printf("fruit_array[%d] : %s\n",i,fruit_array[i]);
		}
	}
}
