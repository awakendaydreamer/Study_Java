package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex_11 {

	public static void main(String[] args) {
		//PreparedStatement 객체를 이용한 SQL
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			//SQL문을 먼저 작성한다.
			String sql = "insert into tblMember values(?, ?, ?, ?, ?)";
			
			//preparedStatement 객체 생성
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 6);
			ps.setString(2, "에일리");
			ps.setInt(3, 27);
			ps.setString(4, "서울시 강남구 청담동");
			ps.setString(5, "010-0000-0000");
			
			//PreparedStatement 객체 전송(실행)
			int succ = ps.executeUpdate();
			if (succ > 0) {
				System.out.println("입력성공");
			}else{
				System.out.println("입력실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
