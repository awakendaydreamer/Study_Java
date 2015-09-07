package String;

public class Ex_String01 {

	public static void main(String[] args) {
		//String Class : 문자열을 조작하기 위한 기능을 담고 있는 클래스 ▶ SunMicroSystem(Oracle) : API
		//JRE System Library > rt.jar > java.lang
		String str1 = "apple"; //"apple"이라는 문자열을 str1 변수에 할당(초기화)
		String str2 = new String("APPLE"); //"APPLE"이라는 문자열을 str2 객체에 할당
		System.out.println("변수 str1 :" + str1);
		System.out.println("객체 str2 :" + str2);
		
		//문자열의 길이
		System.out.println("str1의 길이 :" + str1.length());
		
		//대문자로 변경 >> to upperCase
		System.out.println("str1을 대문자로 변경 :" + str1.toUpperCase());
		
		//소문자로 변경 >>to lowerCase
		System.out.println("str2을 소문자로 변경 :" + str2.toLowerCase());
		
		//특정 문자만 추출(★) >> substring
		// apple
		// 01234
		System.out.println(str1.substring(1));	//index 1부터 끝까지 추출 : pple
		System.out.println(str1.substring(1, 3));//index 1부터 3의 앞까지 추출 : pp
		
		//특정 문자의 존재 여부(존재 : index 값을 반환, 실패 : -1 반환) >> indexOf
		//apple
		//01234
		int succ = str1.indexOf("le");
		System.out.println(succ);
		if (succ == -1) {
			System.out.println("검색실패");
			System.out.println("해당되는 문자열이 존재하지 않습니다.");
			
		}else{
			System.out.println("검색성공");
			System.out.println("해당되는 문자열은 " + (succ + 1) + "번째에 있습니다.");
		}
		
		//문자열을 분리 >> split
		String str3 = "대:300@중:200@소:100";	//@를 기준으로 문자열을 분리 : 배열
		String[] sp =str3.split("@");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		//문자열에서 특정 문자 한글자를 출력(★) >> charAt
		//apple
		//01234
		System.out.println(str2.charAt(3)); //index 3값에 해당되는 문자를 추출 : L
		System.out.println(str2.substring(3,4));
		
		//문자열을 한글자씩 출력 >>
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		//문자열을 치환 (찾아 바꾸기) >> replaceAll
		System.out.println(str2.replaceAll("PP", "@@"));
		System.out.println(str2.replaceAll("P", "@@"));
	}
}
