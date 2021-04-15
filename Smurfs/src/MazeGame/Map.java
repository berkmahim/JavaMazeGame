
package MazeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map 
{

	private Scanner m;
	private int Map[][]=new int[11][13];

	private Image grass;
	
	private Image wall;
	public int azmanx,azmany,gargamelx,gargamely;
	private boolean azmanbool=false;
	private boolean gargamelbool=false;
	
	
	
	
	public Map() 
	{
	  grass=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\wall.png").getImage();
	  wall=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\wall.png").getImage();
	  
  
	readFile();
	
		
}
	public Image getGrass() 
	{
		return grass;
	}
	
	public Image getWall() 
	{
		return wall;
	}
	
	
	public int getMap(int x, int y) 
	{
		int index=Map[x][y];
	
		return index;
		
	}
	
	
		
	
	public void readFile() 
	{
		try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\berkm\\git\\repository\\Smurfs\\src\\MazeGame\\Map.txt"));
            int i=0;

            

            for(String line ; (line = br.readLine()) != null; )
            {
                if(line.startsWith("K"))
                {
                    String[] integerStrings = line.split(":");
                   
                  
                    if (integerStrings[1].startsWith("Azman"))
                    {
                    	if (integerStrings.length>=3) 
                        {
                            if (integerStrings[2].startsWith("A")) 
                            {
                                azmanx = 3;
                                azmany = 0;
                                azmanbool=true;
                                
                            } 
                            else if (integerStrings[2].startsWith("B")) 
                            {
                                azmanx = 10;
                                azmany = 0;
                                azmanbool=true;
                                
                            } 
                            else if (integerStrings[2].startsWith("C")) 
                            {
                                azmanx = 0;
                                azmany = 5;
                                azmanbool=true;
                               
                            } 
                            else if (integerStrings[2].startsWith("D")) 
                            {
                                azmanx = 3;
                                azmany = 10;
                                azmanbool=true;
                                
                            } 
                           
                        }
                    }
                    else if (integerStrings[1].startsWith("Gargamel"))
                    {
                    	if (integerStrings.length>=3) 
                        {
                            if (integerStrings[2].startsWith("A")) 
                            {
                                gargamelx = 3;
                                gargamely = 0;
                                gargamelbool=true;
                            } 
                            else if (integerStrings[2].startsWith("B")) 
                            {
                                gargamelx = 10;
                                gargamely = 0;
                                gargamelbool=true;
                            } 
                            else if (integerStrings[2].startsWith("C")) 
                            {
                                gargamelx = 0;
                                gargamely = 5;
                                gargamelbool=true;
                            } 
                            else if (integerStrings[2].startsWith("D")) 
                            {
                                gargamelx = 3;
                                gargamely = 10;
                                gargamelbool=true;
                            } 
                           
                        }
		
	}
	      
                }
                    else
                    {
                        String[] integerStrings = line.split("\\s+");
                        for (int j = 0; j < integerStrings.length; j++)
                        {
                            Map[i][j] = Integer.parseInt(integerStrings[j]);
                        }
                        i++;
                    }
                }
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
	}
   public int[][] getMap()
   {
	   return Map;
   }
   
   public void setMap(int[][] map) 
   {
	   Map=map;
	   
   }
   
   public Map(int[][] map)
   {
	   super();
	   Map=map;
	   
   }
public int getAzmanx() {
	return azmanx;
}
public void setAzmanx(int azmanx) {
	this.azmanx = azmanx;
}
public int getAzmany() {
	return azmany;
}
public void setAzmany(int azmany) {
	this.azmany = azmany;
}
public int getGargamelx() {
	return gargamelx;
}
public void setGargamelx(int gargamelx) {
	this.gargamelx = gargamelx;
}
public int getGargamely() {
	return gargamely;
}
public void setGargamely(int gargamely) {
	this.gargamely = gargamely;
}
public boolean isAzmanbool() {
	return azmanbool;
}
public void setAzmanbool(boolean azmanbool) {
	this.azmanbool = azmanbool;
}
public boolean isGargamelbool() {
	return gargamelbool;
}
public void setGargamelbool(boolean gargamelbool) {
	this.gargamelbool = gargamelbool;
}

   
 }