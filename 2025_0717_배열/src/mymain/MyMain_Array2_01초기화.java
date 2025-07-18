package mymain;

import myutil.MyArrays2;

public class MyMain_Array2_01초기화 {
	public static void main(String[] args) {
		int[][] mm = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } }; // {} 브레이스

		int[][] mm2 ={ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 } }; // {} 브레이스

		MyArrays2.display2(mm);
		
		System.out.println("-----------T블럭----------");
		int [] [] block_t= {
				{0,0,0},
				{1,0,1},
				{1,0,1}
		};
		MyArrays2.display2_block(block_t);
		System.out.println();
		System.out.println("-----------L블럭----------");
		
		int [] [] block_l= {
				{0,1,1},
				{0,1,1},
				{0,0,0}
		};
		MyArrays2.display2_block(block_l);
		System.out.println("-----------ㅁ블럭----------");
		
		int [] [] block_ㅁ= {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		MyArrays2.display2_block(block_ㅁ);

		
		System.out.println("==========이름이 무엇입니까?==========");
		int [] [] block_ㅅ= {
				{1,1,0,0,0,1,1},
				{1,1,1,1,1,0,0},
				{1,1,0,0,0,1,1}
		};
		MyArrays2.display2_block(block_ㅅ);
		int [] [] block_ㅓ= {
				{1,1,1,1,1,0,1},
				{1,1,0,0,0,0,0},
				{1,1,1,1,1,1,1}
		};
		MyArrays2.display2_block(block_ㅓ);
		int [] [] block_ㄱ= {
				{1,1,1,1,1,1,1,0},
				{1,1,1,1,1,1,1,0},
				{1,1,1,1,1,0,0,0}
		};
		MyArrays2.display2_block(block_ㄱ);
		int [] [] block_ㅕ= {
				{0,0,0,1,1,0,1,0,1},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,1,1,1,1}
		};
		MyArrays2.display2_block(block_ㅕ);
		
		int [] [] block_ㅇ= {
				{1,1,1,0,1,1,0,0,0},
				{1,0,0,0,1,1,0,0,0},
				{1,1,1,0,1,1,0,0,0}
		};
		MyArrays2.display2_block(block_ㅇ);
		
		int [] [] block_ㅓㄴ= {
				{0,0,0,1,1,1,0,1,1},
				{0,1,1,1,1,1,0,1,1},
				{0,1,1,1,0,0,0,0,0}
		};
		MyArrays2.display2_block(block_ㅓㄴ);
		
		
	}
}
