package mymain;

import java.util.Random;

public class _10_3항연산자 {
	public static void main(String[] args) {
		// 형식) (조건) ? 참값 : 거짓값 ;
		
		Random random =new Random(); 
		
		int a = random.nextInt(1000)+1; // bound : 경우의수 
		int b =  random.nextInt(1000)+1;
		int c = (int) Math.random()*10;
		int
		 result
		 = (
				 a
				 >b)
		 ?
				 a: 
					 b;
		
		
		System.out.printf("%d , "
				                 + "%d중 큰수는 "
				+ "%d입니다."
				               + "\n", a
				
				
				                        ,b,
				
				result);
	}
}
