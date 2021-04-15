package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player extends Karakter
{
private int skor;

	public Player(int tileX, int tileY, int id, String ad, String tür,int skor) {
		super(tileX, tileY, id, ad, tür);
		this.skor=skor;
		
	}
	
	
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	
	

}