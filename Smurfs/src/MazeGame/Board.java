package MazeGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener 
{
	private Timer timer;
	
	private Map m;
	
	public Board() {
		m=new Map();
		
		timer=new Timer(25,this);
		timer.start();
		setFocusable(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		repaint();
	}
	public void paint(Graphics g) 
	{
		super.paint(g);
		for(int x=0; x<11 ;x++) 
		{
			for(int y=0; y<13; y++)
			{
				if(m.getMap(x,y)==0) 
				{
					g.drawImage(m.getWall(),y*32,x*32,null);
					
				}
				else if(m.getMap(x,y)==1) 
				{
				g.drawImage(m.getGrass(),y*32,x*32,null);
				
				}
				
			}
			
		}
		
		
	}
	public Map getMap() 
	{
		return m;
	}
    
}