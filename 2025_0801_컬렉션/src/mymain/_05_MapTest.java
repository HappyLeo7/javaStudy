package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _05_MapTest {
	public static void main(String[] args) {
		//TODO Map : Key , Value 한쌍으로 저장관리되는 자료구조
		//      ㄴ TreeMap , HaehMap
		//										TreeMap에서 Integer 위치는 Set 형식이다. (중복값불허 , 저장순서가 없음)
		Map<Integer,String>telMap = new TreeMap<Integer,String>(); //Key 정렬됨.
		Map<Boolean,String>telMap1 = new HashMap<Boolean,String>(); //Key 정렬됨.
		telMap1.put(true, "참");
		telMap1.put(false, "안돼");
		
		System.out.println(telMap1);
		
		//Map  .put() 데이터 넣기
		telMap.put(Integer.valueOf(1), "010-111-1234");
		telMap.put(2, "010-222-1234"); //Key : Auto-Boxing
		telMap.put(3, "010-333-1234");
		telMap.put(4, "010-444-1234");
		telMap.put(5, "010-555-1234");
		telMap.put(6, "010-666-1234");
		telMap.put(1, "010-000-1234"); //Key 가 같으면 수정이 된다.
		
		System.out.println(telMap);
		
		int short_num=2;
		String result_tel=telMap.get(short_num);
		System.out.printf("단축번호 %d = %s\n",short_num,result_tel);
		
		
		//전체정보를 조회
		Set<Integer> keySet=telMap.keySet();
		System.out.println(keySet);
		System.out.println("----[Map 전체정보]----");
		for(Integer key:keySet) {
			String value = telMap.get(key);
			System.out.printf("단축번호 %d = %s\n",key,value);
		}
		
	}//end main
}
