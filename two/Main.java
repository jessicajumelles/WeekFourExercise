//Task 5:place these files in a package named "two"
package two;

public class Main {

	public static void main(String[]args) {
		
		//Task 4:In a Main class, create a new instance of PrivatePerson and print its properties name and age.
		PrivatePerson p = new PrivatePerson();
		
		p.setAge(28);
		p.setName("Jessica");
		
		System.out.print("Name:" + p.getName() + " Age:" + p.getAge());
		
	}
}
