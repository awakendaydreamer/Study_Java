package com.tjo.member_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import JDBC.memberDTO;

public class MemberDAO {
	private Connection conn;		//연결객체
	private PreparedStatement ps;	//전송객체
	private ResultSet rs; 			//결과객체
	//번호검색 메서드
	public ResultSet checkNum(int num) {
		conn = SingleConn.getConnect();
		String sql = "select * from member where num = ?";
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
	public int insertMember(MemberDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "insert into member values(?, ?, ?, ?, ?)";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
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
	}//insertMember()

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

	//삭제메서드
	public int deleteMember(int num) {
		conn = SingleConn.getConnect();
		String sql = "delete from member where num = ?";
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
	
	//전체회원목록 검색메서드
	public void searchMemberAll() {
		conn = SingleConn.getConnect();
		String sql = "select * from member order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num +"\t"+ name +"\t"+ age +"\t"+ addr +"\t"+ tel);
			}
			if (rs.next() == false) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("조회하신 검색결과는 더이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchMemberAll()

	//수정메서드
	public int updateMember(MemberDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "update member set name = ?, age = ?, addr = ?, tel = ? where num  = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//updateMember()
	
	//주소검색 메서드
	public void searchMemberAddr(ArrayList<MemberDTO> list, String searchAddr) {
		conn = SingleConn.getConnect();
		String sql = "select * from member where addr like ? order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchAddr+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}
			System.out.println("-------------------------------------------------------------");
			for (MemberDTO dto : list) {
				System.out.println(dto.getNum()+"\t" + dto.getName()+"\t"+dto.getAge()+"\t"+dto.getAddr()+"\t" + dto.getTel());
			}
			
			if (list != null || list.size() - 1<= list.size()) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("조회하신 검색결과는 더이상 업습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchMemberAddr()

	//이름검색 메서드
	public ArrayList<MemberDTO> searchMemberName(ArrayList<MemberDTO> list, String searchName) {
		conn = SingleConn.getConnect();
		String sql = "select * from member where name like ? order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchName+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//searchMemberName()

	public void searchMemberTel(ArrayList<MemberDTO> list, String searchTel) {
		conn = SingleConn.getConnect();
		String sql = "select * from member where Tel like ? order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchTel+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}
			System.out.println("-------------------------------------------------------------");
			for (MemberDTO dto : list) {
				System.out.println(dto.getNum()+"\t" + dto.getName()+"\t"+dto.getAge()+"\t"+dto.getAddr()+"\t" + dto.getTel());
			}
			if (list != null || list.size() - 1<= list.size()) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("조회하신 검색결과는 더이상 업습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//class
