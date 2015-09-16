package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex_08 {

	public static void main(String[] args) {
		// 입력변수를 이용한 Delete SQL 작성
		// 이름이(name)이 '에일리'인 회원정보를 삭제(delete)
		// delete from tblMember where name = '에일리'
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			String name = "에일리";
			
//			String sql = "delete from tblMember where name = '에일리'";	//
//			String sql = "delete from tblMember where name = 'name'";
			String sql = "delete from tblMember where name = '" + name + "'";
			
			int succ = st.executeUpdate(sql);
			if (succ > 0) {
				System.out.println("삭제성공");
				System.out.println(name + "님의 회원정보가 삭제되었습니다");
			}else{
				System.out.println(name + "님의 회원정보가 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
