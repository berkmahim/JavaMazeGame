package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TembelSirin extends Player {
	
	private Image TembelSirin;
	public TembelSirin(int tileX, int tileY, int id, String ad, String t�r, int skor) {
		super(tileX, tileY, id, ad, t�r, skor);
		TembelSirin=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\tembel_sirin.png").getImage();
	}
	@Override
	public Image getPlayer1() {
		
		return TembelSirin;
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		super.move(dx,dy);
	}
     
}
