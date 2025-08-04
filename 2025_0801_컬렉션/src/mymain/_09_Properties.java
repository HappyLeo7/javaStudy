package mymain;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class _09_Properties {
	public static void main(String[] args) throws Exception {
		
		//Map 계열 : 사용방법이 맵과 유사 (일반적으로 Text 데이터 속성 저장 관리시 이용) 
		Properties prop1 = new Properties();
		
		//데이터 베이스 연결옵션 방법 //오라클 데이터베이스 연결
		prop1.put("driver", "oracle.jdbc.driver.OracleDriver"); 
		prop1.put("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop1.put("username", "scott");
		prop1.put("password", "tiger");
		System.out.println(prop1);
		
		//스트림데이터 가져오기
		String driver=prop1.getProperty("driver");
		String url=prop1.getProperty("url");
		String username=prop1.getProperty("username");
		String password=prop1.getProperty("password");
		
		System.out.println("------[main에 직접 입력 DB 정보 (노출되어 있기때문에 쓰지않음)]------");
		System.out.printf("%s\n%s\n%s\n%s\n",driver,url,username,password);
		
		//파일로부터 읽어오기
		Properties prop2 =new Properties();
		
		//예외처리 필요
		//외부에서 파일 가져오기
		FileReader fr = new FileReader("db.properties");
		prop2.load(fr); //(Reader타입)
		
		driver = prop2.getProperty("jdbc.driver");
		url = prop2.getProperty("jdbc.url");
		username=prop2.getProperty("jdbc.username");
		password=prop2.getProperty("jdbc.password");
		System.out.println("------[db.properties 외부 입력된거 가져온 DB]------");
		System.out.printf("%s\n%s\n%s\n%s\n",driver,url,username,password);
	}
}
