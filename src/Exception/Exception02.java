package Exception;

public class Exception02 {

	public static void main(String[] args) {
		//가스불을 켠다 → 요리 시작 → 요리 끝 → 가스를 잠근다 → 종료
		
		try {
			System.out.println("가스를 켠다");
			System.out.println("요리 시작");
			int a = 10 / 0;
			System.out.println("요리 끝");
//			System.out.println("가스를 잠근다");
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
//			System.out.println("가스를 잠근다");
		}finally{
			System.out.println("가스를 잠근다");
		}
		System.out.println("종료");

	}

}
