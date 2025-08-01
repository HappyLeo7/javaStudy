package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _02_FileOutput_01 {

	public static void main(String[] args) throws Exception {
        OutputStream os  = new FileOutputStream("data.txt");
        
        os.write(65);
		
		os.write('B');
		
		os.write('1');
        
		os.write('\n');
		
		String msg = "안녕하세요";
		//String -> byte[]
		byte [] bytes_msg = msg.getBytes();
		
		os.write(bytes_msg);
		
		
		os.write('\n');
		
		int n = 123;
		//모든값 ->String생성 : 
		//방법1) String.valueOf()
		//방법2) n + "";
		
		String strN = String.valueOf(n);// 123 ->"123"
		os.write(strN.getBytes());
		
		os.write('\n');
		
		double ki = 180.5;
		
		String strKi = String.valueOf(ki);// 180.5 -> "180.5"
		os.write(strKi.getBytes());
		
		os.write('\n');
		
		
		
		//닫기
        os.close();
	}

}
