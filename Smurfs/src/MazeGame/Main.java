

package MazeGame;

import java.awt.Component;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        JFrame f = new JFrame();
        f.setTitle("SMURF GAME");
        f.add(new Board());
        f.setSize(540, 400);
        f.setLocationRelativeTo((Component)null);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        
      
        
       
        
    }
}
