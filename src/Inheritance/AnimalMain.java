package Inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 3);	//Dog 객체를 생성하고
		Cat cat = new Cat("야옹이", 2);
	
	
		System.out.println("강아지 이름 : " + dog.getName() + "\t 나이 : " + dog.getAge());
		System.out.println("고양이 이름 : " + cat.getName() + "\t 나이 : " + cat.getAge());
	
		dog.setName("복실이");
		dog.setAge(5);
		System.out.println("강아지 이름 : " + dog.getName() + "\t 나이 : " + dog.getAge());
		cat.setName("낸시랭");
		cat.setAge(7);
		System.out.println("고양이 이름 : " + cat.getName() + "\t 나이 : " + cat.getAge());
		
		
	}//main()
}//class
