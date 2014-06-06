/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Amila
 */
public class MyShape extends JPanel {

    int x[];
    int y[];
    
    public MyShape(int x[], int y[]){
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        this.setBackground(Color.WHITE);
        this.setOpaque(false);


        g.setColor(Color.red);
        g.drawPolygon(x, y, 36);

    }

}
