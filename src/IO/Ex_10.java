package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_10 {

	public static void main(String[] args) {
		//버퍼를 사용하자 : 입출력 효율화
		//버퍼의 기본크기 : 1024Byte
		//버퍼를 사용할 경우에는 반드시 종료(close)해야한다.
		//마지막 버퍼의 경우에는 기본크기(1024Byte)보다 작은 용량이 버퍼에 남아있다.
		//따라서 버퍼에 남아 있는 내용을 강제로 전속(flush) 시킨후에 종료
		
		try {
			FileInputStream fis = new FileInputStream("pic.jpg"); 			//원본파일
			FileOutputStream fos = new FileOutputStream("copy2.jpg");		//사본파일
			
			BufferedInputStream bis = new BufferedInputStream(fis);		 //입력버퍼
			BufferedOutputStream bos = new BufferedOutputStream(fos);	 //출력버퍼
			
			
			int data, cnt = 0;
			while((data = bis.read()) != -1){
				cnt++;
				System.out.println(data);
				bos.write(data);
			}
			
			//bos.flush();	//버퍼에 남아있는 내용을 강제전송(전송완료는 안되어 있음)
			bos.close();	//전송완료
			bis.close();
			fos.close();
			fis.close();
			System.out.println("접근횟수 : " + cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}

	}

}
