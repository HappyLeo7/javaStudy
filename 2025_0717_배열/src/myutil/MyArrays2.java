package myutil;

public class MyArrays2 {      
							// (   참조 변수   )
	public static void display2(int [][] ar2){
		//바깥 for 는 행을 의미한다.
		for(int row=0 ;row<ar2.length;row++) { //row 0 1 2
			//가변때문에 배열 안에 row의 index가 들어와야한다.
			for(int col=0;col<ar2[row].length;col++) {
				System.out.printf("%3d",ar2[row][col]);
			}//end_for_col
			System.out.println();
		}//end_for_row
	}//end_display2()
	
	public static void display2_block(int [][] ar2){
		//바깥 for 는 행을 의미한다.
		for(int row=0 ;row<ar2.length;row++) { //row 0 1 2
			//가변때문에 배열 안에 row의 index가 들어와야한다.
			for(int col=0;col<ar2[row].length;col++) {
				if(ar2[row][col]==0) {
					System.out.print("■");
				}else {
					System.out.print(" ");
					
				}
			}//end_for_col
			System.out.println();
		}//end_for_row
	}//end_display2_block()
	
	
	public static void set(int [][] ar2) {
		int num =1;
		//바깥 for 는 행을 의미한다.
		for(int row=0 ;row<ar2.length;row++) { //row 0 1 2
			//가변때문에 배열 안에 row의 index가 들어와야한다.
			for(int col=0;col<ar2[row].length;col++) {
				ar2[row][col]=num++;
				
			}//end_for_col
		}//end_for_row
	}//end_set()
	
	
	
}
