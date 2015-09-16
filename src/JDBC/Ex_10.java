package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex_10 {

	public static void main(String[] args) {
		// 입력변수를 이용한 Select SQL 작성 ▶  executeQuary() ▶ ResultSet
		//나이(age)가 30세 이상인 회원의 목록 출력
		//단, 나이의 내림차순으로 정렬하여 출력
		//select * from tblMember where age >= 30 order by age desc;

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			int age = 29;
			
			String sql = " select * from tblMember where age >= "+ age + " order by age desc ";
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next() ){
//				String name = rs.getString("name");
				
				age = rs.getInt("age");
//				String addr = rs.getString("addr");
//				String tel = rs.getString("tel");
//				System.out.println(age);
//				System.out.println(num + "\t" + name + "\t" + age + "\t" + addr + "\t" + tel);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
