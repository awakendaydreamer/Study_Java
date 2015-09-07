package String;

public class Ex_String04 {

	public static void main(String[] args) {
		String id = "12@34";
		boolean succ = false;
		
		for (int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			System.out.println(ch);
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				succ = true;
				break;
			}//if
		}//for i
		
		if (succ) {
			System.out.println("잘못 입력되었습니다.");
		}else{
			System.out.println("정확하게 입력되었습니다.");
		}
	}

}
