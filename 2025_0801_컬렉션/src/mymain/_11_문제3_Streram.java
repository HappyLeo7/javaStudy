package mymain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_문제3_Streram {

	public static void main(String[] args) {

//		int [] arr= {80,21,33,70,91,70,56,60,21,100,42,30,91};
//		
//		IntStream is=Arrays.stream(arr);
//		
//		//
//		String result=is.boxed().distinct().sorted().filter(n->n%7==0).map(n->""+n).reduce("",(a,b)->b+a);
//		System.out.println(result);
//		
//		//N개의 숫자가 공백없이 받아오고 그수의 합을 출력
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		String num=sc.next();
//		
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=num.charAt(i)-'0';
//		}
//		System.out.println(sum);

		// N장의 카드

		List<Integer> n_list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			n_list.add(i);
		}
		for (int i = 0; i < n - 1; i++) {
			n_list.remove(0);
			n_list.add(n_list.remove(0));
		}
		System.out.println(n_list);
		sc.close();

	}
}
