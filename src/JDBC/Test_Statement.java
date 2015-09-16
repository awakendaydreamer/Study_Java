package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test_Statement {

	public static void main(String[] args) {
		// 1 홍길동 29 광주시 북구 중흥동 010-1234-5678
		// 2 박문수 25 광주시 남구 봉선동 010-5555-6666
		// 3 이몽룡 25 광주시 서구 서석동 010-9999-8888
		// 4 홍길순 35 광주시 북구 용봉동 010-7788-7788
		// 5 성춘향 33 광주시 광산구 평동 010-8888-7788

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 전화번호를 입력하세요 : ");
			String userinput = sc.nextLine();
			String sql = "select * from tblmember where tel like '%" + userinput+ "%'";
			
			ResultSet rs = st.executeQuery(sql);
			System.out.println("==============================================================");
			System.out.println("cnt\tnum\tname\tage\taddr\t\ttel");
			System.out.println("==============================================================");
			int cnt = 0;
			while(rs.next()){
				cnt++;
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(cnt +"\t" + num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
			}
			System.out.println("==============================================================");
			if(cnt == 0){
				System.out.println("검색 결과가 아무것도 없습니다.");
			}
			System.out.println("입력하신 " + userinput + "의 검색결과는 더 이상 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
