package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex_07 {

	public static void main(String[] args) {
		//JAVA에서 입력변수를 이용한 JDBC 활용
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			int num = 5;
			String name = "에일리";
			int age = 27;
			String addr = "서울 강남구 청담동";
			String tel = "010-0000-0000";
			
			//SQL 문으로 입력하는 예
//			String sql = "insert into tblMember values(5,'에일리',27,'서울 강남구 청담동','010-0000-0000')";
			
			//JAVA에서 입력변수로 변형시킨 예 : sql문 전체를 하나의 String으로 인식 → 변수값을 받아들이지 못한다.
			//String sql = "insert into tblMember values(num, 'name', age, 'addr', 'tel')";
			
			//JAVA에서 입력변수를 구현하는 방법 : "+변수명+"
			String sql = "insert into tblMember values("+num+", '"+name+"', "+age+", '"+addr+"','"+tel+"')";
			
			int succ = st.executeUpdate(sql);
			if (succ > 0) {
				System.out.println("입력성공");
			}else{
				System.out.println("입력실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
