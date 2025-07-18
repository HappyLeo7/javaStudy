package mymain;

import myutil.MaBangJin;
import myutil.MyArrays2;

public class MyMain_Array2_마방진 {
	public static void main(String [] args) {
		int chasu=3;
		
		int[][]result_magic_square=MaBangJin.make(chasu);
		
		MyArrays2.display2(result_magic_square);
		
		//행합계 //열합계 //대각선 합계
		int sum=0;
		sum=MaBangJin.rowSum(result_magic_square);
		System.out.println("가로합:"+sum);
		sum=MaBangJin.colSum(result_magic_square);
		System.out.println("세로합:"+sum);
		sum=MaBangJin.crossSum(result_magic_square);
		System.out.println("대각선합:"+sum);
		
	}
}
