package mymain;

import myutil.MyArrays2;

public class MyMain_Array2_01 {
	public static void main(String[] args) {
						//	  행 열
		int [][] ll =new int [3][];  //행의 정보만 가지고 있다.
		int [][] mm =new int [3][4];
		int nn [][] =new int [3][4];
		
		mm[0][0]=1;
		mm[0][1]=2;
		
		MyArrays2.set(mm);
		MyArrays2.display2(mm);
		
	}
}
