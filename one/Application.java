package one;

public class Application {

	public static void main(String[]args) {
	
	//Task 2: Write another class, Application, in which you instantiate a new Person object.
	Person p = new Person(); //instantiate a new Person object 
	
	//Task 3: Set person's age and name properties 
	p.name = "Jessica";
	p.age = 28;
	
	//Task 4: print the age and name of created person and place in package called "one"
	System.out.print("Name:" + p.name + "  Age:" + p.age);
	
	
	}
}
