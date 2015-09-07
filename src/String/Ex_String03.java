package String;

public class Ex_String03 {

	public static void main(String[] args) {
		String str1 = new String("APPLE");	//new : 객체를 생성 → 참조형 자료구조                (Call by reference)
		String str2 = new String("APPLE");	//new : 새롭게 메모리 할당하라는 의미				
		String str3 = "APPLE";				//String Class Type str3 선언하고, 값을 할당 (Call by value)
		String str4	= "APPLE";
		
		//Question : str1 과 str2가 같은지 비교 ▶ 같아 보이지만 다르다.
		if (str1 == str2) {
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}

		//Question : str3 과 str4가 같은지 비교 
		if (str3 == str4) {
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		//Question : str1과 str2가 같다라는 결과를 얻는 방법1 ▶ compareTo()
		if (str1.compareTo(str2) == 0) {
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		
		//Question : str1과 str2가 같다라는 결과를 얻는 방법2 ▶ equals()
		if (str1.equals(str2)) {
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
	}//main()

}
