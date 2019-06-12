import java.awt.Color;
import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class Draw {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Felix window");
		Stamp s = new Stamp(w);
		
		while(true) {
			w.waitForEvent();
			s.square(w.getMouseX(), w.getMouseY());
			setRandomColor(w);
		}
	}
	
	private static void setRandomColor(SimpleWindow w) {
		Random rand = new Random();
		w.setLineColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
	}
}