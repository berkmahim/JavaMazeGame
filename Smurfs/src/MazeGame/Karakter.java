package MazeGame;

import java.awt.*;
public class Karakter {
	private int tileX,tileY;
	private int Id;
	private String Ad;
	private String t�r;
	private Image player1;
	public Karakter(int tileX, int tileY, int id, String ad, String t�r) {
		super();
		this.tileX = tileX;
		this.tileY = tileY;
		Id = id;
		Ad = ad;
		this.t�r = t�r;
		
	}
	public int getTileX() {
		return tileX;
	}
	public void setTileX(int tileX) {
		this.tileX = tileX;
	}
	public int getTileY() {
		return tileY;
	}
	public void setTileY(int tileY) {
		this.tileY = tileY;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getT�r() {
		return t�r;
	}
	public void setT�r(String t�r) {
		this.t�r = t�r;
	}
	public Image getPlayer1() {
		return player1;
	}
	public void setPlayer1(Image player1) {
		this.player1 = player1;
	}
	public void move(int dx,int dy) {
		
		
		tileX=tileX+dx;
		tileY=tileY+dy;
		 
	}
}