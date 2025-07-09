package mymain;

//위치정보를 알려준다.
import java.util.Scanner;

public class _04_문제1 {
	public static void main(String[]args) {
	int garo,sero;
	
	//System.in : 표준입력 장치(키보드장치)
	//System.out : 표준출력장치
	
	//키보드로 부터 입력 받는다.
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("가로 : ");
	garo=scanner.nextInt();
	System.out.print("세로 : ");
	sero=scanner.nextInt();
	
	System.out.printf("garo : %d\n", garo);
	System.out.printf("sero : %d\n", sero);
	int extent = garo * sero;
	System.out.printf("extent : %d(㎠)\n", extent);
	//사용완료후 반납
	
	
	
	scanner.close();
	
	}
}
