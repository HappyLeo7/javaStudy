package mymain;

import java.util.Scanner;

public class _08_입력연습 {
	public static void main(String [] args) {
		String name;
		char gender;
		int age;
		String addr;
		double ki;
		boolean bMarried;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름 입력 : ");
		name=scanner.next(); //공백/엔터까지만 입력
		
		System.out.printf("나이 입력 : ");
		age=scanner.nextInt();
		
		scanner.nextLine(); // 키보드 버퍼에 남아있는 엔터 버리기 (위에 나이를 적을때 엔터가 남아있기때문에 엔터를 버리기위해서 nextLine()을 한번 추가해준다.)
		System.out.printf("주소 입력 : ");
		addr=scanner.nextLine(); //공백포함해서 입력 받는다.(엔터까지 입력받는다.) 
		
		System.out.printf("키 입력 : ");
		ki = scanner.nextDouble();
		
		System.out.printf("결혼유무(true,false) 입력 : ");
		bMarried= scanner.nextBoolean();

		System.out.printf("성별(남 or 여) 입력 : ");
		//인덱스가 존재		            
		gender= (scanner.next()).charAt(0);
		
		
		System.out.printf("이름:%s\n",name);
		System.out.printf("나이:%d\n",age);
		System.out.printf("주소:%s\n",addr);
		System.out.printf("키:%.1f\n",ki);
		System.out.printf("결혼유무:%b\n",bMarried);
		System.out.printf("성별:%c\n",gender);
		
		scanner.close();
		
	}
}
