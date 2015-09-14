package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex_12 {

	public static void main(String[] args) {
		//버퍼를 활용하여 파일에서 문자 단위로 입출력하는 스트림 : BufferedReader, BufferedWriter
		//한글이 포함된 member.txt 파일에서 데이터를 읽어서 출력(Console Windows)
		//readLine() 메서드를 활용하면 한 줄(Line) 단위로 입력
		
		try {
			FileReader fr = new FileReader("member.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			int cnt = 0;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
				cnt++;
			}
			br.close();
			System.out.println("반복횟수 : " + cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
