package mymain;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class _06_MapTest2_단어장 {
	public static void main(String[] args) {
		//단어장 용도의 맵
		//key = 단어   value="뜻"
		//key = one   value="하나란 뜻입니다."
		
		Map<String, String> 단어장=new TreeMap<String,String>();
		단어장.put(".subString()", "String 타입의 문자를 자를때 사용");
		단어장.put(".equals()", "같은 문자 찾기");
		단어장.put("메소드()", "기능을 가지고 있는 함수or메소드 라고한다.");
		단어장.put("TreeMap", "컬렉션 자료 구조형이고 정렬된 구조로 key와 value를 가진다.");
		단어장.put(String.valueOf("하민지"), "Pow~ Pow~ 를 좋아함");
		단어장.put(String.valueOf("권용대"), "권용대님이란 이름이고 그분은 8월1일 치맥을 먹을 예정");
		단어장.put(String.valueOf("이상재"), "오늘 저녁은 간단하고 맛있고 자극적인것 공기를 마실예정");
		
		
		
		
		
		Scanner sc = new Scanner(System.in); //스캐너 가져옴
//		System.out.println(단어장);
		
		System.out.println(); //줄바꿈
		Set<String> keySet=단어장.keySet(); //Map의 key는 Set타입의 메소드인 .keySet() 메소드를 사용하여 key값만 배열로 따로 저장가능
		System.out.print("찾는단어를 입력하시오 : "); //사용자를 위한 안내멘트
		String eq = sc.next(); // String 문자를 스캐너로 받아오고 eq변수에 넣는다.
		for(String key: keySet) {
			if(key.contains(eq)==true) {
//				System.out.println(key);
				System.out.printf("%s 의 뜻은 %s\n",key,단어장.get(key));
			}
		}
		
	}//end : main
}
