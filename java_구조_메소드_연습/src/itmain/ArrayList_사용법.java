package itmain;

import java.util.ArrayList;
import java.util.List;

import itutil.MyConsole;

public class ArrayList_사용법 {
	public static void main(String[] args) {
		//배열 넣어보기
		
		List<MyConsole> list=new ArrayList<MyConsole>();
		//정보 추가
		list.add(new MyConsole("안녕"));
		list.add(new MyConsole("하세"));
		list.add(new MyConsole("요?"));
		list.add(new MyConsole("김씨"));
		
		System.out.println(list.toString());
		
		System.out.println(list.get(0));
	}
}
