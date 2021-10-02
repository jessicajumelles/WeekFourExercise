package three;

public class TalkablePerson {
	
	String name;
	int age;
	//Task 1: Write a class named TalkablePerson that declares a public talk() method along with name (String) and age(int) properties.
	
	
	//Task 2: The talk() method should have a void return type and print the message, “Hello my name is: {name}”.
	public void talk() {
		System.out.print("Hello my name is: " + this.name);
		//Task 3:Instead of {name} the TakablePerson’s name property should be printed.
		//Hint: Use the keyword this to access a member variable
	}

}
