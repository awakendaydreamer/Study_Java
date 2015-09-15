package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex_01 {

	public static void main(String[] args) {
		//Driver 클래스를 메모리에 Loading : 정적로딩
		
		//OracleDrive.class 생성 : 동적로딩
		//Connection(연결객체)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pw = "12345";
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("접속에 성공했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
