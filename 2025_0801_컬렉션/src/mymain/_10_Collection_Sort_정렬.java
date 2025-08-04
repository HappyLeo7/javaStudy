package mymain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vo.PersonComp;
import vo.PersonVo;

public class _10_Collection_Sort_정렬 {
	public static void main(String[] args) {
		List<Integer> n_list=new ArrayList<Integer>();
		n_list.add(1);
		n_list.add(5);
		n_list.add(3);
		n_list.add(2);
		n_list.add(4);
		
		System.out.println(n_list);
		Collections.sort(n_list); // 오른차순 정렬
		System.out.println(n_list);
		
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("감길동",25,"봉천1동"));
		p_list.add(new PersonVo("이길동",24,"봉천2동"));
		p_list.add(new PersonVo("남길동",23,"봉천3동"));
		p_list.add(new PersonVo("사길동",22,"봉천4동"));
		p_list.add(new PersonVo("오길동",21,"봉천5동"));
		p_list.add(new PersonVo("오기동",20,"봉천6동"));
		p_list.add(new PersonVo("오사동",26,"봉천7동"));
		
		PersonComp comp = new PersonComp();
		//나이순 오름
		System.out.println("---[나이순 오름차순]---");
		comp.setSort_field(comp.SORT_FIELD_AGE);
		Collections.sort(p_list,comp); //정렬시킴 .sort에서 compare메소드를 호출한다.
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		//나이순 내림
		System.out.println("---[나이순 내림름차순]---");
		comp.setSort_field(comp.SORT_FIELD_AGE);
		comp.setSort_method(comp.SORT_METHOD_DESC);
		Collections.sort(p_list,comp);
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		//이름순
		System.out.println("---[이름순 오름차순]---");
		comp.setSort_field(comp.SORT_FIELD_NAME);
		comp.setSort_method(comp.SORT_METHOD_ASC);
		Collections.sort(p_list,comp);
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		System.out.println("---[이름순 내림름차순]---");
		comp.setSort_field(comp.SORT_FIELD_NAME);
		comp.setSort_method(comp.SORT_METHOD_DESC);
		Collections.sort(p_list,comp);
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		//주소순
		System.out.println("---[주소순 오름차순]---");
		comp.setSort_field(comp.SORT_FIELD_ADDR);
		comp.setSort_method(comp.SORT_METHOD_ASC);
		Collections.sort(p_list,comp);
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		System.out.println("---[주소순 내림름차순]---");
		comp.setSort_field(comp.SORT_FIELD_ADDR);
		comp.setSort_method(comp.SORT_METHOD_DESC);
		Collections.sort(p_list,comp);
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
//		System.out.println("ABC".compareTo("ABC"));
//		System.out.println("aBC".compareTo("ABC"));
//		System.out.println("ABC".compareTo("BBC"));
		
	}
}
