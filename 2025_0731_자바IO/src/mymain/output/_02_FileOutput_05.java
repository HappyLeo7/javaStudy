package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _02_FileOutput_05 {
	public static void main(String[] args) throws Exception {
		OutputStream os =new FileOutputStream("src/mymain/output/data.java");
		
		String data = "package mymain.output;public class data {public static void main(String [] args){System.out.print(\"안녕하세요\");}}";
		os.write(data.getBytes());
		
		
		
		os.close();
		
	}
}
