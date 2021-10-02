package two;

//Task 1: write a class named PrivatePerson
public class PrivatePerson {
	
	//Task 2: Declare two instance variables "name" (String) and "age" (int) and mark them private.
	private String name;
	private int age;
	
	//Task 3: Write public getter and setter methods to access these properties.
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
