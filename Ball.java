package ch.hslu.ad.sw05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JComponent;

/**
 * 
 * @author binerdy
 */
public class Ball {
    private int x;
    private int y;
    private int size;

    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
}