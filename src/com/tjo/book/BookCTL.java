package com.tjo.book;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


public class BookCTL {
	private Scanner sc;
	private BookDTO dto;
	public BookCTL(Scanner sc) {
		this.sc = sc;
	}
	
	//insertCTL() : 회원등록 서브메뉴
	public void insertBook() {
		BookDAO dao = new BookDAO();
		System.out.println("책 등록 화면입니다.");
		System.out.println("-------------------------------------");
		while(true){
			System.out.print("번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			ResultSet rs = dao.checkNum(num);
			
			try {
				if (rs.next() == true) { //중복된 번호가 있다.
					System.out.println("입력하신 "+ num + " 번 자료는 이미 존재합니다." );
					System.out.println("다시 입력하시기 바랍니다.");
					continue;
				}else{
					System.out.print("책 제목을 입력하세요 : ");
					String title = sc.nextLine();
					System.out.print("책 출판사를 입력하세요 : ");
					String company = sc.nextLine();
					System.out.print("책 저자를 입력하세요 : ");
					String name = sc.nextLine();
					System.out.print("책 가격을 입력하세요 : ");
					int price = Integer.parseInt(sc.nextLine());
					
					BookDTO dto = new BookDTO(num, title, company, name, price);
					int succ = dao.insertBook(dto);
					
					if (succ > 0 ) {
						System.out.println("-------------------------------------");
						System.out.println(num + " 번 " + title + " 책의 정보가 입력되었습니다.");
					}
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//insertBook()

	//selectAll() : 회원등록 서브메뉴
	public void selectAll() {
		System.out.println("전체 책 목록 검색 결과입니다.");
		System.out.println("-------------------------------------");
		BookDAO dao = new BookDAO();
		dao.searchBookAll();
		
	}//selectAll()

	//selectTitle() : 책 제목 검색 메서드
	public void selectTitle() {
		System.out.println("전체 책 목록 검색 결과입니다.");
		System.out.println("-------------------------------------");
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String searchTitle = sc.nextLine();
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		BookDAO dao = new BookDAO();
		list = dao.searchTitle(list, searchTitle);
		
		System.out.println("-------------------------------------");
		for (BookDTO dto : list) {
			System.out.println(dto.getNum() +"\t"+ dto.getTltle() +"\t"+ dto.getCompany() +"\t"+ dto.getName() +"\t"+ dto.getPrice());
		}
		if (list != null || list.size() -1 <= list.size()) {
			System.out.println("-------------------------------------");
			System.out.println("조회하신 검색결과는 더이상 없습니다.");
		}
	}//selectTitle()

	//deleteBook() : 책 삭제 메서드
	public void deleteBook() {
		System.out.println("책정보 삭제 화면입니다.");
		System.out.println("-------------------------------------");
		System.out.print("삭제할 책 번호를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		BookDAO dao = new BookDAO();
		int succ = dao.deleteBook(num);
		
		if (succ > 0) {
			System.out.println("-------------------------------------");
			System.out.println(num + " 번 책의 정보가 삭제되었습니다.");
		}else{
			System.out.println("-------------------------------------");
			System.out.println(num + " 번 책의 정보가 존재하지 않습니다.");
		}
	}//deleteBook()

	//updateBook() : 책 수정 메서드
	public void updateBook() {
		BookDAO dao = new BookDAO();
		System.out.println("책정보 수정 화면입니다.");
		System.out.println("-------------------------------------");
		while(true){
			System.out.print("수정할 책 번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			ResultSet rs = dao.checkNum(num);
			
			try {
				if (rs.next() != true) {
					System.out.println("입력하신 " + num + " 번 자료는 없습니다.");
					System.out.println("다시 입력하시기 바랍니다.");
				}else{
					System.out.print(num + " 번 책의 수정할 제목을 입력하시기 바랍니다.");
					String title = sc.nextLine();
					System.out.print(num + " 번 책의 수정할 출판사를 입력하시기 바랍니다.");
					String company = sc.nextLine();
					System.out.print(num + " 번 책의 수정할 저자를 입력하시기 바랍니다.");
					String name = sc.nextLine();
					System.out.print(num + " 번 책의 수정할 가격을 입력하시기 바랍니다.");
					int price = Integer.parseInt(sc.nextLine());
					BookDTO dto = new BookDTO(num, title, company, name, price);
					int succ = dao.updateBook(dto);
					if (succ > 0) {
						System.out.println("-------------------------------------");
						System.out.println(num + " 번 책의 정보가 수정되었습니다.");
					}else{
						System.out.println("-------------------------------------");
						System.out.println(num + " 번 책의 정보가 존재하지 않습니다.");
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//while
	}//updateBook()

	public void orderBook() {
		BookDAO dao = new BookDAO();
		System.out.println("책 주문 화면입니다.");
		System.out.println("-------------------------------------");
		while(true){
			System.out.print("구매할 책 수량를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
//			dao.orderBook(num);
			try {
				System.out.println("도서명");
				System.out.println("단가");
				System.out.println("수량");
				System.out.println("금액");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
