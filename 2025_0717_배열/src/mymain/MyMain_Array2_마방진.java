package mymain;

import myutil.MaBangJin;
import myutil.MyArrays2;

public class MyMain_Array2_마방진 {
	public static void main(String [] args) {
		int chasu=9; //홀수만 입력
		
		int[][]result_magic_square=MaBangJin.make(chasu);
		
		MyArrays2.display2(result_magic_square);
		
		//방법1)//행합계 //열합계 //대각선 합계
		int sum=0;
		sum=MaBangJin.rowSum(result_magic_square);
		System.out.println("가로합:"+sum);
		sum=MaBangJin.colSum(result_magic_square);
		System.out.println("세로합:"+sum);
		sum=MaBangJin.crossSum(result_magic_square);
		System.out.println("대각선합:"+sum);
		
		//방법2)//행합계 //열합계 //대각선 합계
		int row_sum=0;
		int col_sum=0;
		int diagonal_sum=0;
		
		for(int i=0;i<chasu;i++) {
			//행합계
			row_sum+=result_magic_square[0][i];
			//열합계
			col_sum+=result_magic_square[i][0];
			//대각합계
			diagonal_sum+=result_magic_square[i][i];
		}
		
		System.out.printf("행합계:%d\n",row_sum);
		System.out.printf("열합계:%d\n",col_sum);
		System.out.printf("대각합계:%d\n",diagonal_sum);
		
		
	}
}
