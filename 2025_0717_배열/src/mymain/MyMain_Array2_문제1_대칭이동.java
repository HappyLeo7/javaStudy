package mymain;

import myutil.MyArrays2;
import myutil.MyTrans;

public class MyMain_Array2_문제1_대칭이동 {
	
	public static void main(String[] args) {
		int chasu=5;
		int [][] src = new int [chasu][chasu];
		MyArrays2.set(src);
		
		System.out.println("-----[src]-----")
		;
		MyArrays2.display2(src);

		System.out.println("-----[rotate_right_90]-----");
		
		int [][] result = MyTrans.rotate_right_90(src);
		MyArrays2.display2(result);
		
		System.out.println("-----[rotate_right_x]-----");
		
		int [][] result_x = MyTrans.rotate_down_x(src);
		MyArrays2.display2(result_x);
		
		System.out.println("-----[rotate_right_y]-----");
		
		int [][] result_y = MyTrans.rotate_right_y(src);
		MyArrays2.display2(result_y);
		
		System.out.println("-----[rotate_right_\\]-----");
		
		int [][] result_1 = MyTrans.rotate_right_1(src);
		MyArrays2.display2(result_1);
		System.out.println("-----[rotate_right_/]-----");
		
		int [][] result_2 = MyTrans.rotate_right_2(src);
		MyArrays2.display2(result_2);
		
		System.out.println("-----[rotate_right_180]-----");
		
		int [][] result_180 = MyTrans.rotate_right_2(src);
		MyArrays2.display2(result_180);
		System.out.println("-----[rotate_left_90]-----");
		
		int [][] result_left_90 = MyTrans.rotate_left_90(src);
		MyArrays2.display2(result_left_90);
		System.out.println("-----[rotate_left_180]-----");
		
		int [][] result_left_180 = MyTrans.rotate_left_180(src);
		MyArrays2.display2(result_left_180);
	}
}
