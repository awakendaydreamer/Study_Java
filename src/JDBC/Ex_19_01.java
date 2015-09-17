package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex_19_01 {
	//검색할 전화번호를 입력받는다(searchTel)
	//memSearchTel() : 전화번호로 검색 메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 전화번호를 입력하세요 : ");
		String searchTel = sc.nextLine();
		sc.close();
		
		
		memSearchTel(searchTel);
	}//main()

	public static void memSearchTel(String searchTel){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from tblMember where tel like ? order by num asc";
//			'%?%'
//			String sql = "select * from tblMember where tel like % " + ? + " % order by num asc";
//			'%'?'%'
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchTel+"%");
//			ps.setString(1, searchTel);
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
				System.out.println("입력하신 " + searchTel + "의 결과는 더 이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//memSearchTel()
}
