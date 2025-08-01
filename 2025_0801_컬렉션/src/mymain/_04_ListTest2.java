package mymain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vo.PersonVo;

public class _04_ListTest2 {
	public static void main(String[] args) {
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("일길동",21,"봉천1동"));
		p_list.add(new PersonVo("이길동",21,"봉천1동"));
		p_list.add(new PersonVo("삼길동",21,"봉천1동"));
		p_list.add(new PersonVo("사길동",21,"봉천1동"));
		p_list.add(new PersonVo("오길동",21,"봉천1동"));
		p_list.add(new PersonVo("오길동",21,"봉천1동"));
		p_list.add(new PersonVo("오길동",21,"봉천1동"));

		
		System.out.println(p_list);
		System.out.println("----[첨자]----");
		for(int i=0;i<p_list.size();i++) {
			System.out.println(p_list.get(i));
		}
		System.out.println("----[개선loop]----");
		for(PersonVo p : p_list) {
			if(p.getAge()>=23) {
				System.out.println(p);
			}
		}
		System.out.println("----[Iterator 토큰형식?]----");
	Iterator<PersonVo>it = p_list.iterator();
	System.out.println(it.hasNext());
	while(it.hasNext()) { //it data가 있는지 여부 체크
		PersonVo p=it.next();
		if(p.getName().substring(0,1).equals("오")) {
//		if(p.getName().startsWith("오")) { //String .starsWith() 처음시작하는 문자를 찾는다.
//			if(p.getName().contains("이")) { //String .contains() 해당문자가 포함되어있는 문자를 찾는다.
			
			System.out.println(p);
		}
	}
	System.out.println(it.hasNext());
	
	char cc= '이';
	System.out.println((int)cc);
	
	}//end : main
	
	
}
