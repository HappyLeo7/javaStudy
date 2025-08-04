package mymain;

import java.io.FileReader;

import myutil.MyString;

public class _05_예외처리_throws {
	public static void main(String[] args) {
//		String str ="ABCD";
		String str =null;
		
		
		try {
			FileReader fr = new FileReader("a.txt");
			int len =MyString.getLength(str);
			System.out.print(len);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("null 값이라 처리가 불가능합니다.");
		} finally {
			
		}
		
		System.out.println("---[end]---");
	}//end : main
}
