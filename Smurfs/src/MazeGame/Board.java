


package MazeGame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener 
{
	private Timer timer;
	
	private Map m;
	
	private Player player;
	
	private JButton tembel;
	private JButton gozluklu;
	
	private KarakterEkrani karakterEkrani;
	public Board() {
		
		Image gozluklubutton;
		gozluklubutton = new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\gozluklu_sirin.png").getImage();

		
		tembel = new JButton("",new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\tembel_sirin2.png"));
		gozluklu = new JButton("",new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\gozluklu_sirin.png"));
		
		

		tembel.setBounds(25, 175, 89, 23);
		gozluklu.setBounds(256, 175, 89, 23);
		add(tembel);
		add(gozluklu);
		
		tembel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tembel.setVisible(false);
			    gozluklu.setVisible(false);
				m = new Map();
			    player = new TembelSirin(6, 5, 0, "Tembel", " ", 0);
			
				
			}
		});
	
		gozluklu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gozluklu.setVisible(false);
				tembel.setVisible(false);
				m = new Map();
				player = new GozlukluSirin(6, 5, 0, "Gozluklu", " ", 0);
			
				
			}
		});
		
		
		
		
		
		

		addKeyListener(new Al());
		setFocusable(true);

		
		timer=new Timer(25,this);
		timer.start();
		
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
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
		g.drawImage(player.getPlayer1(),player.getTileX()*32,player.getTileY()*32,32,32,null);
		
	}
	
	
	
	
	public Map getMap() 
	{
		return m;
	}
  
	
	public class Al extends KeyAdapter
	{
		
	public void keyPressed(KeyEvent e) 
	{
		
		int tus = e.getKeyCode();
		
		if (tus == KeyEvent.VK_UP) {
			
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY()-2,player.getTileX()))!=0)&&((m.getMap(player.getTileY()-1,player.getTileX()))!=0)) {
					player.move(0, -1);
			}
				
			}
			else {
				if((m.getMap(player.getTileY()-1,player.getTileX()))!=0) {
					player.move(0, -1);
				}
			}
		}
		
		if (tus == KeyEvent.VK_DOWN) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY()+2,player.getTileX()))!=0)&&((m.getMap(player.getTileY()+1,player.getTileX()))!=0)) {
					player.move(0, +1);
			}
				
			}
			else {
				if((m.getMap(player.getTileY()+1,player.getTileX()))!=0) {
					player.move(0, +1);
				}
			}
		}

		if (tus == KeyEvent.VK_LEFT) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY(),player.getTileX()-2))!=0)&&((m.getMap(player.getTileY(),player.getTileX()-1))!=0)) {
					player.move(-1, 0);
			}
				
			}
			else {
				if((m.getMap(player.getTileY(),player.getTileX()-1))!=0) {
					player.move(-1, 0);
				}
			}
        }

		if (tus == KeyEvent.VK_RIGHT) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY(),player.getTileX()+2))!=0)&&((m.getMap(player.getTileY(),player.getTileX()+1))!=0)) {
					player.move(+1, 0);
			}
				
			}
			else {
				if((m.getMap(player.getTileY(),player.getTileX()+1))!=0) {
					player.move(+1, 0);
				}
			}
		}
		
		
		
		
		}
	public void keyRelased(KeyEvent e) {
			
		}
	public void keyTyped(KeyEvent e) {
	
}
	}
	
	
}