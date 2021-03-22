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
	
	//private Player player;
	public Board() {
		m = new Map();
	//	player = new Player(); 
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
		/*g.drawImage(player.getPlayer(),player.getX(),player.getY(),null);*/
		
	}
	
	
	
	
	public Map getMap() 
	{
		return m;
	}
  
	
	/*public class Al extends KeyAdapter{
		
	public void keyPressed(KeyEvent e) {
		
		int tus = e.getKeyCode();
		
		if (tus == KeyEvent.VK_W) {
			player.move(0, -32, 0, -1);
		}
		
		if (tus == KeyEvent.VK_S) {
			player.move(0, 32, 0, 1);
		}

		if (tus == KeyEvent.VK_A) {
			player.move(-32, 0, -1, 0);
        }

		if (tus == KeyEvent.VK_D) {
			player.move(32, 0, 32, 0);
		}
		
		
		
		
		}
	public void keyRelased(KeyEvent e) {
			
		}
	public void keyTyped(KeyEvent e) {
	
}
	}*/
	
	
}