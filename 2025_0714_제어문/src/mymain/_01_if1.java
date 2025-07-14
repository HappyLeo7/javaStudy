package mymain;
import java.util.Random;
public class _01_if1 {
	public static void main(String [] args) {
		
		//방법1) if문을 나열한거라 처리속도는 좋지 않다.
//		Random random =new Random();
//		int age = random.nextInt(10);
//		
//		String result = "";
//		
//		if(age<10) {
//			result = "아동";
//		}
//		
//		if(10<=age&&age<20) {
//			result = "청소년";
//		}
//		
//		if(20<=age&&age<40) {
//			result="성년";
//		}
//		
//		if(40<=age&&age<70) result="장년";
//		if(70<=age) result="노년";
//		
//		System.out.printf("나이는 [%d](세) [%s]이군요!!\n", age,result);
		
		Random random =new Random();
		int age = random.nextInt(10);
		
		String result = "";
		
		if(age<10) {result = "아동";}
		else {if(10<=age&&age<20) {result = "청소년";}
		else {if(20<=age&&age<40) {result="성년";}
		else {if(40<=age&&age<70) {result="장년";}
		else if(70<=age) result="노년";
			 }
			 }
		     }
		System.out.printf("나이는 [%d](세) [%s]이군요!!\n", age,result);
		
		
	}//main_end
}

