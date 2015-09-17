package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex_18_02 {
	//전체회원 목록을 출력 : memSearchAll() ▶ 배열로 처리
	//배열(Array[], ArrayList<>) ▶ 전체회원 수가 몇 명인지 알 수 없다. ▶ ArrayList<> 
	public static void main(String[] args) {
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		memSearchAll(list);
				
	}//main()
	
	public static void memSearchAll(ArrayList<memberDTO> list){
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
//			if (rs.next() == false) {
//				System.out.println("검색하신 결과는 더 이상 존재하지 않습니다.");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//ArrayList<> 출력 ▶  향상된 for문 : for_each
		for (memberDTO dto : list){
			System.out.println(dto.getNum() +"\t"+ 
							 dto.getName() +"\t"+ 
							 dto.getAge() +"\t"+
							 dto.getAddr() +"\t"+ 
							 dto.getTel());
		}
	}//memSearchAll()
}
