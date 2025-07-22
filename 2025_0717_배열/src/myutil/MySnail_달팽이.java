package myutil;

public class MySnail_달팽이 {
	
	//방향상수
	public static final int RIGHT=1;
	public static final int DOWN=2;
	public static final int LEFT=3;
	public static final int UP=4;
	
	//static 메소드
	public static int [][] make(int chasu){
		int [][] snail_array = new int[chasu][chasu];
		
		//달팽이 채우기
		int row=0;
		int col=-1;
		int direction = RIGHT;//채우기 방향
		
		for(int i=0;i<chasu*chasu;i++) {
			if(direction==RIGHT) {
				col++;
				if(col==chasu||snail_array[row][col]!=0) {
					row++;
					col--;
					direction=DOWN;
				}
			}else if(direction==DOWN) {
				row++;
				if(row==chasu||snail_array[row][col]!=0) {
					row--;
					col--;
					direction=LEFT;
				}
			}else if(direction==LEFT){
				col--;
				if(col==-1||snail_array[row][col]!=0) {
					col++;
					row--;
					direction=UP;
				}
			}else if(direction==UP) {
				row--;
				if(snail_array[row][col]!=0) {
					row++;
					col++;
					direction=RIGHT;
				}
			}
			//채우기
			snail_array[row][col]=i+1;
			//반대로채우기
			snail_array[row][col]=chasu*chasu-i;
		}
		
		return snail_array;
	}
	
	public static int [][] make2(int chasu){
		int [][] snail_array = new int[chasu][chasu];
		
		//달팽이 채우기
		int row=0;
		int col=-1;
		
		int sign=1;//부호
		int su=1;
		int n = chasu;
		while(n>0) {
			for(int i=0;i<2*n-1;i++) {
				if(i<n) {
					col+=sign;
				}else {
					row+=sign;
				}
				snail_array[row][col]=su++;
			}
			sign=-sign;// 1 <-> -1
			n--;
		}//end:while
		
		return snail_array;
	}
}
