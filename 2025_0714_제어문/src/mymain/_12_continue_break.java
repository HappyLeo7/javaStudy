package mymain;

public class _12_continue_break {
	public static void main(String[] a) {
		// break : 현재 영역의 반복문을 탈출하는 명령
		// break label : label 영역의 반복문을 탈출하는 명령

		// 방법1) 2중 for 나가는 방법 break 방법
		boolean bExit = false;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.printf("(%d,%d)", row, col);
				if (row == 2 && col == 2) {
					bExit = true;
					break;
				}
			}

			System.out.println();
			if (bExit) {
				break;
			}
		}
		System.out.print("---방법1 : for문 종료---\n");
		System.out.println();

		// 방법2) break label 사용
		OUT_FOR: // label 이름은 자유롭게 할수 있다.
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.printf("(%d,%d)", row, col);
				if (row == 2 && col == 2) {

					break OUT_FOR; // OUT_FOR 영역의 반복문을 탈출한다.
				}
			}

			System.out.println();
		}
		System.out.print("\n---방법2 : for문 종료---\n");
		System.out.println();

		// 방법2)
		O: // label
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.printf("(%d,%d)", row, col);
				if (row == 2 && col == 2) {

					break O; // OUT_FOR 영역의 반복문을 탈출한다.
				}
			}

			System.out.println();
		}
		System.out.print("\n---방법2 : for문 종료---\n");
		System.out.println();

		
		
		// 방법3) continue : 현재명령종료하고 다음제어식으로 이동해라.
		// continue label : label 영역의 반복문에 적용된다.
		OUT_:
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (col > 2) {
					
					System.out.println();
					continue OUT_; //row++ 여기로 이동된다.
				}
				System.out.printf("(%d,%d)", row, col);
			}

			System.out.println();
		}
		System.out.print("---방법3 : for문 종료---\n");

	}// main_end
}
