package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Azman extends Dusman {
	private Image Azman;
	//public Map map = new Map();
	public Azman(int tileX, int tileY, int id, String ad, String tür) {
		super(tileX, tileY, id, ad, tür);
		Azman=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\azman.jpg").getImage();
		
	}
	@Override
	public Image getPlayer1() {
		
		return Azman;
	}
	@Override
	public void move(int dx, int dy) {
		
		super.move(dx,dy);
	}
	private int[][] harita = new int[11][13];
    public int[][] yol = new int[100][2];
   
  
    int mesafe = 0;
	
    public void HedefBul(int oyuncuY,int oyuncuX,Map map) {
		  if(map.isAzmanbool()==true) {
    	
	        for (int a = 0; a < 1; a++) {

	          
				for (int i = 0; i < 11; i++) {
	                for (int j = 0; j < 13; j++) {
	                    harita[i][j] = Integer.MAX_VALUE;
	                }
	            }
	            harita[this.getTileY()][this.getTileX()] = 0;
	            DusmaninYolu(this.getTileY() - 1, this.getTileX(), 1, 1,map);
	            DusmaninYolu(this.getTileY() + 1, this.getTileX(), 1, 1,map);
	            DusmaninYolu(this.getTileY(), this.getTileX() - 1, 1, 1,map);
	            DusmaninYolu(this.getTileY(), this.getTileX() + 1, 1, 1,map);
	            

	          

	            mesafe = harita[oyuncuY][oyuncuX];
	            yol[mesafe][0] =oyuncuY;
	            yol[mesafe][1] = oyuncuX;
	            for (int i = mesafe - 1; i > -1; i--) {
	                if (harita[yol[i + 1][0] + 1][yol[i + 1][1]] == i) {
	                	yol[i][0] = yol[i + 1][0] + 1;
	                	yol[i][1] = yol[i + 1][1];
	                } else if (harita[yol[i + 1][0] - 1][yol[i + 1][1]] == i) {
	                	yol[i][0] = yol[i + 1][0] - 1;
	                	yol[i][1] = yol[i + 1][1];
	                } else if (harita[yol[i + 1][0]][yol[i + 1][1] + 1] == i) {
	                	yol[i][0] = yol[i + 1][0];
	                	yol[i][1] = yol[i + 1][1] + 1;
	                } else if (harita[yol[i + 1][0]][yol[i + 1][1] - 1] == i) {
	                	yol[i][0] = yol[i + 1][0];
	                	yol[i][1] = yol[i + 1][1] - 1;
	                }
	            }

	      
	         
	        	   this.move(yol[1][1] - getTileX(),yol[1][0] - getTileY() );
	         
	          
	           
	        }
    }
	    }

	    public void DusmaninYolu(int oyuncuY, int oyuncuX, int mesafe, int karakter, Map m) {
	        if ((oyuncuX > -1) && (oyuncuY > -1) && (oyuncuY < 10) && (oyuncuX < 12)) {
	          
	                if ((m.getMap(oyuncuY, oyuncuX)!=0) && (harita[oyuncuY][oyuncuX] > mesafe)) {
	                    harita[oyuncuY][oyuncuX] = mesafe;
	                    DusmaninYolu(oyuncuY - 1, oyuncuX, mesafe + 1, karakter,m);
	                    DusmaninYolu(oyuncuY + 1, oyuncuX, mesafe + 1, karakter,m);
	                    DusmaninYolu(oyuncuY, oyuncuX - 1, mesafe + 1, karakter,m);
	                    DusmaninYolu(oyuncuY, oyuncuX + 1, mesafe + 1, karakter,m);
	                }

	            
	        

	        }

	
	
	    }
	 
}
	

