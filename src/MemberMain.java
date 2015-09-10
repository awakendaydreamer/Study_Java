import java.util.ArrayList;
import java.util.Scanner;

import com.tjo.member.MemberDAO;
import com.tjo.member.MemberDTO;


public class MemberMain {

	public static void main(String[] args) {
		//ArrayList<> 객체배열 생성 및 입력
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("홍길동", 25, "광주시 서구 광천동", "010-1234-5678"));
		list.add(new MemberDTO("황성빈", 29, "광주시 동구 지산동", "010-6410-0486"));
		list.add(new MemberDTO("임보민", 24, "광주시 남구 봉선동", "010-2222-3333"));
		list.add(new MemberDTO("오명훈", 31, "광주시 북구 산정동", "010-7117-7075"));
		list.add(new MemberDTO("박성화", 18, "광주시 서구 금호동", "010-7979-7979"));
		
		MemberDAO dao = new MemberDAO();
		//정렬전 출력 : display()
		System.out.println("입력하신 자료는 아래와 같습니다.");
		dao.display(list);
		
		//이름의 오름차순 정렬 : nameAscSort()
		System.out.println("이름의 오름차순으로 정렬된 자료입니다.");
		dao.nameAscSort(list);
		dao.display(list);
		
		//키보드로 입력된 사람의 주소와 전화번호를 검색(이진검색) : nameSearch()
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
		String sd = sc.nextLine();
		sc.close();
		int index = dao.nameSearch(list, sd);
		if(index == -1){
			System.out.println("입력하신 이름은");
		}else{
			System.out.println(sd);
			System.out.println(sd);
			System.out.println(sd);
		}
		
		
	}

}
