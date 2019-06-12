import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {
	SimpleWindow w;
	double x, y;
	int dir;
	boolean penDown;
	
	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.x = x;
		this.y = y;
		dir = 90;
	}

	/** Sänker pennan. */
	public void penDown() {
		penDown = true;
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		penDown = false;
	}
	
	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		w.moveTo((int)x, (int)y);
		x += Math.round(n*Math.cos((int)dir*Math.PI/180.0));
		y -= Math.round(n*Math.sin((int)dir*Math.PI/180.0));
		if(penDown) {
			w.lineTo((int)x, (int)y);
		} else {
			w.moveTo((int)x, (int)y);
		}
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		dir += beta;
	}

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		dir = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return (int)x;
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int)y;
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
 		return dir;
	}
}
