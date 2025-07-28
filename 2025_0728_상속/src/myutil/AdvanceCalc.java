package myutil;

public class AdvanceCalc extends BaseCalc {
	//n의 합
	public int hap(int n) {
		int sum=0;
		for(int i = 0 ;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public int hap1(int n) {
		int sum=0;
		for(int i = 0 ;i<=n;i++) {
			//BaseCalc super = new BaseCalc();
			sum=super.plus(sum, i);
		}
		return sum;
	}
	// n's m 승 구하기
	public double pow(int n , int m ) {
		double result= 1.0;
		for(int i =0;i<m;i++) {
			result=result*n;
		}
		return result ;
	}
	public double pow1(int n , int m ) {
		double result= 1.0;
		for(int i =0;i<m;i++) {
//			result=super.multiply(result, n);
			result=multiply(result, n);//생략도 가능하다(가장 가까운 곳에서 찾는다.)
		}
		return result ;
	}
}
