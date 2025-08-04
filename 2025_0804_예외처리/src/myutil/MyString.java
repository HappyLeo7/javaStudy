package myutil;

public class MyString {
	//						여기서쓰는 throws는 해당 메소드를 호출한 곳에서 예외처리해라를 의미
	public static int getLength(String str) throws Exception {
		
		// throws는 메소드에서 (내부)생긴문제를 외부에 알리기 위한 수단으로
		if(str==null) {
			throw new Exception("str is null"); //경고 메세지 
		};
		return str.length();
	}
}
