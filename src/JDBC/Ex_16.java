package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex_16 {
	//main() : 삭제할 회원번호를 입력받는다.
	//memDelete() 호출 : 삭제메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 자료의 회원번호를 입력하세요 :");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int succ = memDelete(num);
		if (succ > 0) {
			System.out.println("삭제성공");
			System.out.println(num +" 번님의 회원번호가 삭제되었습니다.");
		}else{
			System.out.println("삭제실패");
			System.out.println(num +" 번님의 회원번호가 존재하지 않습니다.");
		}
		
	}//main()

	public static int memDelete(int num) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		int succ = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			String sql = "delete from tblMember where num = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;	
			
		
	}//memDelete()
}
