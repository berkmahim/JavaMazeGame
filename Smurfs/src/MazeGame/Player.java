package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y, blokx, bloky;
	private Image playerImage;
	
	public Player(){
		
		ImageIcon img = new ImageIcon("gozluklu_sirin.png");
		playerImage = img.getImage();
		x = 32;
		y = 32;
		blokx = 1;
		bloky = 1;
	}
	public Image getPlayer() {
		return playerImage;
	}
	
	public void move(int dx, int dy, int bx, int by) {
		x+= dx;
		y+= dy;
		blokx+= bx;
		bloky+= by;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getBlokx() {
		return blokx;
	}
	public void setBlokx(int blokx) {
		this.blokx = blokx;
	}
	public int getBloky() {
		return bloky;
	}
	public void setBloky(int bloky) {
		this.bloky = bloky;
	}
	

}
