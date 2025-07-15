package mymain;
import java.util.Scanner;
public class _11_do_while1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String yn = "y"; //또할지 여부?
		int dan;
		int n=0;
		
		do {
			System.out.print("단?: ");
			dan=scanner.nextInt();
			
			//유효성체크
			if(dan<2||dan>9) {
				System.out.println("단은 2~9사이값을 입력하세요");
				continue; // 현재 조건의 수행명령을 종료하고 다음제어식으로 이동
				}
			
			//구구단 출력
			for(int i=1;i<=9;i++) {
				if(i%2==0) continue;
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			}
			System.out.print("계속하시겠습니까?(y/n)"+n+"코인");
			n++;
			yn=scanner.next();
//		}while(yn.equals("y")||yn.equals("Y"));
		}while(yn.equalsIgnoreCase("y")); //대소문자 구분하지않고 체크한다.
		
		System.out.print("---END---");
		
		scanner.close();
		
	}//main_end
	
}
