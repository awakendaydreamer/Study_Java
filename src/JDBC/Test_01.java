package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class Test_01 {

	public static void main(String[] args) {
		// Panme Table에 아래의 레코드를 삽입하고
		// 각 부서별(group by)로 매출액(pangum)의 총합(total)을 구하여 부서명의 오름차순 출력
		//('007', 'A영업부', 5500)
		//('008', 'B영업부', 6000)
		//('009', 'C영업부', 6500)
		//('010', 'D영업부', 7000)
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		
		
		
		try {
			
//			String code = null;
//			String part = null;
//			int pangum = 0;
			
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement st = conn.createStatement();
			
			
			st.executeUpdate("insert into panme values('007', 'A영업부', 5500)");
			st.executeUpdate("insert into panme values('008', 'B영업부', 6000)");
			st.executeUpdate("insert into panme values('009', 'C영업부', 6500)");
			st.executeUpdate("insert into panme values('010', 'D영업부', 7000)");
			
			// 각 부서별(group by)로 매출액(pangum)의 총합(total)을 구하여 부서명의 오름차순 출력
			String sql = "SELECT part,SUM(pangum) AS total FROM panme GROUP BY part order by part asc";
			ResultSet rs = st.executeQuery(sql);
			DecimalFormat df = new DecimalFormat("￦##,##0,000");
			
			while(rs.next()){
//				String code = rs.getString("code");
				String part = rs.getString("part");
				int total = rs.getInt("total");
				System.out.println(part + "\t" + df.format(total));
			}
//			
//			SELECT j.code, j.name,j.company,j.cost,
//			c.su,j.cost*c.su AS price FROM jepum j ,cart c
//            	WHERE j.code = c.code;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		
		

	}

}
