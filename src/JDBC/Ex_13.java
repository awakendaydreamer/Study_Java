package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex_13 {

	public static void main(String[] args) {
		// PreparedStatement 객체를 이용한 Update SQL 작성
		//번호(num)가 1번인 회원(홍길동) 정보를 수정
		//나이(age) : 33
		//주소(addr) : 광주시 서구 광천동
		//전화번호(tel) : 010-1111-1111
		
		/*
		 	update tblMember set age = 33, addr = '광주시 서구 광천동',
		 						tel = '010-1111-1111' where num = 1;
		 */

		//PreparedStatement 객체를 이용한 SQL
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			//SQL문을 먼저 작성한다.
			String sql = "update tblMember set age = ?, addr = ?, tel = ? where num = ?";
			
			//preparedStatement 객체 생성
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 33);
			ps.setString(2, "광주시 서구 광천동");
			ps.setString(3, "010-1111-1111");
			ps.setInt(4, 1);
//			ps.setString(5, "010-0000-0000");
			
			//PreparedStatement 객체 전송(실행)
			int succ = ps.executeUpdate();
			if (succ > 0) {
				System.out.println("수정완료");
			}else{
				System.out.println("수정실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
