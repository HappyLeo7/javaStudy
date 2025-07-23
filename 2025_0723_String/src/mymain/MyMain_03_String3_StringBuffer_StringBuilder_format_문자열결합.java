package mymain;

public class MyMain_03_String3_StringBuffer_StringBuilder_format_문자열결합 {
	public static void main(String[] args) {
		int count = 0;

		// TODO 문자와 숫자의 합은 메모리 낭비를 많이하기 때문에 지향한다.
		String msg = ++count + " little," + ++count + " little," + ++count + " little lndian";

		System.out.println(msg);
		System.out.println(msg.length());

		// TODO 가비지 컬렉션을 호출하는 명령어
		// System.gc();

		// TODO 해결방안 1 : StringBuffer or StringBuilder 이용해라
		// (처리속도가늦다) (처리속도가빠르다)
		count = 0;
		StringBuffer sb = new StringBuffer(33);  //33이라고 미리 사이즈를 정의해주면 메모리 낭비가 없고 33이라고 사이즈를 정해놔도 더 늘어나면 자동적으로 메모리공간을 추가해준다.
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little lndian");

		// TODO sb.toString을 붙이지 않아도 컴파일과정때 자동으로 .toString을 붙여서 출력해준다.
		System.out.println(sb);
		System.out.println(sb.length());

		String msg1 = sb.toString();
		System.out.println(msg1);
		System.out.println(msg1.length());
		
		//TODO 해결방안 2 : String.format() : 문자열 생성메소드
		count=0;
		String msg2 = String.format("%d little,%d little,%d little lndian",++count,++count,++count);
		System.out.println(msg2);
		System.out.println(msg2.length());
		

	}
}
