package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Gargamel extends Dusman {
	private Image Gargamel;
	public Gargamel(int tileX, int tileY, int id, String ad, String t�r) {
		super(tileX, tileY, id, ad, t�r);
		Gargamel=new ImageIcon("C:\\Users\\mehmet\\eclipse-workspace\\JavaMazeGame-master\\deneme\\pictures\\tembelsirin.jpg").getImage();
	}
	@Override
	public Image getPlayer1() {
		
		return Gargamel;
	}
	@Override
	public void move(int dx, int dy) {
		
		super.move(dx,dy);
	}

}
