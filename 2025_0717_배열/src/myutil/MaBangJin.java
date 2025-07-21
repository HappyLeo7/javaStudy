package myutil;

public class MaBangJin {
	// (배열크기)
	public static int[][] make(int chasu) {

		int[][] ma_array = new int[chasu][chasu];

		int row = 0;
		int col = chasu / 2;
		int num = 1;

		// 1. 중앙 채우기
		ma_array[row][col] = num++;

		// 2. 마방진 채우기
		for (int i = 0; i < chasu * chasu - 1; i++) {
			// 오른쪽 위 대각으로 이동해라.
			col++;
			row--;

			// 위,오른쪽 모두 벗어 났냐?
			if (row < 0 && col >= chasu) {
				row += 2;
				col--;

			} else if (row < 0) {
				// 윗쪽으로 벗어났냐? => 마지막줄(행)로 이동시킨다.
				row = chasu - 1;
			} else if (col == chasu) {
				// 우측으로 벗어났냐? => 맨앞칸으로 이동시킨다.
				col = 0;
			}

			// 값이 이미 채워져있냐?
			if (ma_array[row][col] != 0) {
				row += 2;
				col--;
			}

			// 값채우기
			ma_array[row][col] = num++;

		} // end_for()

		return ma_array;
	}

	
	//행의 합계(가로)
	public static int rowSum(int[][] ma_array) {
		int sum = 0;

		for (int i = 0; i < ma_array[0].length; i++) {

			sum += ma_array[0][i];
		}
		return sum;
	}

	
	//열의 합계(세로)
	public static int colSum(int[][] ma_array) {
		int sum = 0;

		for (int i = 0; i < ma_array[0].length; i++) {

			sum += ma_array[i][0];
		}
		return sum;
	}

	
	//대각선의 합계 (\)
	public static int crossSum(int[][] ma_array) {
		int sum = 0;

		for (int i = 0; i < ma_array[0].length; i++) {

			//00
			//  11 
			//     22
			sum += ma_array[i][i];
		}
		return sum;
	}

}
