package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex_17 {
	//main() : 수정할 회원번호를 입력받아 memUpdate(호출) → 번호, 나이, 주소, 전화번호
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원번호를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 회원의 나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 회원의 주소를 입력하세요 : ");
		String addr = sc.nextLine();
		System.out.print("수정할 회원의 전화번호를 입력하세요 : ");
		String tel = sc.nextLine();
		sc.close();
		
		//over 
		memberDTO dto = new memberDTO(num, age, addr, tel);
//		memberDTO dto = new memberDTO();
//		dto.setNum(num);
//		dto.setAge(age);
//		dto.setAddr(addr);
//		dto.setTel(tel);
		
		int succ = memUpdate(dto);
		if (succ > 0) {
			System.out.println("수정성공");
			System.out.println(num + " 번님의 회원번호가 수정되었습니다.");
			
		}else{
			System.out.println("수정실패");
			System.out.println(num + " 번님의 회원번호가 존재하지 않습니다.");
		}
		
	}//main()

	public static int memUpdate(memberDTO dto) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		int succ = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pw);
			String sql = "update tblMember set age = ?, addr = ?, tel = ? where num = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getAge());
			ps.setString(2, dto.getAddr());
			ps.setString(3, dto.getTel());
			ps.setInt(4, dto.getNum());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}


	
	
}//class
