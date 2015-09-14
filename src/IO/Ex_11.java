package IO;

import java.io.FileReader;

public class Ex_11 {

	public static void main(String[] args) {
		//파일에서 문자단위로 입출력하는 스트림 : FileReader, FileWriter
		//한글이 포함된 member.txt 파일에서 데이터를 읽어서 출력(Console Windows)
		//먼저 member.txt 파일을 생성(IO프로젝트 > 마오> new > file > 
		//내용 작성 시 항목간의 구분은 TAB 키를 이용한다.
		
		try {
			FileReader fr = new FileReader("member.txt");	//읽어들이고자하는 원본파일
			int data, cnt =0;
			while((data = fr.read()) != -1){
				System.out.println((char)data);
				cnt++;
				
			}
			fr.close();
			System.out.println("반복횟수 : " + cnt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
