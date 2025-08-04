package mymain;

import java.io.FileReader;

public class _02_예외처리방법 {
	public static void main(String[] args) {
		try {
			// 본코드작성
//			int a = 10, b = 0, result;
			int a = 10, b = 1, result;
			// JVM내부에서 예외내용을 던져줬다.
			if (b == 0) {
				throw new ArithmeticException("0으로 나누지 말랬잖아.");//오류던진다

			}
			result = a / b;

//			String str = null;
			String str = "";
			// JVM내부에서 예외내용을 던져준다.
			if(str==null) {throw new NullPointerException("str이 null이다.");
			}
			int len = str.length();
			
			//배열 예외처리
			int [] ar = {1,2,3};
			int index = 2;
			// JVM내부에서 예외내용을 던져준다.
			if(index>=ar.length) {
				throw new ArrayIndexOutOfBoundsException("배열 첨자 벗어남");
			}
			int n =ar[index];
			
			//위쪽에 처리된 예외를 제외한 모든 예외는 Exception 처리하겠다. 
			//딜레이 에러 어떻게 할건지
			Thread.sleep(1000);
			
			//없는 파일 에러
			FileReader fr = new FileReader("a.txt");
			
			//파일 닫기
			fr.close();
			
		} catch (ArithmeticException e) {//오류받는다
			e.printStackTrace(); // 에러난부분을 추적하겠다.
		} catch(NullPointerException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) { // 모든 예외의 최상이 부모는 Exception이다
			e.printStackTrace();
			System.out.println("똑바로해!");
		}

		System.out.println("---[END]---");
	}
}
