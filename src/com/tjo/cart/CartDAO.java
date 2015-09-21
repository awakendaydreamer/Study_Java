package com.tjo.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CartDAO {
	
	//instance변수
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	//번호검색 메서드
	public ResultSet checkCode(int code) {
		conn = SingleConn.getConnect();
		String sql = "select * from jepum where code = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, code);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}//checkCode()

	//insertCart() 삽입 메서
	public int insertCart(CartDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "insert into jepum values(?,?,?,?)";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getCode());
			ps.setString(2, dto.getName());;
			ps.setString(3, dto.getCompany());
			ps.setInt(4, dto.getCost());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//insertCart()

	public void searchAllJepum() {
		conn = SingleConn.getConnect();
		String sql = "select * from jepum order by code asc";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int code = rs.getInt("code");
				String name = rs.getString("name");
				String company = rs.getString("company");
				int cost = rs.getInt("cost");
				System.out.println(code +"\t"+ name +"\t"+ company +"\t"+ cost);
			}
			if (rs.next() == false) {
				System.out.println("--------------------------------");
				System.out.println("조회하신 검색 결과는 더이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchAllJepum()

	public void searchName(String name) {
		conn = SingleConn.getConnect();
		String sql = "select * from jepum where name like ? order by code asc";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+name+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				int code = rs.getInt("code");
				name = rs.getString("name");
				String company = rs.getString("company");
				int cost = rs.getInt("cost");
				System.out.println(code +"\t"+ name +"\t"+ company +"\t"+ cost);
			}
			if(rs.next() == false){
				System.out.println("--------------------------------");
				System.out.println("조회하신 검색 결과는 더이상 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchName()

	public int updateCart(CartDTO dto) {
		conn = SingleConn.getConnect();
		String sql = "update jepum set name = ?, company = ?, cost = ? where code = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getCompany());
			ps.setInt(3, dto.getCost());
			ps.setInt(4, dto.getCode());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
	}//updateCart()

	public int deleteJepum(int code) {
		conn = SingleConn.getConnect();
		String sql = "delete from jepum where code = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, code);
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return succ;
		
		
		
	}//deleteJepum()

	public void orderJepum(int code, int su) {
		CartDTO dto = new CartDTO();
		conn = SingleConn.getConnect();
		String sql = "insert into cart values(?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, code);
			ps.setInt(2, su);
			ps.executeUpdate();
			sql = " 	SELECT j.*, c.su "
					+ "	FROM jepum j "
					+ "	INNER JOIN cart c "
					+ "		ON j.code = c.code "
					+ " order by j.code asc";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String name = rs.getString("name");
				int cost = rs.getInt("cost");
				su = rs.getInt("su");
				System.out.print("주문하신 제품은" + name  + "이며,");
				System.out.print("수량은 " + su + "이고, ");
				System.out.println("총가격은 " + su*cost + " 원 입니다." );
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("orderJepum중 애러.");
		}
	}//orderJepum()



	
	
	
	
	
}
