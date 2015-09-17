package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test_PreparedStatement {

	public static void main(String[] args) {
		/*
			[처리조건]
				- 전화번호의 일부를 입력(searchTel)받아 전화번호를 검색하여 출력
				- JDBC Programming : tblMember Table과 연동
				- 전송객체 : PreparedStatement
			[결과화면]
				검색할 전화번호를 입력하세요 : 7788
				4 홍길순 35 광주시 북구 용봉동 010-7788-7788
				5 성춘향 33 광주시 광산구 평동 010-8888-7788
				입력하신 7788의 검색결과는 더 이상 없습니다.
		*/
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("검색할 전화번호를 입력하세요 : ");
			String searchTel = sc.nextLine();
			sc.close();
			
			String sql = "select * from tblMember where tel like ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchTel+"%");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
			}
			
			if (rs.next() != true) {
				System.out.println("입력하신" + "searchTel "+ "의 검색결과는 더 이상 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
