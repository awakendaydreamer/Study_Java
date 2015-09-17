package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_19_02 {
	// 검색할 전화번호를 입력받는다. → memSearchTel() 호출
	// 검색결과를 ArrayList<> 사용하여 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 전화번호를 입력하세요 :");
		String searchTel = sc.nextLine();
		sc.close();
		
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		memSearchTel(list, searchTel);
		
	}//main()
	
	public static void memSearchTel(ArrayList<memberDTO>list, String searchTel){
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
			//ArrayList<> 출력 
			if (list.size() == 0) { //검색 결과가 없다.
				System.out.println("입력하신 " + searchTel + "의 검색결과는 더 이상 없습니다.");
			}else{//검색결과가 있다.
				for (memberDTO dto : list) {
					System.out.println(dto.getNum() +"\t"+ 
										dto.getName() +"\t"+ 
										dto.getAge() +"\t"+
										dto.getAddr() +"\t"+ 
										dto.getTel());
				}
				System.out.println("입력하신 " + searchTel + "의 검색결과는 더 이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//memSearchTel()
}
