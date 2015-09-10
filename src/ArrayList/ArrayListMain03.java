package ArrayList;

import java.util.ArrayList;

public class ArrayListMain03 {

	public static void main(String[] args) {
		// ArrayList(list)에 정수 10, 20, 30, 40, 50을 저장(add())하고 출력(get())하시오.
//		ArrayList<Object> list = new ArrayList<Object>(); //출력시 Casting필요 
		ArrayList<Integer> list = new ArrayList<Integer>();	//Casting 불필요
		
		list.add(new Integer(10));	//정상적인 표현방법
		list.add(new Integer(20));
		list.add(30);				//boxing : 컴파일러가 자동으로 처리해 
		list.add(40);				//Integer : Wrapper Class(포장)
		list.add(50);
		
		System.out.println((Integer)list.get(0)); //Object → Integer ▶ Casting
		System.out.println((Integer)list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		

	}

}
//Wrapper Class : 기본데이터 타입(PDT)을 객체타입(UDT)으로 사용하고자 할 때 (변환)
//int → Integer
//float → Float
//double → Double
//char → Character
//boolean → Boolean
