package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception04 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;						//ArithmeticException ▶ 미확인 예외
			System.out.println(a);
			
			FileInputStream fis = new FileInputStream("abc.txt");
			//FileNotFoundException ▶ 확인예외
		} catch (ArithmeticException e) {
			System.out.println("입력값이 잘못 되었습니다.");
		} catch(FileNotFoundException e){
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
