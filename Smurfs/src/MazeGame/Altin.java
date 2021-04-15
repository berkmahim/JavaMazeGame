package MazeGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class Altin{
	
	private int AltinSayisi;
	private Image altinImage;
	private int TileX;
	private int TileY;
	
	int [][] altinkoordinats;
	static ArrayList<Image> Altinlar;

		
	public Altin() {
		
		altinImage=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\gold.png").getImage();
		
		}


	
	
	
public Image GetAltinImage() {
	
	return altinImage;
	
}
	
	
public int getAltinSayisi() {
		return AltinSayisi;
	}








	public void setAltinSayisi(int altinSayisi) {
		AltinSayisi = altinSayisi;
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
