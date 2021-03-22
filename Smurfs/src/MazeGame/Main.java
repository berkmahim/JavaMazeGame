package MazeGame;

import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args) 
	{
         new Main();
		
	}
	public Main() 
	{
		
		
		JFrame f=new JFrame();
		f.setTitle("SMURF GAME");
		f.add(new Board());
		f.setSize(435,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}