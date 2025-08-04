package mymain;

import java.util.Scanner;

public class _08_문제2_수의합 {
	public static void main(String[] args) {
		
	Scanner scanner =new Scanner(System.in);
	int N;
	String data;
	System.out.print("갯수/테이터 : ");
	N =scanner.nextInt(); //5
	data = scanner.next(); //"12345"
	
	int sum = 0;
	for (int i=0;i<N;i++) {
		sum += data.charAt(i)-'0';
	}
	System.out.println(sum);
	}
}
