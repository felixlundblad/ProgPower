import java.util.ArrayList;

public class BarList {
	ArrayList<Bar> list;
	
	public BarList() {
		list = new ArrayList<Bar>();
		list.add(new Bar("The Asgardian", 25, new String[]{"Loke", "Freja"}));
		list.add(new Bar("Freja's tavern", 0, new String[] {"Tor", "Oden"}));
		list.add(new Bar("Hipp", 18, new String[] {}));
	}
	
	public void printBarList() {
		for (Bar bar : list) {
			System.out.println(bar.getName());
		}
	}
	
	public void printAllBarInfo() {
		int counter = 0;
		for (Bar bar : list) {
			counter++;
			System.out.print(counter + ". " + bar.getName() + '\n');
			System.out.println("\tAge requirement: " + bar.getAgeRequirement());
			System.out.print("\tBanned: ");
			for (String name : bar.getBanned()) {
				System.out.print(name + ". ");
			}
			System.out.println();
		}
	}
	
	public Bar getBar(int i) {
		return list.get(i-1);
	}
}
