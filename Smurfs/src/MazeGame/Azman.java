package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Azman extends Dusman {
	private Image Azman;
	public Azman(int tileX, int tileY, int id, String ad, String tür) {
		super(tileX, tileY, id, ad, tür);
		Azman=new ImageIcon("C:\\Users\\mehmet\\eclipse-workspace\\JavaMazeGame-master\\deneme\\pictures\\tembelsirin.jpg").getImage();
	}
	@Override
	public Image getPlayer1() {
		
		return Azman;
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		super.move(2*dx,2*dy);
	}
	
		
}