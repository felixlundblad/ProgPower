
public class Person {
	int age;
	String name;
	boolean atBar;
	
	public Person(String n, int a) {
		age = a;
		name = n;
		atBar = false;
	}
	
	public void happy_birthday() {
		age = age + 1;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void changeName(String newName) {
		name = newName;
	}
	
	public void setAtBar(boolean in) {
		atBar = in;
	}
	
	public void printInfo() {
		System.out.print("Name: \t" + name + '\t');
		System.out.println("Age: \t" + age);
		System.out.println("At bar: " + atBar);
	}
	
	public String toString() {
		return name;
	}
}
