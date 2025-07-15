package mymain;

public class _21_문제2_별찍기 {
	public static void main(String[] args) throws InterruptedException {
		
		//별1
		for (int i =0; i < 5; i++) {
			for (int o =0; o < 5; o++) {
				System.out.print("* ");
//				Thread.sleep(500);
			}
			System.out.println();
		} // for_end

		System.out.println("=====별1 End=====");
		//별2
		int p=0;
		for (int i =0; i < 5; i++) {
			for (int o =0; o < 5; o++) {
				System.out.print("* ");
//				Thread.sleep(500);
				
				if(i==p&&o==p) {
					break;
				}
				
			}
			p++;
			System.out.println();
		} // for_end
		System.out.println("=====별2 End=====");
		
		
		//별2-1
		for (int i =0; i < 5; i++) {
			for (int o =0; o < 5; o++) {
				System.out.print("* ");
//				Thread.sleep(300);
				if(i<=o) {
					break;
				}
			}
			System.out.println();
		} // for_end

		System.out.println("=====별2-1 End=====");
		
		
		//별2-2
		for (int i =0; i < 5; i++) {
			for (int o =0; o < 5; o++) {
				
				if(o<=i) {
					System.out.print("* ");
				}else{
					System.out.print("- ");
					
				}
			}
			System.out.println();
		} // for_end
		
		System.out.println("=====별2-1 End=====");
		
		
		//별3
		for (int i =0; i < 5; i++) {
			for (int o =0; o < 5; o++) {
				
				if(i==0&&o==2) {
					System.out.print("* ");
				}else if(i==1&&1<=o){
					System.out.print("* ");
					if(o==3) {
						break;						
					}
				}else if(2==i){
					System.out.print("* ");
					
				}else if(i==3&&1<=o){
					System.out.print("* ");
					if(o==3) {
						break;
					}
				}else if(i==4&&o==2){
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
					
				}
			}
			System.out.println();
		} // for_end
		
		System.out.println("=====별3 End=====");
		
		
		//별3-1
		int a=0;
		int m=0;
		int su=11;
		int num=su/2;
		for (int i =0; i < num; i++) {
			for (int o =0; o < num; o++) {
				
				if(i==num-num&&o==num/2) {
					System.out.print("* ");
				}else if(i==a&&o==num/2||i==a&&o==num/2+i||i==a&&o==num/2-i){
					System.out.print("* ");
					
//				}else
//					if(i==2&&o<=4){
//					System.out.print("* ");
//					
//				}else
//					if(i==3&&o==2||i==3&&o==2+1||i==3&&o==2-1){
//					System.out.print("* ");
//					
//				}else if(i==4&&o==2){
//					System.out.print("* ");
//					
				}else
				{
				System.out.print("- ");
				}
			}
			a++;
			m--;
			System.out.println();
		} // for_end
		
		System.out.println("=====별3-1 End=====");
		
		
		//별4
				for (int i =0; i < 5; i++) {
					for (int o =0; o < 5; o++) {
						
						if(o<i) {
							System.out.print("- ");
						}else{
							System.out.print("* ");
							
						}
					}
					System.out.println();
				} // for_end
				
				System.out.println("=====별4 End=====");
				
				
				//별 마른모
				for (int i =0; i < su; i++) {
					for (int o =0; o < su; o++) {
						
						if(i<=num) {
							if(o>=num-i&&o<=num+i) {
								System.out.print("* ");
							}else {
								
								System.out.print("- ");
							}
						
						}else {
							int at=su-i-1;
							if(o>=num-(su-i-1)&&o<=num+(su-i-1)) {
								System.out.print("* ");
								
							}else {
								
								System.out.print("- ");
							}
							
						}
							
						
					}
					System.out.println();
				} // for_end
				
				System.out.println("=====별 마른모 End=====");
		
		
		
	}// main_end
}
