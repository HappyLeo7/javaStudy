package mymain;

import java.util.StringTokenizer;

public class MyMain_05_String5_분류 {
	public static void main(String[] args) {

		String sido_list = "서울 경기 인천 강원도 대전 광주 목포 대구 부산 제주 독도";
		String sido_list2 = "         서울#경기#인천#강원도##대전#광주#목포#대구#부산#제주#독도       ";

		// 문자열을 분리하는 객체
		System.out.println("---[StringTokenizer 이용]---");
		StringTokenizer st = new StringTokenizer(sido_list); // \t \n \r \f 형식을 기준으로 나눠준다. 기본 공백이라 생각하면됨
		StringTokenizer st2 = new StringTokenizer(sido_list2, "#"); // # 이라는 문자 기준으로 나눠준다.
		System.out.println(st2.countTokens()); // 토큰수량 체크
		System.out.println(st2.hasMoreTokens());// 토큰을 가지고 있는지 없는지 체크? boolean 타입을 가진다.

		while (st.hasMoreTokens()) {
			String token = st.nextToken();// 현재위치의 토큰가져오기 -> 다음위치로 이동
			System.out.println(token);
		}
		
		//split 메소드를 이용해서 배열로 분리
		//String [] sido_array = {"서울","경기","인천","강원도",.......,"독도"}
		String[] sidoe_array=sido_list2.split("#");
		System.out.println("---[String의 split()이용]---");
		for(String sa :sidoe_array) {
			System.out.println(sa);
		}
		System.out.println(sido_list2.trim());

	}
}
