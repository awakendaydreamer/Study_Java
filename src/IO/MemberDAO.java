package IO;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;

public class MemberDAO {

	public void print(ArrayList<MemberDTO> list) {
		System.out.println("번호\t이름 \t 나이 \t 주소 \t\t 전화번호");
		System.out.println("=======================================================");
		for (int i = 0; i < list.size(); i++) {
			MemberDTO temp = list.get(i);
			System.out.print(temp.getNum() + "\t");
			System.out.print(temp.getName() + "\t");
			System.out.print(temp.getAge() + "\t");
			System.out.print(temp.getAddr() + "\t");
			System.out.println(temp.getTel());
		}
		System.out.println("=======================================================");
	}

	public void sortNameAsc(ArrayList<MemberDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getName().compareTo(list.get(j).getName()) > 0) {
					MemberDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
			
		}
		
	}

	public void fileSaveline(ArrayList<MemberDTO> list) {

		try {
			FileWriter fw = new FileWriter("membersort.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (MemberDTO dto : list) {
				String line = dto.getNum() + "\t" + dto.getName() + "\t" + dto.getAge() + "\t";
				line += dto.getAddr() +"\t" + dto.getTel() + "\t";
				bw.write(line);
				bw.flush();
			}
			bw.close();
			System.out.println("저장이 완료 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//		FileInputStream fis = new FileInputStream("membersort.txt");
		//		DataInputStream dis = new DataInputStream(fis);
		
		
	}

}
