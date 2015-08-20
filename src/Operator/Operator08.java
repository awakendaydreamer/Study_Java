package Operator;

public class Operator08 {
	public static void main(String[] args) {
		// 프로그램에서 사용되는 특수문자(escape sequence) : 출력문에서 많이 사용
		// 역슬래쉬(\)를 먼저 입력하고 사용한다.

		System.out.println("1.HelloWorld");
		System.out.println("2.Hello" + "\t" + "World"); // \t:탭간격(8칸 띄어쓰기) ★
		System.out.println("2.Hello\tWorld"); // 문자열 출력문 안에서 사용가능
		System.out.println("3.Hello" + "\n" + "World"); // New line (줄바꿈) ★
		System.out.println("4.Hello" + "\b" + "World"); // Back space(한칸뒤로 이동)
		System.out.println("5.Hello" + "\r" + "World"); // Carriage Return(행바꿈)
		System.out.println("6.Hello" + "\'" + "World"); // 작은따옴표 표시
		System.out.println("7.Hello" + "\"" + "World"); // 쌍따옴표 표시
		System.out.println("8.Hello" + "\\" + "World"); // (역 슬래쉬,Root)표시

		System.out.println("번호" + "\t" + "이름" + "\t" + "연락처" + "\t" + "\t"
				+ "주소");
		System.out.println("001\t홍길동\t123-4569\t광주 서구 광천동");
		System.out.println("001\t홍길동\t123-4569\t광주 서구 광천동");
		System.out.println("001\t홍길동\t123-4569\t광주 서구 광천동");
		System.out.println("001\t홍길동\t123-4569\t광주 서구 광천동");
	}

}
