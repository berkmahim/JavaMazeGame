package MazeGame;

import java.awt.*;

import javax.swing.ImageIcon;

public class GozlukluSirin extends Player {
	private Image GozlukluSirin;
	public GozlukluSirin(int tileX, int tileY, int id, String ad, String tür, int skor) {
		super(tileX, tileY, id, ad, tür, skor);
		GozlukluSirin=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\gozluklu_sirin.png").getImage();
	}
	@Override
	public Image getPlayer1() {
		
		return GozlukluSirin;
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		super.move(2*dx,2*dy);
	}
	
	
	
  
}
