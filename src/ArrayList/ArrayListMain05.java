package ArrayList;

import java.util.ArrayList;

public class ArrayListMain05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		
		System.out.println(list);
		
		list.add(1, "추가");			//추가 : 2번지부터 뒤로 밀림
		System.out.println(list);
		
		list.set(1, "수정");			//수정 : 2번지가 수정됨
		System.out.println(list);
	}

}
