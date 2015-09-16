package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//① JDBC API import ▶ 자동생성
public class Ex_02 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		try {
			//② JDBC Driver Loading ▶ 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//③ Connection 객체 생성
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("접속에 성공했습니다.");
			
			//④ Statement 문장 전송 객체 생성
			Statement st = conn.createStatement();
			
			//⑤ SQL 문장작성
			String sql = "insert into tblmember values(5,'에일리',27,'서울 강남구 청담동','010-0000-0000')";
			
			//⑥ Statement 객체에 SQL 문장을 전송 → 실행
			st.executeUpdate(sql);
			System.out.println("전송성공");
			
			//⑦ Connection 객체 접속종료
			conn.close();
			System.out.println("접속종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
