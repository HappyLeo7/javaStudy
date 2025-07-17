package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_Array1_초기화 {
	public static void main(String[] args) {
		int n = 10;  //변수 선언과 동시에 값을 넣는걸 초기화라 한다.
		
		//배열 초기화식 new int[] {} ;
		int [] fdsakjflkasjdflkasjdhnflkjsd_1= new int[] {1,2,3,4,5};
		int [] fdsakjflkasjdflkasjdhnflkjsd_2=  {1,2,3,4,5}; //new int[]을 생략해도 된다.
		
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_1);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_2);

		//정렬하기
		int [] fdsakjflkasjdflkasjdhnflkjsd_3=  {3,1,5,2,4};
		System.out.println("---[before sort]---");
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_3);
		
		
		System.out.println("---[after asc sort]---");
		
		//기존API 이용
		Arrays.sort(fdsakjflkasjdflkasjdhnflkjsd_3);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_3);
		
		
		int [] fdsakjflkasjdflkasjdhnflkjsd_4=  {3,1,5,2,4};
		MyArrays.sort_asc(fdsakjflkasjdflkasjdhnflkjsd_4);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_4);
		
		
		System.out.println("---[after desc sort]---");
		int [] fdsakjflkasjdflkasjdhnflkjsd_5=  {3,1,5,2,4};
		MyArrays.sort_desc(fdsakjflkasjdflkasjdhnflkjsd_5);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_5);
		
		System.out.println("---[after desc(1~3) sort]---");
		int [] fdsakjflkasjdflkasjdhnflkjsd_6=  {3,1,5,2,4};
		//Arrays.sort(fdsakjflkasjdflkasjdhnflkjsd_6, 1, 4);// index 1번부터 4번 전까지만해당 1~3
		MyArrays.sort_asc(fdsakjflkasjdflkasjdhnflkjsd_6, 1, 4);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_6);
		
		MyArrays.sort_desc(fdsakjflkasjdflkasjdhnflkjsd_6, 1, 4);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_6);
		
		System.out.println("---[after asc(bubble) sort]---");
		MyArrays.bubble_sort_asc(fdsakjflkasjdflkasjdhnflkjsd_6);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_6);
		
		System.out.println("---[after desc(bubble) sort]---");
		MyArrays.bubble_sort_desc(fdsakjflkasjdflkasjdhnflkjsd_6);
		MyArrays.display(fdsakjflkasjdflkasjdhnflkjsd_6);
		
	}
}
