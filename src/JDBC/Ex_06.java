package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex_06 {

	public static void main(String[] args) {
		// 특정레코드만 출력하고자 할 경우에는 if 문을 사용
		// 번호가 1인 회원을 출력 → select * from tblMember where num = 1;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			String sql = "select * from tblMember where num = 5";
			ResultSet rs = st.executeQuery(sql);
			
			if (rs.next() == true) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num + "\t" + name + "\t" + age + "\t" + addr + "\t" + tel);
				
			}else{
				System.out.println("해당레코드는 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
