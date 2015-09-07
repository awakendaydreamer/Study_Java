package String;

public class Ex_String02 {

	public static void main(String[] args) {
		//문자열의 대소관계를 비교
		String str1 = new String("APPLE");	//객체생성 → 참조형 자료구조
		String str2 = new String("ORANGE");
		String str3 = new String("APPLE");
		String str4 = new String("apple");
		
		//if (str1 > str2)  ▶ 문자열의 대소관계는 부등호(비교연산자)를 사용하면 안된다.
		//문자열의 비교는 유니코드(아스키코드)값으로 비교해야된다.
		//compareTo() 결과 : 양수left value 큼, 음수right value큼, 0 반환
		
		int result = str1.compareTo(str2);
		System.out.println(result);
		
		result = str2.compareTo(str1);
		System.out.println(result);
		
		result = str1.compareTo(str3);
		System.out.println(result);
		
		if(str1.compareTo(str2) > 0 ){
			System.out.println(str1 + "이(가)" + str2 + "보다크다.");
		}else if(str1.compareTo(str2) < 0){
			System.out.println(str1 + "이(가)" + str2 + "보다 작다."); 
		}else{
			System.out.println(str1 + "이(가)" + str2 + "은(는) 같다.");
		}
		
		//문자열이 같은지 다른지를 판단하는 메서드
		if(str1.equals(str2)){
			System.out.println(str1 + "와(과)" + str2 + "은(는) 같다.");
		}else{
			System.out.println(str1 + "와(과)" + str2 + "은(는) 같지 않다.");
		}
		
		if (str1.equalsIgnoreCase(str4)) {
			System.out.println(str1 + "와(과)" + str4 + "은(는) 같다.");
		}else{
			System.out.println(str1 + "와(과)" + str4 + "은(는) 같지 않다.");
		}
		
		
	}//main()

}
