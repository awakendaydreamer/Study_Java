package Exception;

public class Exception03 {

	public static void main(String[] args) {
		int x = 0;
		try {
			int y = 100 /x;						//예외 발생할 수 있다.
			System.out.println(y);				//예외발생 → 수행불가
		} catch (Exception e) {
			System.out.println("x의 값이 잘못되었습니다.");
			e.printStackTrace(); 				//예외의 출처를 메모리상에서 추적하면서 결과를 출력(상세)
		}finally{
			System.out.println("종료");
		}
	}

}
