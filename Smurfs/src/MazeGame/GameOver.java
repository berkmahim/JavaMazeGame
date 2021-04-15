package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class GameOver {
	
	private int TileX;
	private int TileY;
	private Image gameoverImage;
	
	public GameOver() {
		
		gameoverImage= new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\game_over.png").getImage();
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
	public Image getGameoverImage() {
		return gameoverImage;
	}

}
