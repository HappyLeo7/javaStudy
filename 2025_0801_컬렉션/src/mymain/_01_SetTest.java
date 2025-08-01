package mymain;

import java.util.HashSet;
import java.util.Set;

public class _01_SetTest {
public static void main (String[]a) {
	/**TODO 컬렉션 설명 Set 설명
	 Collection
	 1. 자바의 객체만 저장관리하는 자료구조
	 
	 Set (인터페이스)
	 ㄴ HashSet   or   TreeSet   (Class)
	 1. 순서없이 저장관리되는 자료구조
	 2. 중복허용되지 않는다.
	 */

	//인터페이스 = new 클래스()
	// 설명서      설계서
	 Set set = new HashSet();
	 
	 Integer iOb=new Integer(19); // 이렇게 쓰지말라고 권고함
	 Integer iOb1=Integer.valueOf(18); //객체를 만들어서 값을 넣는것
	 
	 //Auto-Boxing : JDK5.0 버전 이후
	 Integer iOb2=1; // 1 (형변환) -> new Integer(1);
	
	 //Auto-Unboxing
	 int n = iOb2;  //iOb2.intValue(); 으로 jvm이 처리해준다
	 double d= iOb2; //iOb2.DoubleValue(); 으로 jvm이 처리해준다
	 float f =iOb2; //iOb2.floatValue(); 으로 jvm이 처리해준다
	 
	 set.add(iOb1);
	 set.add(20); //Integer.valueOf(1);
	 set.add("야호");
	 set.add(10.5); // Double.valueOf(10.5)==new Double(10.5)   -> new는 권장안함;
	 set.add(true); // Boolean.valueOf(true); 
	 Double.valueOf(11.1); //valueOf() 는 new Double()을 리턴한다.
	 
	 for(int i =0 ;i<10;i++){
		 
		 set.add(i);
	 }
	 //중복으로 false가 되었을 것이다.
	 for(int i =0 ;i<10;i++){
		 
		 set.add(i);
	 }
	 //set 은 toString으로 재정의 되어있음
	 System.out.println(set);
	
	}
}
