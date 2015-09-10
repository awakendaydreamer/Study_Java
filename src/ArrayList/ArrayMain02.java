package ArrayList;

import java.util.ArrayList;

import com.tjo.array.A;

public class ArrayMain02 {

	public static void main(String[] args) {
		//ArrayList 객체(arrList) 생성 → Object 객체 : 모든 객체
		ArrayList<Object> arrList = new ArrayList<Object>();
		arrList.add(new A());
		((A)(arrList.get(0))).print(); 		//A Class Type Casting
		
		
		//ArrayList에 특정 클래스 (A.class)만 저장하기 위해서 제한하는 방법
		ArrayList<A> list = new ArrayList<A>();
		list.add(new A());
		list.get(0).print();
	}

}
