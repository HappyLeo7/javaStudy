package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _02_SetTest2 {
	public static void main(String[] args) {
		
	
	//TODO Generic, <> : 객체 생성시 저장타입을 지정
		//Integer 타입만 저장관리
		Set<Integer> lottoSet =new TreeSet<Integer>(); //TODO TreeSet 정렬해서 저장
		Random random = new Random();
		int n =6;
		while(n>0) {
			int no = random.nextInt(45)+1; // 1~45
			if(lottoSet.add(no)==false) {
				continue;
			}
			n--;
		}
		System.out.println(lottoSet);
		
		//String 타입만 저장관리
		Set<String> fruitSet = new HashSet<String>(); //TODO HashSet 무작위 저장
		fruitSet.add("천두복숭아");
		fruitSet.add("딸기");
		fruitSet.add("바나나");
		fruitSet.add("키위");
		
		System.out.println(fruitSet);
		
		System.out.println("----[개선 loop]----");
		
		//for (타입 변수 : 배열 or 컬렉션 or Map )
		for(Integer no : lottoSet) {
			System.out.printf("%4d",no);
		}
		System.out.println();//줄바꾸기
	
		//Iterator를 이용한 요소 추출
		System.out.println("----[Iterator 이용]----");
		Iterator<Integer> it = lottoSet.iterator();
		while(it.hasNext()) { // .hasNext()는 요소를 가지고 있냐고 물어보는 Iterator 의 메소드
//			int num=it.next(); //int 를 넣어도 되는 경우는 Auto-Unboxing 과정이 이루어진다.
			Integer num=it.next(); //가져온후 다음으로 이동
			System.out.printf("%3d",num);
			
		}
		
	}
}
