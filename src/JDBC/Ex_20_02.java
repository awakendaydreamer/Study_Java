package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex_20_02 {
	static PreparedStatement ps;
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 데이터의 번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.print("새로운 나이를 입력하세요 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("새로운 주소를 입력하세요 : ");
			String addr = sc.nextLine();
			System.out.print("새로운 전화번호를 입력하세요 : ");
			String tel = sc.nextLine();
			sc.close();
			
			String sql = "update tblMember set age = ?, addr = ?, tel = ? where num = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, age);
			ps.setString(2, addr);
			ps.setString(3, tel);
			ps.setInt(4, num);
			int succ = ps.executeUpdate();
			ps.close();
			
			if (succ > 0) {
				System.out.println(num + "번 데이터의 나이, 주소, 전화번호가 수정되었습니다.");
				System.out.println("=============================================");
				sql = "select * from tblMember order by num asc";
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					num = rs.getInt("num");
					String name = rs.getString("name");
					age = rs.getInt("age");
					addr = rs.getString("addr");
					tel = rs.getString("tel");
					System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
				}
				System.out.println("=============================================");
				ps.close();

			}else{
				System.out.println(num + "번 데이터가 존재하지 않습니다.");
				System.out.println("=============================================");
				
				sql = "select * from tblMember order by num asc";
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					num = rs.getInt("num");
					String name = rs.getString("name");
					age = rs.getInt("age");
					addr = rs.getString("addr");
					tel = rs.getString("tel");
					System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
				}
				System.out.println("=============================================");
				ps.close();
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try	
	}//main()

}
