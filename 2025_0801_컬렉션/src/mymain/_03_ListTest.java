package mymain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_ListTest {
	public static void main(String[] args) {
		//ArrayList : 동적 배열
		// 			  순서가 있는 자료 구조
		//			  data 중복 허용
		//   interface   = new 클래스(); Up-castind
		List<String> sido_list = new ArrayList<String>() ;
		System.out.println(sido_list.size()); // 저장된 크기 (갯수?) : 0 
		sido_list.add("서울"); //0
		sido_list.add("서울"); //1
		sido_list.add("경기"); //2
		sido_list.add("부산"); //3
		sido_list.add("대전"); //4
		sido_list.add("광주"); //5
		sido_list.add("제주"); //6
		sido_list.add(String.valueOf("독도")); //7
		sido_list.add(new String("독도")); //8
		System.out.println(sido_list.size()); // 저장된 크기 (갯수?) : 3
		
		//수정
		sido_list.set(8, "울산");
		
		
		
		System.out.println("----[첨자(index)를 이용한 요소 추출 (before remove)]----");
		for(int i=0;i<sido_list.size();i++) {
			System.out.printf("sido_list's %d번째 요소 : %s\n",i,sido_list.get(i));
		}
		//삭제
		sido_list.remove(3);
		System.out.println("----[첨자(index)를 이용한 요소 추출 (after remove)]----");
		for(int i=0;i<sido_list.size();i++) {
			System.out.printf("sido_list's %d번째 요소 : %s\n",i,sido_list.get(i));
		}
		
		System.out.println(sido_list);
		
		System.out.println("----[개선 loop]----");
		for(String sido : sido_list) {
			System.out.printf("%5s",sido);
		}
		System.out.println();//줄바꾸기
		
		System.out.println("----[Iterator를 이용]----");
		
		
		Iterator<String> it = sido_list.iterator();
		while(it.hasNext()) {
			String sido = it.next();
			System.out.printf("%5s",sido);
		}
		
		List<Integer> id=new ArrayList<Integer>();
		id.add(3);
		id.add(5);
		id.add(5);
		id.add(5);
		id.add(2);
		id.add(1);
		

		//index으로 제거
		id.remove(3);
		for(Integer no : id) {
			System.out.printf("%d\n",no);
		}
		System.out.println();
		//Object로 제거하기때문에 index 3과 int 3 구분 할 수 있다. 
		id.remove(new Integer(3));
		for(Integer no : id) {
			System.out.printf("%d\n",no);
		}
		
	}//end : main
}
