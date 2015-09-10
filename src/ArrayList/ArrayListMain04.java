package ArrayList;

import java.util.ArrayList;

public class ArrayListMain04 {

	public static void main(String[] args) {
		// ArrayList(list)에 정수 10, 20, 30, 40, 50을 저장(add())하고 출력(get())하시오.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 5; i++) {	//값을 할당(index 번지를 안썼어도 넣었다)
			list.add(new Integer(i * 10));
		}
		
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
	}//main()

}//class
