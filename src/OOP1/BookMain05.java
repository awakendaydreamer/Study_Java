package OOP1;

public class BookMain05 {

	public static void main(String[] args) {
		//책 3권의 정보를 저장할 객체배열을 선언
		BookDTO[] b = new BookDTO[3];
		
		//BookDTO의 생성자 메서드를 이용하여 초기화 → 내용(값)을 입력
		b[0] = new BookDTO("JAVA" , 30000, "강요천" , "프리렉");
		b[1] = new BookDTO("JSP" , 32000, "홍길동", "한빛미디어");
		b[2] = new BookDTO("Android", 28000, "양자강", "더조은");
		
		//가격을 기준으로 오름차순 정렬③
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getPrice() > b[j].getPrice()) {
					BookDTO temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		//객체배열의 내용을 출력(for)②
		System.out.println("제목\t가격\t저자\t출판사");
		System.out.println("===================");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}//main()
}//class
