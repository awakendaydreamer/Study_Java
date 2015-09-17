package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//①JAVA API import
public class Ex_14 {

	public static void main(String[] args) {
		//특정 단어(글자)가 포함된 자료를 검색 ▶ like 연산자 (★)
		//주소(addr)에 특정단어(예:봉)가 포함된 회원을 출력
		
		// ② ojdbc6.jar : External API ▶ 정적로딩
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			//③ JDBC Driver Loading ▶ 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//④Connection 객체 생성
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			//⑤SQL문 작성
			String searchAddr = "봉";
			String sql = "select * from tblMember where addr like ?";
			
			//⑥PreparedStatement 객체 생성
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchAddr+"%");
			
			//⑦PreparedStatement 객체 전송(실행) ▶  executeQuary() ▶ ResultSet
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				
				System.err.println(num + "\t" + name + "\t" + age + "\t" + addr + "\t" + tel);
			}
			if (rs.next() != true) {
				System.out.println("검색하신 " + searchAddr + "은(는) 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
