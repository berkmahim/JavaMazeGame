
package MazeGame;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Map {
    private Scanner m;
    private int[][] Map = new int[11][13];
    private Image grass;
    private Image wall;

    public Map() {
        this.grass = (new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\grass.png")).getImage();
        this.wall = (new ImageIcon("C:\\Users\\berkm\\git\\repository\\Smurfs\\Images\\wall.png")).getImage();
        this.readFile();
    }

    public Image getGrass() {
        return this.grass;
    }

    public Image getWall() {
        return this.wall;
    }

    public int getMap(int x, int y) {
        int index = this.Map[x][y];
        return index;
    }

    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\berkm\\git\\repository\\Smurfs\\src\\MazeGame\\Map.txt"));
            int i = 0;
            boolean x = false;
            boolean var4 = false;

            while(true) {
                String line;
                while((line = br.readLine()) != null) {
                    String[] integerStrings;
                    if (line.startsWith("K")) {
                        integerStrings = line.split(":");
                        if (integerStrings.length >= 3) {
                            if (integerStrings[2].startsWith("A")) {
                                x = false;
                                var4 = true;
                            } else if (integerStrings[2].startsWith("B")) {
                                x = true;
                                var4 = false;
                            } else if (integerStrings[2].startsWith("C")) {
                                x = true;
                                var4 = false;
                            } else if (integerStrings[2].startsWith("D")) {
                                x = true;
                                var4 = true;
                            }
                        }

                        if (!integerStrings[1].startsWith("Azman")) {
                            integerStrings[1].startsWith("Gargamel");
                        }
                    } else {
                        integerStrings = line.split("\\s+");

                        for(int j = 0; j < integerStrings.length; ++j) {
                            this.Map[i][j] = Integer.parseInt(integerStrings[j]);
                        }

                        ++i;
                    }
                }

                return;
            }
        } catch (FileNotFoundException var8) {
            var8.printStackTrace();
        } catch (IOException var9) {
            var9.printStackTrace();
        }

    }

    public int[][] getMap() {
        return this.Map;
    }

    public void setMap(int[][] map) {
        this.Map = map;
    }

    public Map(int[][] map) {
        this.Map = map;
    }
}
