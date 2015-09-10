package For_each;

import java.util.ArrayList;

import java.util.Iterator;

import com.tjo.member.MemberDTO;

public class For_each_Main01 {

	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("홍길동", 25, "광주시 서구 광천동", "010-1234-5678"));
		list.add(new MemberDTO("황성빈", 29, "광주시 동구 지산동", "010-6410-0486"));
		list.add(new MemberDTO("임보민", 24, "광주시 남구 봉선동", "010-2222-3333"));
		list.add(new MemberDTO("오명훈", 31, "광주시 북구 산정동", "010-7117-7075"));
		list.add(new MemberDTO("박성화", 18, "광주시 서구 금호동", "010-7979-7979"));

		//ArrayList<> 의 내용을 출력하시오 ▶ 단순 for 문
		for (int i = 0; i < list.size(); i++) {
			MemberDTO temp =list.get(i);
			System.out.print(temp.getName() + "\t" + temp.getAge() + "\t");
			System.out.println(temp.getAddr() + "\t" + temp.getTel());
		}
		System.out.println();
		
		//ArrayList<>의 내용을 출력하시오 ▶ for each 문(향상된 for문 : 배열구조의 자룔를 출력할때 사용)
		for (MemberDTO dto : list) {
			System.out.print(dto.getName() + "\t" + dto.getAge() + "\t");
			System.out.println(dto.getAddr() + "\t" + dto.getTel());
		}
		
		//ArratList<>의 내용을 출력하시오 ▶ Iterator(열거, 나열형 클래스) : 사이즈 정보를 알 수 없을때 사용
		Iterator<MemberDTO> it = list.iterator();
		while(it.hasNext()){	//다음 공간에 데이터가 존재하는지 판단
			System.out.print(it.next().getName() + "\t" + it.next().getAge() + "\t");
			System.out.println(it.next().getAddr() + "\t" + it.next().getTel());
		}
	}

}
