package For_each;

import java.util.ArrayList;

import com.tjo.member.MemberDTO;

public class For_each_Main02 {

	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("홍길동", 25, "광주시 서구 광천동", "010-1234-5678"));
		list.add(new MemberDTO("황성빈", 29, "광주시 동구 지산동", "010-6410-0486"));

		//ArrayList<>의 내용을 출력하시오 : 단순 for 문
		for (int i = 0; i < list.size(); i++) {
			MemberDTO temp =list.get(i);
			System.out.print(temp.getName() + "\t" + temp.getAge() + "\t");
			System.out.println(temp.getAddr() + "\t" + temp.getTel());
		}
		
		//swap : 서로 자리를 바꿈 → set() 메서드 
		MemberDTO temp = list.get(0);
		list.set(0, list.get(1));
		list.set(1, temp);
		
		
		
		
		//ArrayList<>의 내용을 출력하시오 : 향상된 for 문(for - each)
		for (MemberDTO dto : list) {
			System.out.print(dto.getName() + "\t" + dto.getAge() + "\t");
			System.out.println(dto.getAddr() + "\t" + dto.getTel());
		}
	
	}//main()
}//class
