package com.tjo.member_jdbc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberCTL {
	private Scanner sc;
	public MemberCTL(Scanner sc) {
		this.sc = sc;
	}

	//insertCTL() : 회원등록 서브메뉴
	public void insertCTL(){
		MemberDAO dao = new MemberDAO();
		System.out.println("신규회원 등록 화면입니다.");
		System.out.println("------------------------------------------");
		while(true){
			System.out.print("번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			ResultSet rs = dao.checkNum(num); //번호 중복검사
			try {
				if (rs.next() == true) {	//중복된 번호가 있다 
					System.out.println("입력하신 " + num + " 번 자료는 이미 존재합니다.");
					System.out.println("다시 입력하시기 바랍니다.");
					continue;
				}else{
					System.out.print("이름을 입력하세요 : ");
					String name = sc.nextLine();
					System.out.print("나이를 입력하세요 : ");
					int age = Integer.parseInt(sc.nextLine());
					System.out.print("주소를 입력하세요 : ");
					String addr = sc.nextLine();
					System.out.print("전화번호를 입력하세요 : ");
					String tel = sc.nextLine();
					MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
					int succ = dao.insertMember(dto);
					if(succ > 0){
						System.out.println("------------------------------------------");
						System.out.println(num + " 번 " + name + " 님의 회원정보가 입력되었습니다.");
					}
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//insertCTL()
	
	
	//deleteCTL() : 회원정보를 삭제
	public void deleteCTL() {
		System.out.println("회원정보 삭제 화면입니다.");
		System.out.println("-------------------------------------------------------------");
		System.out.print("삭제할 회원번호를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		MemberDAO dao = new MemberDAO();
		int succ = dao.deleteMember(num);
		
		if (succ > 0) {
			System.out.println("------------------------------------------");
			System.out.println(num + " 번님의 회원정보가 삭제되었습니다.");
		}else{
			System.out.println("------------------------------------------");
			System.out.println(num + " 번님의 회원정보가 존재하지 않습니다.");
		}
	}//deleteCTL()

	//selectAll() : 전체회원목록 검색
	public void selectAll() {
		System.out.println("전체회원목록 검색 결과입니다.");
		System.out.println("------------------------------------------");
		MemberDAO dao = new MemberDAO();
		dao.searchMemberAll();
	}//selectAll()

	//updateCTL() : 회원정보 수정
	public void updateCTL() {
		MemberDAO dao = new MemberDAO();
		System.out.println("회원정보 수정 화면입니다.");
		System.out.println("-------------------------------------------------------------");
		while(true){
			System.out.print("수정할 회원번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			ResultSet rs = dao.checkNum(num);
			try {
				if (rs.next() != true) {
					System.out.println("입력하신 " + num + " 번 자료는 없습니다.");
					System.out.println("다시 입력하시기 바랍니다.");
				}else{
					System.out.print(num + " 번 회원의 수정할 이름을 입력하세요 : ");
					String name = sc.nextLine();
					System.out.print(num + " 번 회원의 수정할 나이를 입력하세요 : ");
					int age = Integer.parseInt(sc.nextLine());
					System.out.print(num + " 번 회원의 수정할 주소를 입력하세요 : ");
					String addr = sc.nextLine();
					System.out.print(num + " 번 회원의 수정할 전화번호를 입력하세요 : ");
					String tel = sc.nextLine();
					MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
					int succ = dao.updateMember(dto);
					if (succ > 0) {
						System.out.println("-------------------------------------------------------------");
						System.out.println(num + " 번님의 회원정보가 수정되었습니다.");
					}
				}
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}//updateCTL()

	//주소검색 메서드
	public void selectAddr() {
		System.out.println("주소 검색 화면입니다.");
		System.out.println("-------------------------------------------------------------");
		System.out.print("검색할 주소를 입력하세요 : ");
		String searchAddr = sc.nextLine();
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDAO dao = new MemberDAO();
		dao.searchMemberAddr(list, searchAddr);
		
	}//selectAddr()

	//selectName() : 이름검색 메서드
	public void selectName() {
		System.out.println("이름 검색 화면입니다.");
		System.out.println("-------------------------------------------------------------");
		System.out.print("검색할 이름를 입력하세요 : ");
		String searchName = sc.nextLine();
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDAO dao = new MemberDAO();
		list = dao.searchMemberName(list, searchName);
		
		System.out.println("-------------------------------------------------------------");
		for (MemberDTO dto : list) {
			System.out.println(dto.getNum()+"\t" + dto.getName()+"\t"+dto.getAge()+"\t"+dto.getAddr()+"\t" + dto.getTel());
		}
		
		if (list != null || list.size() - 1<= list.size()) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("조회하신 검색결과는 더이상 없습니다.");
		}
	}//selectName()

	//전화번호검색
	public void selectTel() {
		System.out.println("전화번호 검색 화면입니다.");
		System.out.println("-------------------------------------------------------------");
		System.out.print("검색할 전화번호를 입력하세요 : ");
		String searchTel = sc.nextLine();
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDAO dao = new MemberDAO();
		dao.searchMemberTel(list, searchTel);
		
	}//selectTel()
}
