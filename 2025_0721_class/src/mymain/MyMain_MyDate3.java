package mymain;
import myutil.MyDate3;
public class MyMain_MyDate3 {
	public static void main(String[] args) {
		
		MyDate3 d1 =new MyDate3();
		MyDate3 d2 =new MyDate3(2000, 12, 25);
		MyDate3 d3 =new MyDate3(1992);
		MyDate3 d4 =new MyDate3(2002,12);
		
		d1.display(); 
		d2.display(); 
		d3.display(); 
		d4.display(); 
	}
}