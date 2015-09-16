package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		// Scanner와 입력변수를 이용하여 panme Table에 새로운 레코드를 삽입
		// Select 문을 이용하여 panme Table의 내용을 출력
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			String code = null;
			String part = null;
			int pangum = 0;

			Scanner sc = new Scanner(System.in);
			System.out.print("CODE를 입력하세요 : ");
			code = sc.nextLine();
			System.out.print("PART를 입력하세요 : ");
			part = sc.nextLine();
			System.out.print("PANGUM을 입력하세요 : ");
			pangum = Integer.parseInt(sc.nextLine());
			
			String sql = "insert into panme values('"+code+"','"+part+"',"+pangum+")";
			int succ = st.executeUpdate(sql);
			
			String sql2 = "select * from panme order by code asc";
			ResultSet rs = st.executeQuery(sql2);
			
			while(rs.next()){
				System.out.println(rs.getString("code") + "\t" + rs.getString("part") + "\t" + rs.getInt("pangum"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
