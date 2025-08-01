package mymain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_문제1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		List<Integer> n_list = new ArrayList<Integer>();

		System.out.print("갯수 : ");
		n = scanner.nextInt();

		System.out.print("값 : ");
		for (int i = 0; i < n; i++) {
			int m = scanner.nextInt();
			n_list.add(m);
		}

		for (int i = 0; i < n - 1; i++) {

			if (true) {
//				n_list.remove(0);// 첫번째 삭제
//				int s = n_list.get(0);
//				n_list.remove(0);
//				n_list.add(s);
				
				n_list.remove(0);
				n_list.add(n_list.remove(0));
				
				System.out.println(n_list);
			}
		}

		// n= 갯수
		// m= 1 5 3 4 2
		// 1. 첫번째수는 버린다.
		// 2. 다음수는 마지막으로 보낸다.
		// 3. 1개가 남을떄까지 반복

		// 5 3 4 2 -> 3 4 2 5
		// 4 2 5 -> 2 5 4
		// 5 4 -> 4 5
		// 5

		scanner.close();
	}// end : main
}
