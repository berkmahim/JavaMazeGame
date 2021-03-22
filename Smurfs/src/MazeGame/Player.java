package MazeGame;

public class Player {
	
	private int x, y, blokx, bloky;
	public Player(){
		x = 32;
		y = 32;
		blokx = 1;
		bloky = 1;
	}
	
	public void move(int dx, int dy, int bx, int by) {
		x+= dx;
		y+= dy;
		blokx+= bx;
		bloky+= by;
	}
	

}
