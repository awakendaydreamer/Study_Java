package IO;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Ex_13 {

	public static void main(String[] args) {
		//URL(Uniform Resource Location) : 웹상에서 특정 정보가 위치한 주소
		//특정 URL의 소스 보기(HTML) → 파일로 생성(UrlHtml.txt)
		
		try {													//1
			URL url = new URL("http://www.naver.com");				//2 읽어드리고자하는곳 정하기
			InputStream is = url.openStream();						//3 빨대 꼽기.
			OutputStream os = new FileOutputStream("UrlHtml.txt");	//4 Upcasting 하면서 
			int data;
			while((data = is.read()) != -1){
				System.out.println(data);
				os.write(data);
			}
			System.out.println("저장이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
