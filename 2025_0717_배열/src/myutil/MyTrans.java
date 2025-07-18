package myutil;

public class MyTrans {
	public static int [][] rotate_right_90(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[rows-1-k][i];
				
			}
		}
		
		return dest;
	}
	
	public static int [][] rotate_down_x(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[rows-1-i][k];
				
			}
		}
		
		return dest;
	}
	
	public static int [][] rotate_right_y(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[i][rows-1-k];
				
			}
		}
		
		return dest;
	}
	public static int [][] rotate_right_1(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[k][i];
				
			}
		}
		
		return dest;
	}
	public static int [][] rotate_right_2(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[rows-1-k][rows-1-i];
				
			}
		}
		
		return dest;
	}
	public static int [][] rotate_right_180(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[rows-1-i][rows-1-k];
				
			}
		}
		
		return dest;
	}
	public static int [][] rotate_left_90(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[k][rows-1-i];
				
			}
		}
		
		return dest;
	}
	public static int [][] rotate_left_180(int [][] src){
		
		//복사본 배열
		int rows=src.length;    //행의갯수
		int cols=src[0].length; //열의갯수
		int [][] dest = new int [rows][cols];
		
		//원본배열이 값을 조건에 맞게끔 옮기는 작업
		for(int i=0;i<rows;i++) {
			
			for(int k=0;k<cols;k++) {
				
				dest[i][k]=src[rows-1-k][rows-1-i];
				
			}
		}
		
		return dest;
	}
}
