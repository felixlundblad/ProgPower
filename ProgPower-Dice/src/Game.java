import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {
		Dice d = new Dice(6);
		//System.out.println(d.roll());
		
		ArrayList<Integer> history = new ArrayList<Integer>();
		int counter = 2;
		history.add(d.roll());
		history.add(d.roll());
		history.add(d.roll());
		while (history.get(counter - 1) != history.get(counter) || history.get(counter - 2) != history.get(counter)) {
			counter++;
			history.add(d.roll());
		}
		System.out.println(history);
		System.out.println("The amount of throws to get the same result back to back was: " + (counter + 1));
	}
}
