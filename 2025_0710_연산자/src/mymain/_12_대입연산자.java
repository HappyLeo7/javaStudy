package mymain;

public class _12_대입연산자 {
	public static void main(String[] args) {
		int n =10;
		
		n++;  // n=n+1;
		
		//복합대입연산자
		n+=2; // n = n+2;
		n*=2; // n=n*2;
		n>>=1; // n= n >> 1;
		
		
		
		int x=1;
		int y=2;
		//   & (2진논리 AND) : 경제적연산이 불가능
		//  && (일반논리 AND) : 경제적연산이 가능 
		//경제적연산
		boolean bResult = --x>0 && ++y>0;
		// x=0  y=2 bResult = false
		
		System.out.printf("x= %d y=%d bResult=%b\n", x,y,bResult);
		
		bResult = ++x>0 | ++y>0;
		// x=1 y=3 bResult = true
		System.out.printf("x= %d y=%d bResult=%b\n", x,y,bResult);
		
		int m = 6;
		if(m%2==0 && m%3==0) {
			System.out.println("2, 3 의 배수입니다.");
		}
		
	}
}
