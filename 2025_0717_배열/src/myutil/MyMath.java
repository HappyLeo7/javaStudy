package myutil;

public class MyMath {
	
	//가장 큰수
	public static int greatest(int ... nr) {
		int num=0;
		for(int i=0;i<nr.length-1;i++) {
			
			if(nr[i]<nr[i+1]) {
				num=nr[i+1];
			}else {
				num=nr[i];
			}
		}
		return num;
	}
	
	//가장 작은수
	public static int least(int ... nr) {
		int num=0;
		for(int i=0;i<nr.length-1;i++) {
			
			if(nr[i]<nr[i+1]) {
				num=nr[i];
			}else {
				num=nr[i+1];
			}
		}
		return num;
	}
}
