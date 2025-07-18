package myutil;

public class MyArrays1 {

	// 배열을 출력하는 메소드
	// Call By Reference
	public static void display(int[] ar) {
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%3d", ar[i]);
		}
		System.out.println("  ]");
	}// end:display()

	public static void fill(int[] ar, int value) {
		for (int i = 0, len = ar.length; i < len; i++)
			ar[i] = value;
	}

	// 오름차순정렬
	public static void sort_asc(int[] mr) {
		for (int i = 0; i < mr.length - 1; i++) { // i <-selection

			for (int k = i + 1; k < mr.length; k++) {
				// 고정 이동
				if (mr[i] > mr[k]) {

					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end_for:k
		} // end_for:i
	}// end_sort_asc

	// 구간오름차순정렬
	public static void sort_asc(int[] mr, int beginIndex, int toIndex) {
		for (int i = beginIndex; i < toIndex - 1; i++) { // i <-selection

			for (int k = i + 1; k < toIndex; k++) {
				// 고정 이동
				if (mr[i] > mr[k]) {

					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end_for:k
		} // end_for:i
	}// end_sort_asc(beginIndex,toIndex)

	// 오름차순 거품정렬(Bubble Sort)
	public static void bubble_sort_asc(int[] mr) {
		for (int i = 0; i < mr.length; i++) {
			for (int k = 0; k < mr.length - i - 1; k++) {
				if (mr[k] > mr[k + 1]) {
					int m = mr[k];
					mr[k] = mr[k + 1];
					mr[k + 1] = m;
				}

			}
		}
	}

	// 내림차순정렬
	public static void sort_desc(int[] mr) {
		for (int i = 0; i < mr.length - 1; i++) { // i <-selection

			for (int k = i + 1; k < mr.length; k++) {
				// 고정 이동
				if (mr[i] < mr[k]) {

					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end_for:k
		} // end_for:i
	}// end_sort_desc

	// 구간내림차순정렬
	public static void sort_desc(int[] mr, int beginIndex, int toIndex) {
		for (int i = beginIndex; i < toIndex - 1; i++) { // i <-selection

			for (int k = i + 1; k < toIndex; k++) {
				// 고정 이동
				if (mr[i] < mr[k]) {

					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end_for:k
		} // end_for:i
	}// end_sort_desc(beginIndex,toIndex)

	// 오름차순 거품정렬(Bubble Sort)
	public static void bubble_sort_desc(int[] mr) {
		for (int i = 0; i < mr.length; i++) {
			for (int k = 0; k < mr.length - i - 1; k++) {
				if (mr[k] < mr[k + 1]) {
					int m = mr[k];
					mr[k] = mr[k + 1];
					mr[k + 1] = m;
				}

			}
		}
	}

}// end
