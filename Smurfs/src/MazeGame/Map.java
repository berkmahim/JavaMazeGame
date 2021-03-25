
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
	
	
	public Map() 
	{
	  grass=new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\grass.png").getImage();
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
		//System.out.print(index);
		return index;
		
	}
	
	
		
	
	public void readFile() 
	{
		try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\berkm\\git\\repository\\Smurfs\\src\\MazeGame\\Map.txt"));
            int i=0;

            int x=0,y=0;

            for(String line ; (line = br.readLine()) != null; )
            {
                if(line.startsWith("K"))
                {
                    String[] integerStrings = line.split(":");
                    if (integerStrings.length>=3) 
                    {
                        if (integerStrings[2].startsWith("A")) 
                        {
                            x = 0;
                            y = 5;
                        } 
                        else if (integerStrings[2].startsWith("B")) 
                        {
                            x = 4;
                            y = 0;
                        } 
                        else if (integerStrings[2].startsWith("C")) 
                        {
                            x = 12;
                            y = 0;
                        } 
                        else if (integerStrings[2].startsWith("D")) 
                        {
                            x = 13;
                            y = 5;
                        } 
                       
                    }
                  
                    if (integerStrings[1].startsWith("Azman"))
                    {
                        
                    }
                    else if (integerStrings[1].startsWith("Gargamel"))
                    {
                        
		
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
   
 }