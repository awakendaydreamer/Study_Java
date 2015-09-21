package com.tjo.cart;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.ResultSet;

public class CartInData {
	private BufferedReader br;
	private CartDTO dto;
	public CartInData(BufferedReader br){
		this.br = br;
	}	

	
	//입력메서드
	public void insertJepum(){
		CartDAO dao = new CartDAO();
		System.out.println("제품등록 화면입니다.");
		System.out.println("--------------------------------");
		while(true){
			int code = 0;
			System.out.print("코드를 입력하세요 : ");
			try {
				code = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			ResultSet rs = dao.checkCode(code);
			
			try {
				if (rs.next() == true) {//중복된 번호가 있다.
					System.out.println("입력하신 " + code + " code의 자료는 이미 존재합니다.");
					System.out.println("다시 입력하시기 바랍니다.");
				}else{
					System.out.print("code 번호를 입력하세요 : ");
					code = Integer.parseInt(br.readLine());
					System.out.print("제품명을 입력하세요 : ");
					String name = br.readLine();
					System.out.print("제조회사를 입력하세요 : ");
					String company = br.readLine();
					System.out.print("제품의 가격을 입력하세요 : ");
					int cost = Integer.parseInt(br.readLine());
					
					CartDTO dto = new CartDTO(code, name, company, cost); 
					int succ = dao.insertCart(dto);
					if (succ > 0 ) {
						System.out.println("입력에 성공했습니다.");
					}
				}
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}//insertJepum()


	public void searchAllJepum() {
		CartDAO dao = new CartDAO();
		System.out.println("제품보기 화면입니다.");
		System.out.println("--------------------------------");
		dao.searchAllJepum();
	}//searchAllJepum()


	public void searchName() {
		CartDAO dao = new CartDAO();
		System.out.println("제품검색 화면입니다.");
		System.out.println("--------------------------------");
		System.out.print("검색할 제품명을 입력하세요 : ");
		String name = null;
		try {
			name = br.readLine();
			dao.searchName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//searchName()


	
	public void updateJepum() {
		CartDAO dao = new CartDAO();
		System.out.println("제품수정 화면입니다.");
		System.out.println("--------------------------------");
		System.out.print("수정할 제품코드를 입력하세요 : ");
		int code = 0;
		ResultSet rs;
		try {
			code = Integer.parseInt(br.readLine());
			rs = dao.checkCode(code);
			if (rs.next() == false) {
				System.out.println("입력하신 " + code +" 번 자료는 없습니다.");
				System.out.println("다시 입력하시기 바랍니다.");
			}else{
				System.out.print(code + "번 제품의 수정할 제품명을 입력하시기 바랍니다.");
				String name = br.readLine();
				System.out.print(code + "번 제품의 수정할 회사명을 입력하시기 바랍니다.");
				String company = br.readLine();
				System.out.print(code + "번 제품의 수정할 가격을 입력하시기 바랍니다.");
				int cost = Integer.parseInt(br.readLine());
				CartDTO dto = new CartDTO(code, name, company, cost);
				int succ = dao.updateCart(dto);
				if (succ > 0) {
					System.out.println("--------------------------------");
					System.out.println(code + " 번 제품의 정보가 수정되었습니다.");
				}else{
					System.out.println("--------------------------------");
					System.out.println(code + " 번 제품의 정보가 존재하지 않습니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//updateJepum()


	public void deleteJepum() {
		CartDAO dao = new CartDAO();
		System.out.println("제품삭제 화면입니다.");
		System.out.println("--------------------------------");
		System.out.print("삭제할 제품코드를 입력하세요 : ");
		try {
			int code = Integer.parseInt(br.readLine());
			ResultSet rs = dao.checkCode(code);
			if (rs.next() == false) {
				System.out.println("입력하신 " + code + " 번 자료는 없습니다.");
			}else{
				int succ = dao.deleteJepum(code);
				if (succ > 0) {
					System.out.println(code + " 번 자료가 삭제되었습니다.");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//deleteJepum()


	public void orderJepum() {
		CartDAO dao = new CartDAO();
		System.out.println("제품주문 화면입니다.");
		System.out.println("--------------------------------");
		System.out.println("주문하실 제품코드를 입력하세요 : ");
		try {
			int code = Integer.parseInt(br.readLine());
			ResultSet rs = dao.checkCode(code);
			if (rs.next() == false) {
				System.out.println("입력하신 " + code + " 번 자료는 없습니다.");
			}else{
				System.out.print("주문할 제품의 수량을 입력하세요 : ");
				int su = Integer.parseInt(br.readLine());
				dao.orderJepum(code, su);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//orderJepum()
	
	
	
}
