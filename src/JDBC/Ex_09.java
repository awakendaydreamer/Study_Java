package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex_09 {

	public static void main(String[] args) {
		// 입력변수를 이용한 Update SQL 작성
		//번호(num)가 1번인 회원(홍길동)정보를 수정
		//나이(age) : 29
		//주소(addr) : 광주시 북구 용봉동
		//전화번호(tel) : 010-1111-1111
		/*
		update tblMember set age = 29, addr = '광주시 북구 용봉동'
				tel = '010-1111-1111' where num in (1);
		*/
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			int num = 1;
			int age = 29;
			String addr = "광주시 북구 용봉동";
			String tel = "010-1111-1111";
			
			String sql = "update tblMember set age = "+age+", addr = '"+addr+"', tel = '"+tel+"' where num = "+num;
			
//			String sql = "update tblMember set age = "+age+", addr = "+addr+", tel = "+tel+ "where num in ("+num+")";
			
			int succ = st.executeUpdate(sql);
			if (succ > 0) {
				System.out.println("변경완료");
				System.out.println(num +"번의 회원정보가 변경되었습니다.");
			}else{
				System.out.println(num +"번의 회원정보가 변경되지 않았습니다.");
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
