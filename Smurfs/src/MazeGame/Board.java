


package MazeGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    private Timer timer = new Timer(25, this);
    private Map m = new Map();
    private Player player = new Player();

    public Board() {
        this.timer.start();
        this.addKeyListener(new Board.Al());
        this.setFocusable(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        for(int x = 0; x < 11; ++x) {
            for(int y = 0; y < 13; ++y) {
                if (this.m.getMap(x, y) == 0) {
                    g.drawImage(this.m.getWall(), y * 32, x * 32, (ImageObserver)null);
                } else if (this.m.getMap(x, y) == 1) {
                    g.drawImage(this.m.getGrass(), y * 32, x * 32, (ImageObserver)null);
                }
               
            }
        }

        g.drawImage(this.player.getPlayer(), this.player.getX() * 32, this.player.getY() * 32, 32, 32, (ImageObserver)null);
     //   g.drawImage(this.player.getPlayer(), this.player.getX() * 32, this.player.getY() * 32,(ImageObserver)null);
    }

    public Map getMap() {
        return this.m;
    }

    public class Al extends KeyAdapter {
        public Al() {
        }

        public void keyPressed(KeyEvent e) {
            int tus = e.getKeyCode();
            if (tus == 38 && Board.this.m.getMap(Board.this.player.getY() - 1, Board.this.player.getX()) != 0) {
                Board.this.player.move(0, -1);
            }

            if (tus == 40 && Board.this.m.getMap(Board.this.player.getY() + 1, Board.this.player.getX()) != 0) {
                Board.this.player.move(0, 1);
            }

            if (tus == 37 && Board.this.m.getMap(Board.this.player.getY(), Board.this.player.getX() - 1) != 0) {
                Board.this.player.move(-1, 0);
            }

            if (tus == 39 && Board.this.m.getMap(Board.this.player.getY(), Board.this.player.getX() + 1) != 0) {
                Board.this.player.move(1, 0);
            }

        }

        public void keyRelased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }
    }
}
