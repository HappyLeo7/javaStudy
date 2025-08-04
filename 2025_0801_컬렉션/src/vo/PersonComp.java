package vo;

import java.util.Comparator;

// PersonVo에 대한 비교기준을 설정하는 객체
public class PersonComp implements Comparator<PersonVo>{

	public static final int SORT_FIELD_NAME=1;
	public static final int SORT_FIELD_AGE=2;
	public static final int SORT_FIELD_ADDR=3;
	
	public static final int SORT_METHOD_ASC=1;
	public static final int SORT_METHOD_DESC=2;
	
	int sort_field = SORT_FIELD_NAME; //소트항목
	int sort_method = SORT_METHOD_ASC; //소트방법

	
	public int getSort_field() {
		return sort_field;
	}


	public void setSort_field(int sort_field) {
		this.sort_field = sort_field;
	}


	public int getSort_method() {
		return sort_method;
	}


	public void setSort_method(int sort_method) {
		this.sort_method = sort_method;
	}


	@Override
	public int compare(PersonVo o1, PersonVo o2) {
		int result = 0;

		
		if(sort_field==SORT_FIELD_NAME) {
			
		//이름순 오름차순
		if(o1.getName().compareTo(o2.getName())>0) {
			result=1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			result=-1;
		}
		}else if(sort_field==SORT_FIELD_AGE) {
			//나이순정렬 오름차순
			if(o1.getAge()>o2.getAge()) {
				result=1;
			}else if(o1.getAge()<o2.getAge()) {
				result=-1;
			}
			// 결과 값이 0 이면 그대로 이고 1이면 앞뒤 위치 바뀐다.
			
		}else if(sort_field==SORT_FIELD_ADDR) {
			//주소 오름차순
			if(o1.getAddr().compareTo(o2.getAddr())>0) {
				result=1;
			}else if(o1.getAddr().compareTo(o2.getAddr())<0) {
				result=-1;
				
			}
		}
		
		//내림차순으로 변경
		if(sort_method==SORT_METHOD_DESC) {
			result=-result;
			
		}
		return result;
	}

}
