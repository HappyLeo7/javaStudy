package myutil;

public class MyMath {
	
	//가장 큰수
	public static int greatest(int ... nr) {
		int max=0;
		//TODO 방법1)
//		for(int i=0;i<nr.length-1;i++) {
//			
//			if(nr[i]<nr[i+1]) {
//				max=nr[i+1];
//			}else {
//				max=nr[i];
//			}
//		}
		
		//TODO 방법2)
		for(int i=0;i<nr.length;i++) {
			if(nr[i]>max) {
				max=nr[i];
			}
		}
		return max;
	}
	
	//가장 작은수
	public static int least(int ... nr) {
		int min=0;
		//TODO 방법1)
//		for(int i=0;i<nr.length-1;i++) {
//			
//			if(nr[i]<nr[i+1]) {
//				min=nr[i];
//			}else {
//				min=nr[i+1];
//			}
//		}
		
		//TODO 방법2)
		for(int i=0;i<nr.length;i++) {
			if(nr[i]<min) {
				min=nr[i];
			}
		}
		return min;
	}
}
