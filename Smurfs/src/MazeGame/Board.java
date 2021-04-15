


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
import java.util.Arrays;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;





public class Board extends JPanel implements ActionListener 
{
	private Timer timer;
	
	private Map m;
	
	private Player player;
	private Azman azman;
	private Gargamel gargamel;
	private JButton tembel;
	private JButton gozluklu;
	private Altin altin1;
	private Altin altin2;
	private Altin altin3;
	private Altin altin4;
	private Altin altin5;
	private int[] xkordinats;
	private int[] ykordinats;
	private Mantar mantar;
	private GameOver gameOver;
	
 	//private Puan puan;
	
	private KarakterEkrani karakterEkrani;
	public Board() {
		
		
		gameOver = new GameOver();
		altin1 = new Altin();
		altin2 = new Altin();
		altin3 = new Altin();
		altin4 = new Altin();
		altin5 = new Altin();
		mantar = new Mantar();
		xkordinats = new int [73];
		ykordinats = new int [73];

		 Integer[] arr1 = new Integer[73];
		    for (int i = 0; i < 73; i++) {
		        arr1[i] = i;
		    }
		    Collections.shuffle(Arrays.asList(arr1));	
		    kordinatDagit();
		    
		    
		    
		    
		Image gozluklubutton;
		gozluklubutton = new ImageIcon("C:\\Users\\mehmet\\eclipse-workspace\\JavaMazeGame-master\\deneme\\pictures\\gozluklu_sirin.png").getImage();

		
		tembel = new JButton("",new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\tembel_sirin.png"));
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
			    player = new TembelSirin(6, 5, 0, "Tembel", " ", 20);
			    azman =new Azman(m.azmanx,m.azmany , 1, "azman", "dusman");
			    gargamel= new Gargamel(m.gargamelx, m.gargamely, 2, "gargamel", "dusman");
			    altin1.setTileX(xkordinats[arr1[0]]);
			    altin1.setTileY(ykordinats[arr1[0]]);
			    altin2.setTileX(xkordinats[arr1[1]]);
			    altin2.setTileY(ykordinats[arr1[1]]);
			    altin3.setTileX(xkordinats[arr1[2]]);
			    altin3.setTileY(ykordinats[arr1[2]]);
			    altin4.setTileX(xkordinats[arr1[3]]);
			    altin4.setTileY(ykordinats[arr1[3]]);
			    altin5.setTileX(xkordinats[arr1[4]]);
			    altin5.setTileY(ykordinats[arr1[4]]);
			    mantar.setTileX(xkordinats[arr1[5]]);
			    mantar.setTileY(ykordinats[arr1[5]]);
			    gameOver.setTileX(1000);
			    gameOver.setTileY(1000);
			    
			}
		});
	
		gozluklu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gozluklu.setVisible(false);
				tembel.setVisible(false);
				m = new Map();
				player = new GozlukluSirin(6, 5, 0, "Gozluklu", " ", 20);
				azman =new Azman(m.azmanx,m.azmany , 1, "azman", "dusman");
				gargamel= new Gargamel(m.gargamelx, m.gargamely, 2, "gargamel", "dusman");
				altin1.setTileX(xkordinats[arr1[0]]);
			    altin1.setTileY(ykordinats[arr1[0]]);
			    altin2.setTileX(xkordinats[arr1[1]]);
			    altin2.setTileY(ykordinats[arr1[1]]);
			    altin3.setTileX(xkordinats[arr1[2]]);
			    altin3.setTileY(ykordinats[arr1[2]]);
			    altin4.setTileX(xkordinats[arr1[3]]);
			    altin4.setTileY(ykordinats[arr1[3]]);
			    altin5.setTileX(xkordinats[arr1[4]]);
			    altin5.setTileY(ykordinats[arr1[4]]);
			    mantar.setTileX(xkordinats[5]);
			    mantar.setTileY(ykordinats[5]);
			}
		});
		
		
		
		
		
		
		
		addKeyListener(new Al());
		setFocusable(true);

		
		timer=new Timer(25,this);
		timer.start();
		
		
	}
	
	public void kordinatDagit() {
		
	int[][] harita ={ {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					  {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
					  {0, 1, 0, 1, 1,	1, 1, 1, 1,	0, 0, 1, 0},
					  {0, 1, 1, 1, 1,	0, 1, 0, 1,	1, 0, 1, 0},
					  {0, 1, 0, 1, 0,	0, 1, 0, 1,	0, 0, 1, 0},
					  {0, 1, 0, 1, 1,	1, 1, 0, 1,	0, 1, 1, 0},
					  {0, 1, 0, 0, 1,	1, 1, 0, 1,	1, 1, 1, 0},
					  {0, 1, 0, 1, 1,	1, 1, 1, 1,	1, 1, 1, 0},
					  {0, 1, 0, 1, 0,	0, 0, 0, 0,	1, 1, 1, 0},
					  {0, 1, 1, 1, 1,	1, 1, 1, 1,	1, 1, 1, 0},
					  {0,	0, 0, 0, 0,	0, 0, 0, 0,	0, 0, 0, 0}
						};
	int a=0;
	for (int i = 0; i < 11; i++) {
		for (int j = 0; j < 13; j++) {
			if(harita[i][j]==1) {
				xkordinats[a]=j;
				ykordinats[a]=i;
				a++;
			}
			
		}
		
	}	
	
	
	
	
	
	
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
					g.drawImage(m.getWall(),y*32,x*32,32,32,null);
				}
				else if(m.getMap(x,y)==1) 
				{
				g.drawImage(m.getGrass(),y*32,x*32,32,32,null);
				g.setColor(Color.GRAY);
				g.fillRect(y*32, x*32, 32, 32);
				}
				for(int k=1; k<azman.mesafe;k++) {
					if(azman.yol[k][0]==x && azman.yol[k][1]==y) {
						g.setColor(Color.GREEN);
						g.fillRect(y*32, x*32, 32, 32);
					}
				}
				for(int k=1; k<gargamel.mesafe;k++) {
					if(gargamel.yol[k][0]==x && gargamel.yol[k][1]==y) {
						g.setColor(Color.BLUE);
						g.fillRect(y*32, x*32, 32, 32);
					}
				}
				
				
				
			}
			
		}
		g.drawImage(player.getPlayer1(),player.getTileX()*32,player.getTileY()*32,32,32,null);
		if(m.isAzmanbool()==true) {
			g.drawImage(azman.getPlayer1(),azman.getTileX()*32,azman.getTileY()*32,32,32,null);
		}
		
		if(m.isGargamelbool()==true) {
			g.drawImage(gargamel.getPlayer1(),gargamel.getTileX()*32,gargamel.getTileY()*32,32,32,null);
		}
		

		g.drawImage(altin1.GetAltinImage(),altin1.getTileX()*32,altin1.getTileY()*32,32,32,null);
		g.drawImage(altin2.GetAltinImage(),altin2.getTileX()*32,altin2.getTileY()*32,32,32,null);
		g.drawImage(altin3.GetAltinImage(),altin3.getTileX()*32,altin3.getTileY()*32,32,32,null);
		g.drawImage(altin4.GetAltinImage(),altin4.getTileX()*32,altin4.getTileY()*32,32,32,null);
		g.drawImage(altin5.GetAltinImage(),altin5.getTileX()*32,altin5.getTileY()*32,32,32,null);
		g.drawImage(mantar.GetMantarImage(), mantar.getTileX()*32, mantar.getTileY()*32,32,32,null);
		//String a=Stringplayer.getSkor();
		
	
		
		if(player.getSkor()<=0) {
			
			g.drawString("GAME OVER", 440, 40);
			
		}
		else {
			g.drawString("Puan", 440, 20);
			g.drawString(Integer.toString(player.getSkor()), 440, 40);
		}
		
		
		
	//	g.drawString("puan", 400, 20);
		
		


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
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
					azman.setTileX(m.azmanx);
					azman.setTileY(m.azmany);
					player.setSkor(player.getSkor()-5);
					}
					if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
						gargamel.setTileX(m.gargamelx);
						gargamel.setTileY(m.gargamely);
						player.setSkor(player.getSkor()-15);
						
						}
					if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
						player.setSkor(player.getSkor()+5);
						altin1.setTileX(600);
					}
					if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
						player.setSkor(player.getSkor()+5);
						altin2.setTileX(600);
					}
					if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
						player.setSkor(player.getSkor()+5);
						altin3.setTileX(600);
					}
					if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
						player.setSkor(player.getSkor()+5);
						altin4.setTileX(600);
					}
					if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
						player.setSkor(player.getSkor()+5);
						altin5.setTileX(600);
					}
					if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
						player.setSkor(player.getSkor()+50);
						mantar.setTileX(600);
					}
					if(player.getSkor()<=0) {
						player.setTileX(600);
						gameOver.setTileX(500);
						gameOver.setTileY(500);
					}
			}
				
			}
			else {
				if((m.getMap(player.getTileY()-1,player.getTileX()))!=0) {
					player.move(0, -1);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
						}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(6);
							gameOver.setTileY(5);
						}
						
				}
			}
		}
		
		if (tus == KeyEvent.VK_DOWN) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY()+2,player.getTileX()))!=0)&&((m.getMap(player.getTileY()+1,player.getTileX()))!=0)) {
					player.move(0, +1);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(6);
							gameOver.setTileY(5);
						}
			}
				
			}
			else {
				if((m.getMap(player.getTileY()+1,player.getTileX()))!=0) {
					player.move(0, +1);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(6);
							gameOver.setTileY(5);
						}
				}
			}
		}

		if (tus == KeyEvent.VK_LEFT) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY(),player.getTileX()-2))!=0)&&((m.getMap(player.getTileY(),player.getTileX()-1))!=0)) {
					player.move(-1, 0);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(6);
							gameOver.setTileY(5);
						}
			}
				
			}
			else {
				if((m.getMap(player.getTileY(),player.getTileX()-1))!=0) {
					player.move(-1, 0);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(500);
							gameOver.setTileY(500);
						}
				}
			}
        }

		if (tus == KeyEvent.VK_RIGHT) {
			if (player.getAd()=="Gozluklu") {
				if(((m.getMap(player.getTileY(),player.getTileX()+2))!=0)&&((m.getMap(player.getTileY(),player.getTileX()+1))!=0)) {
					player.move(+1, 0);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(500);
							gameOver.setTileY(500);
						}
			}
				
			}
			else {
				if((m.getMap(player.getTileY(),player.getTileX()+1))!=0) {
					player.move(+1, 0);
					azman.HedefBul(player.getTileY(), player.getTileX(), m);
					gargamel.HedefBul(player.getTileY(), player.getTileX(), m);
					if(player.getTileX()==azman.getTileX() && player.getTileY()==azman.getTileY()) {
						azman.setTileX(m.azmanx);
						azman.setTileY(m.azmany);
						player.setSkor(player.getSkor()-5);
					}
						if(player.getTileX()==gargamel.getTileX() && player.getTileY()==gargamel.getTileY()) {
							gargamel.setTileX(m.gargamelx);
							gargamel.setTileY(m.gargamely);
							player.setSkor(player.getSkor()-15);
						}
						if(player.getTileX()==altin1.getTileX() && player.getTileY()==altin1.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin1.setTileX(600);
						}
						if(player.getTileX()==altin2.getTileX() && player.getTileY()==altin2.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin2.setTileX(600);
						}
						if(player.getTileX()==altin3.getTileX() && player.getTileY()==altin3.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin3.setTileX(600);
						}
						if(player.getTileX()==altin4.getTileX() && player.getTileY()==altin4.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin4.setTileX(600);
						}
						if(player.getTileX()==altin5.getTileX() && player.getTileY()==altin5.getTileY()) {
							player.setSkor(player.getSkor()+5);
							altin5.setTileX(600);
						}
						if(player.getTileX()==mantar.getTileX() && player.getTileY()==mantar.getTileY()) {
							player.setSkor(player.getSkor()+50);
							mantar.setTileX(600);
						}
						if(player.getSkor()<=0) {
							player.setTileX(600);
							gameOver.setTileX(500);
							gameOver.setTileY(500);
						}
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