package myutil;

public class MyInteger {

	public static String toBinaryString(int n) {
		
		StringBuffer sb = new StringBuffer(); //Buffer 임시 저장 장소
		
		for(int i=31;i>=0;i--) {
			sb.append(n>>>i&1);
		}
		
		return sb.toString();
	}

}
