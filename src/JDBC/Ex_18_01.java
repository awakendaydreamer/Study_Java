package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex_18_01 {
	//전체 회원 목록을 출력 메서드 : memSearchAll()
	public static void main(String[] args) {
		memSearchAll();
	}//main()
	
	public static void memSearchAll(){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from tblMember order by num asc";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
			}
			if (rs.next() == false) {
				System.out.println("검색하신 결과는 더 이상 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}//class
