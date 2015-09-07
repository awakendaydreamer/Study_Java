package Inheritance;

public class Animal {	//AnimalDTO 상태정보
	//①
	private String name;
	private int age;

	//②
	public Animal() {
	}

	//③
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//④
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	
}

