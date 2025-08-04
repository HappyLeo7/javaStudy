package mymain;

public class _01_고전적예외처리방법 {

	public static void main(String[] args) {
		//첫번째 예외처리
		int a = 10,b=0,result;
		if(b!=0) {
		result = a/ b;
		}
		
		
		//두번째 예외처리
		String str = null;
		int len;
		if(str!=null) {
		len = str.length();
		}
		
		//
		int [] ar = {1 , 2, 3};
		int index=5;
		int n;
		if(index>=ar.length) {
			n=ar[index];
		}
		
		System.out.println("---[End]---");
	}
}
