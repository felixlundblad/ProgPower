
public class Person {
	int age;
	String name;
	boolean atBar;
	
	// Constructor which defines how a person is described
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		atBar = false;
	}
	
	// Method which increases the persons age by one
	public void happy_birthday() {
		age = age + 1;
	}
	
	// Method which returns the persons age
	public int getAge() {
		return age;
	}
	
	// Method which returns the persons name
	public String getName() {
		return name;
	}
	
	// Method which changes the name of the person
	public void changeName(String newName) {
		name = newName;
	}
	
	// Method which sets the status of whether
	// the person is at the bar or not
	public void setAtBar(boolean in) {
		atBar = in;
	}
	
	// Method which prints the info about the person
	public void printInfo() {
		System.out.print("Name: \t" + name + '\t');
		System.out.println("Age: \t" + age);
		System.out.println("At bar: " + atBar);
	}
	
	// Method which returns a string when a person 
	// is implicitly converted to a string
	public String toString() {
		return name;
	}
}
