package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex_05 {

	public static void main(String[] args) {
		//모든 회원의 목록을 검색 : select ▶ executeQuery() ▶ ResultSet Class
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			String sql = " select * from tblMember ORDER By num asc";
			
			//작성된 SQL 문장을 전송(실행)
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num + "\t" + name + "\t" + age + "\t" + addr + "\t" + tel);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
