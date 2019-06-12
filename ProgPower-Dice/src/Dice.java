import java.util.Random;

public class Dice {
	Random rand;
	int eyes;
	
	public Dice(int eyes) {
		rand = new Random();
		this.eyes = eyes;
	}
	
	public int roll() {
		return 1 + rand.nextInt(eyes);
	}
	
}
