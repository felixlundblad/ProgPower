import java.util.ArrayList;
import java.util.Scanner;

public class BarNight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person p1 = new Person("Tor", 33);
		Person p2 = new Person("Loke", 25);
		Person p3 = new Person("Freja", 12);
		Person p4 = new Person("Vidar", 67);
		
		ArrayList<Person> company = new ArrayList<Person>();
		company.add(p1);
		company.add(p2);
		company.add(p3);
		company.add(p4);

		System.out.println(company.toString());
		scan.nextLine();
		
		company.add(new Person("Oden", 120));

		System.out.println(company.toString());
		scan.nextLine();
		
		BarList barList = new BarList();
		
		for(Person p : company) {
			System.out.println(p);
			boolean in = barList.getBar(1).enter(p);
			p.setAtBar(in);
			System.out.println();
			scan.nextLine();
		}
		
		//barList.printAllBarInfo();
	}
}
