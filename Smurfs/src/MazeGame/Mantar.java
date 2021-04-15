package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mantar extends Obje{
	
	private Image mantarImage;
	private int TileX;
	private int TileY;

public Mantar() {
		
		mantarImage=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\mantar.png").getImage();
		
		}

public Image GetMantarImage() {
	
	return mantarImage;
	
}

public int getTileX() {
	return TileX;
}

public void setTileX(int tileX) {
	TileX = tileX;
}

public int getTileY() {
	return TileY;
}

public void setTileY(int tileY) {
	TileY = tileY;
}	
}
