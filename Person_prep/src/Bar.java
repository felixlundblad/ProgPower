import java.util.Random;

public class Bar{
	String name;
	int ageRequirement;
	String[] banned;
	Random rand;

	public Bar(String name, int ageReq, String[] banned) {
		rand = new Random();
		this.name = name;
		ageRequirement = ageReq;
		this.banned = banned;
	}
	
	public String[] getBanned() {
		return banned;
	}

	public int getAgeRequirement() {
		return ageRequirement;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean enter(Person p) {
		if (p.getAge() < ageRequirement) {
			printAgeRejection(p);
			return false;
		}
		for (int i = 0; i < banned.length; i++) {
			
			if (name == banned[i]) {
				printBannedRejection(p);
				return false;
			}
		}
		printAcceptance(p);
		return true;
	}

/*
 * Private methods below
 */
	
	private boolean checkAge(int age) {
		return age >= ageRequirement;
	}

	private boolean checkBanned(String name) {
		for (int i = 0; i < banned.length; i++) {
			if (name == banned[i]) return true;
		}
		return false;
	}
	
	private void printBannedRejection(Person p) {
		System.out.println("Good evening " + p.getName() + "!");
		System.out.println("The list says you are banned since the last time.");
		System.out.println("You are going to have to find another tavern tonight.");
		System.out.println("Sorry...");
	}
	
	private void printAgeRejection(Person p) {
		System.out.println("Hello there little one!");
		System.out.println("Should you not be in bed right now?");
		System.out.println("We have an age requirement of " + ageRequirement +",");
		System.out.println("so you are going to have to come back in " + (ageRequirement - p.getAge()) + " years.");
	}
	
	private void printAcceptance(Person p) {
		System.out.println("Welcome to " + name + "!");
		if(p.getAge() == ageRequirement) System.out.println("I see you recently turned "+ageRequirement + "! \n"
				+ "Congratulations! The first mj�d is on me!");
		if (p.name == "Loke") System.out.println("Ah, I see you are coming as your own shape today! \n"
				+ "Please don't stab anyone tonight Loke!");
		int version = rand.nextInt(3);
		if (version == 0)System.out.println("Have a seat at the bar or head down to the basement for the Hnefatafl tournament!");
		else if (version == 1) System.out.println("We will have a mj�d drinking contest in a few minutes. \nWhy don't you join in?");
		else if (version == 2 && name != "Loke") System.out.println("I heard Loke is sneaking around outside the club.\n"
				+ "He is a bit mad since he didn't get in tonight.\n"
				+ "You better enter quickly or risk to get stabbed in the neck!");
	}

}

