import java.util.Scanner;

import com.tjo.book.BookCTL;
import com.tjo.book.BookDAO;


public class BookMain_jdbc {

	public static void menuPrint(){
		System.out.println("===========도서관리===========");
		System.out.println("책 등 록 : I");	//번호, 제목, 출판사, 저자, 가격 입
		System.out.println("책 보 기 : A");	//전체 목록 검색(제목의 오름차순으로 출력)
		System.out.println("책 검 색 : S");	//제목을 입력받아 도서 검색
		System.out.println("책 삭 제 : D");	//번호를 입력받아 도서 삭제
		System.out.println("책 수 정 : U");	//번호를 입력받아 도서 수정
		System.out.println("책 주 문 : O");	//번호와 수량을 입력받아 합계 출력
		System.out.println("종 료    : E");	//system.exit(0);
		System.out.println("==============================");
	}//menuPrint()
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookCTL ctl = new BookCTL(sc);
		while(true){
			menuPrint();
			System.out.print("메뉴를 입력하세요 : ");
			String menu = sc.nextLine();
			if (menu.toUpperCase().compareTo("I") == 0) {
				ctl.insertBook();	//책 등록 서브화면 출력메서드
				continue;
			}else if(menu.toUpperCase().compareTo("A") == 0){
				ctl.selectAll();	//책 목록 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("S") == 0){
				ctl.selectTitle();	//책 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("D") == 0){
				ctl.deleteBook();	//책 삭제메서드
				continue;
			}else if(menu.toUpperCase().compareTo("U") == 0){
				ctl.updateBook();	//책 수정메서드
				continue;
			}else if(menu.toUpperCase().compareTo("O") == 0){
				ctl.orderBook();	//책 주문메서드
				continue;
			}else if(menu.toUpperCase().compareTo("E") == 0){
				BookDAO dao = new BookDAO();
				dao.dbClose();
				System.out.println("종료되었습니다.");
				System.exit(0);//종료
			}else{
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				continue;
			}
		}//while
	}//main()
}//class
