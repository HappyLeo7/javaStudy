package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutput_02 {

	public static void main(String[] args) throws Exception {
		
		//1. 
		OutputStream os  = new FileOutputStream("data2.txt");
        
        //2. OutputStream -> PrintStream기능 확장
        PrintStream out =new PrintStream(os);
        
        String name = "홍길동";
		int age =20;
		double ki = 180.5;
		
		//data2.txt 파일에 출력
		out.printf("이름 : %s(님)\n나이 : %d(살)\n키 : %f(cm)\n", name,age,ki);
		
		//console 화면 출력
		System.out.printf("이름 : %s(님)\n나이 : %d(살)\n키 : %.1f(cm)\n", name,age,ki);
        
		
		//닫기 (역순으로)
        out.close(); //2
        os.close();  //1
	}

}
