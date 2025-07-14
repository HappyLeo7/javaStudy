package mymain;

public class _05_for1 {
	public static void main(String[] args) throws InterruptedException {

		int sum =0; //누적값
		int n= 100;
		String result="";
		
		for (int i = 0; i <= 10; i++) {
			
			//값을 누적
			sum+=i;
			
			//값의 변화에 대한 시각적 효과
			result=(i==10)?"=" : "+";
			System.out.print("[" + i + "]");
			System.out.print(result);

			// 코드수행상태를 시간만큼 정지시킨다.
			Thread.sleep(1000);
		}
		System.out.println(sum);
	}
}
