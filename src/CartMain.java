import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.tjo.cart.CartInData;


public class CartMain {

	//화면에 출력되는 내용
	public static void menuPrint(){
		System.out.println("===제품관리===");
		System.out.println("제품등록 : I");
		System.out.println("제품보기 : A");
		System.out.println("제품검색 : S");
		System.out.println("제품수정 : U");
		System.out.println("제품삭제 : D");
		System.out.println("제품주문 : O");
		System.out.println("종료     : E");
		System.out.println("=========");
	}//menuPrint()
	
	
	public static void main(String[] args) {
		InputStream is = System.in;	//바이트형 자료를 입력받는 노드스트림
		InputStreamReader isr = new InputStreamReader(is);	//문자형 자료를 입력받는 브릿지
		BufferedReader br = new BufferedReader(isr);	//버퍼를 사용하자
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//연쇄
	
		CartInData cid = new CartInData(br);
		while(true){
			menuPrint();
			System.out.print("메뉴를 입력하세요 : ");
			try {
				String menu = br.readLine();
				switch (menu.toUpperCase().charAt(0)) {
				case 'I':	//제품등록
					cid.insertJepum();
					break;
					
				case 'A': //제품보기
					cid.searchAllJepum();
					break;
					
				case 'S':	//제품검색
					cid.searchName();
					break;
				
				case 'U':	//제품수정
					cid.updateJepum();
					break;
					
				case 'D':	//제품삭제
					cid.deleteJepum();
					break;
					
				case 'O':
					cid.orderJepum();
					break;
					
				case 'E': //종료
					System.out.println("종료 되었습니다.");
					System.exit(0);
					break;
				default:
					System.out.println("메뉴를 잘못 입력하셨습니다.");
					System.out.println("메뉴를 정확히 입력하세요! ");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}//switch
		}//while
	}//main()

}
