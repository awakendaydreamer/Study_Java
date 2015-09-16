package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex_04 {

	public static void main(String[] args) {
		//tblMember 테이블에서 홍길동(num = 1)의 나이(age)를 33세 갱신
		//전화번호(tel)를 '010-5566-7788'로 수정(갱신)하시오.
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("접속에 성공했습니다.");
			Statement st = conn.createStatement();
			
			String sql = "update tblMember set age = 33, tel = '010-5566-7788' where num in(1) ";
//			String sql = "update tblMember set age = 40, tel = '010-3333-3333' where num in(3) ";
			
			
			
			
			int succ = st.executeUpdate(sql);
			System.out.println("succ\t" + succ);
			if (succ > 0) {
				System.out.println("수정 성공");
			}else{
				System.out.println("수정 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
//		String sql = "update tblMember set age = 33, tel = '010-5566-7788' where num = 1";
	}
}
