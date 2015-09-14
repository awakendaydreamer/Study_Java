package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MemberCopyMain {

	public static void main(String[] args) {
		//member.txt 파일에서 데이터를 라인단위(readLine())로 읽어서
		//membercopy.txt 파일에 저장하시오.
		//파일복사 : member.txt → membercopy.txt
		
		try {
			//파일 압력을 위한 준비단계
			FileReader fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);
			//파일 출력을 위한 준비단계
			FileWriter fw = new FileWriter("membercopy.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			//읽어들인 라인을 저장할 변수
			String line = null;
			//파일을 읽고 출력하는 로직
			while((line=br.readLine()) != null){
				bw.write(line);
				bw.newLine();			//줄바꿈(\n)
				
			}
			//마지막 버퍼의 내용을 강제전송후 전송완료 및 입출력 버퍼 종료(close)
			bw.flush();
			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
