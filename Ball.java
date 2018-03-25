package ch.hslu.ad.sw05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JComponent;

public class Ball extends JComponent {
    private static final long serialVersionUID = 1L;
    
    public Ball(int x, int y, int diameter) {
        super();
        this.setLocation(x, y);
        this.setSize(diameter, diameter);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(0, 0, 100, 100);
    }
}