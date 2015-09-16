package JDBC;
//①
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex_03 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		try {
			// ② JDBC Driver Loading ▶ 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ③ Connection 객체 생성
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("접속에 성공했습니다.");
			
			// ④ Statement 문장 전송 객체 생성
			Statement st = conn.createStatement();
			
			// ⑤ SQL 문장작성
			String sql = "delete from tblMember where num = 5";
			
			// ⑥ 작성된 SQL 문장을 전송(실행)
			int succ = st.executeUpdate(sql);
			System.out.println("succ = " + succ);
			if (succ > 0 ) {
				System.out.println("삭제성공");
			}else{
				System.out.println("삭제실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
