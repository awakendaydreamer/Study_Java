import java.util.Scanner;

import com.tjo.member_jdbc.MemberCTL;
import com.tjo.member_jdbc.MemberDAO;


public class MemberMain_jdbc {

	public static void menuPrint(){
		System.out.println("===========회원관리===========");
		System.out.println("회원정보 입력 : I");
		System.out.println("회원정보 삭제 : D");
		System.out.println("회원정보 수정 : U");
		System.out.println("전체회원 검색 : S");
		System.out.println("회원이름 검색 : N");
		System.out.println("회원주소 검색 : A");
		System.out.println("전화번호 검색 : T");
		System.out.println("회원관리 종료 : E");
		System.out.println("==============================");
	}//menuPrint()
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberCTL ctl = new MemberCTL(sc);
		while(true){
			menuPrint();
			System.out.print("메뉴를 입력하세요 : ");
			String menu = sc.nextLine();
			if (menu.toUpperCase().compareTo("I") == 0) {//toUppercase 
				ctl.insertCTL();	//회원등록 서브화면 출력메서드
				continue;
			}else if(menu.toUpperCase().compareTo("D") == 0){	
				ctl.deleteCTL();	//회원번호 삭제메서드
				continue;
			}else if(menu.toUpperCase().compareTo("U") == 0){
				ctl.updateCTL();	//회원정보 수정메서드
				continue;
			}else if(menu.toUpperCase().compareTo("S") == 0){	
				ctl.selectAll();	//전체회원목록 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("N") == 0){	
				ctl.selectName();	//이름 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("A") == 0){	
				ctl.selectAddr();	//주소 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("T") == 0){	
				ctl.selectTel();	//전화번호 검색메서드
				continue;
			}else if(menu.toUpperCase().compareTo("E") == 0){
				MemberDAO dao = new MemberDAO();
				dao.dbClose();
				System.out.println("종료되었습니다.");
				System.exit(0);//종료
				break;
			}else{
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				continue;
			}
		}//while
		sc.close();
	}
	
}
