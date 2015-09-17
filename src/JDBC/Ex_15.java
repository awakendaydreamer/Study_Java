package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex_15 {
	// PreparedStatement 객체와 MemberDTO 연동
	// main() : 회원정보를 입력받는다 → Scanner
	// memInsert()호출 → SQL문의 insert
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원번호를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이을 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = sc.nextLine();
		sc.close();
//		System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
		
		memberDTO dto = new memberDTO(num, name, age, addr, tel);
		int succ = memInsert(dto);
		
		if(succ > 0){
			System.out.println("입력성공");
		}else{
			System.out.println("입력실패");
		}
		
		
	}//main()
	
	
	
	public static int memInsert(memberDTO dto){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		int succ = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			String sql = "insert into tblmember values(?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//memInsert()
}//class
