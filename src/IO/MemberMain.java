package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MemberMain {
	/*
	 	- "member.txt" 파일에서 데이터를 읽어서 ▶ FileReader, BufferedReader, readLine()
	 	- 각 항목은 TAB으로 구분되어 있음 ▶ split("\t")
	 	- ArrayList<> 구조로 데이터화 하여라  ▶ ArrayList<MemberDTO>
	 	- 성명을 기준으로 오름차순 정렬 후 화면에 출력▶  sortNameAsc(), print()
	 	- "membersort.txt" 파일 생성(출력) ▶ flieSave() → FileWriter, BufferedWriter, flush()
	 */
	
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("member2.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			MemberDTO dto;
			ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
			while((line = br.readLine()) != null){
				//문자열을 분리 >> split
		//		String str3 = "대:300@중:200@소:100";	//@를 기준으로 문자열을 분리 : 배열
				String[] sp = line.split("\t");
				dto = new MemberDTO(Integer.parseInt(sp[0]), sp[1], Integer.parseInt(sp[2]), sp[3], sp[4]);
				list.add(dto);
				
				
			}
			MemberDAO dao = new MemberDAO();
			dao.print(list); 		//정렬전 출력
			dao.sortNameAsc(list);	//성명의 오름차순 정렬
			dao.print(list);		//정렬후 출력
			dao.fileSaveline(list);		//membersort.txt 파일 생성
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
