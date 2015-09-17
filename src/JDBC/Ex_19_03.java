package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_19_03 {

	public static void main(String[] args) {
		// 검색할 전화번호를 입력받는다 → memSearchTel() 호출
		// 검색결과를 ArrayList<> 사용하여 출력
		// 결과를 return 받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 전화번호를 입력하세요 : ");
		String searchTel = sc.nextLine();
		sc.close();
		
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		list = memSearchTel(list, searchTel);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNum() + "\t" + 
								list.get(i).getName() + "\t" +
								list.get(i).getAge() + "\t" +
								list.get(i).getAddr() + "\t" +
								list.get(i).getTel()
								);
			
		}
		System.out.println("검색하신 결과는 더 이상 존재하지 않습니다.");
	}//main()

	public static ArrayList<memberDTO> memSearchTel(ArrayList<memberDTO> list, String searchTel) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "select * from tblMember where tel like ? order by num asc";
//			'%?%'
//			String sql = "select * from tblMember where tel like % " + ? + " % order by num asc";
//			'%'?'%'
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchTel+"%");
//			ps.setString(1, searchTel);
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
	}//memSearchTel()
}//class
