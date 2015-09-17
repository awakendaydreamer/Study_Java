package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex_18_03 {

	public static void main(String[] args) {
		//전체회원 목록을 출력 : memSearchAll() ▶ 배열로 처리
		//배열(Array[], ArrayList<>) ▶ 전체회원 수가 몇 명인지 알 수 없다. ▶ ArrayList<> 
		//결과를 return 받아 출력 : return list;
		
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		list = memSearchAll(list);
		
		//단순 for문 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNum() + "\t" +
								list.get(i).getName() + "\t" +
								list.get(i).getAge() + "\t"  +	
								list.get(i).getAddr() + "\t"  +
								list.get(i).getTel()
								);
		}
	}//main()
	
	public static ArrayList<memberDTO> memSearchAll(ArrayList<memberDTO> list){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from tblMember order by num asc";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
//				System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
				
				memberDTO dto = new memberDTO(num, name, age, addr, tel);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
