package com.tjo.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {

	//instance변수 vs 전역변수 vs 지역변수 vs 맴버변수
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//번호검색 메서드
	public ResultSet checkNum(int num) {
		conn = SingleConn.getConnect();
		String sql = "select * from book where num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}//checkNum()

	//삽입메서드
	public int insertBook(BookDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "insert into Book values(?,?,?,?,?)";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getTltle());
			ps.setString(3, dto.getCompany());
			ps.setString(4, dto.getName());
			ps.setInt(5, dto.getPrice());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//insertBook()

	
	//생성된 연결객체(conn), 전송객체(sp), 결과객체(rs) 종료하는 메서드
	//종료할때는 항상 역순으로 종료 : rs close → ps close → conn close
	public void dbClose() {
		try {
			if (rs != null) {
				rs.close();
			}//rs close()
			if (ps != null) {
				ps.close();
			}//ps close()
			if (conn != null) {
				conn.close();
			}//conn close()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//dbClose()

	//전체목록 검색메서드
	public void searchBookAll() {
		conn = SingleConn.getConnect();
		String sql = "select * from book order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				System.out.println(num +"\t"+ title +"\t"+ company +"\t"+ name +"\t"+ price);
			}
			if (rs.next() == false) {
				System.out.println("-------------------------------------");
				System.out.println("조회하신 검색 결과는 더이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchMemberAll()

	//책 제목 검색 메서드
	public ArrayList<BookDTO> searchTitle(ArrayList<BookDTO> list, String searchTitle) {
		conn = SingleConn.getConnect();
		String sql = "select * from book where title like ? order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchTitle+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				BookDTO dto = new BookDTO(num, title, company, name, price);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//searchTitle()

	//책 정보 삭제 메서드
	public int deleteBook(int num) {
		conn = SingleConn.getConnect();
		String sql = "delete from book where num = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//deleteMember();

	public int updateBook(BookDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "update book set title = ?, company = ?, name = ?, price = ? where num = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getTltle());
			ps.setString(2, dto.getCompany());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getPrice());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//updateMember()

	public void orderBook(BookDTO dto, int num) {
		conn = SingleConn.getConnect();
		String sql = "select * from book where like = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ResultSet rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}//class
