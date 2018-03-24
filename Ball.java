package ch.hslu.ad.sw05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball implements Runnable
{

	private Color ballFillColor;
    private Color ballBorderColor;
     
    private int ballX = 0;
    private int ballY = 0;
    private int ballWidth = 0;
    private int ballHeight = 0;
     
    public boolean fillBall = true;
    
    JPanel jp = null;
    
    Ball(int ballX, int ballY, int ballWidth, int ballHeight, Color ballBorderColor, JPanel jp){ //Constructor
        this.ballFillColor=ballBorderColor;
        this.ballBorderColor=ballBorderColor;
        this.ballWidth=ballWidth;
        this.ballHeight=ballHeight;
        this.ballX=ballX;
        this.ballY=ballY;
        this.jp=jp;
    }
	
    //public void drawBall(JPanel jp) 
    //{
    //    jp.add(new MyComponent());
    //}
    
	private class MyComponent extends JComponent{
		@Override
        public void paintComponent(Graphics g){
			super.paintComponent(g);
			//g.setPaintMode();
            System.out.println(ballFillColor+"test");
            if (fillBall) //Fill first, and then draw outline.
            {
                g.setColor(ballFillColor);
                g.fillOval(ballX,ballY, ballHeight,ballWidth);
            }
            
            g.setColor(ballFillColor);
            g.drawOval(ballX,ballY, ballHeight,ballWidth);
            System.out.println("?");
            
            jp.revalidate();
        }
    }

	@Override
	public void run() 
	{
		jp.add(new MyComponent());
		//jp.revalidate();
		//jp.repaint();
	}
}
