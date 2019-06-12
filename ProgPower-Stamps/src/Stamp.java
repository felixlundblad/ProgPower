import se.lth.cs.pt.window.SimpleWindow;

public class Stamp {
	Turtle t;
	
	public Stamp(SimpleWindow w) {
		this.t = new Turtle(w, 0, 0);
	}
	
	public void square(int x, int y) {
		t.jumpTo(x-10, y+10);
		t.penDown();
		t.turnNorth();
		t.left(-90);
		for (int i = 0; i < 4; i++) {
			t.forward(20);
			t.left(90);	
		}
	}
}
