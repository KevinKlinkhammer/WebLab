package ch.hslu.ad.sw05;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class NR4 {

	public static void main(String[] args) {
		KreiseView frame=new KreiseView();
	    frame.setTitle("Word Cloud");
	    frame.setSize(1000, 620);
	    frame.setResizable(false);
	    frame.setLocation(50, 50);
	    frame.setVisible(true);
	    frame.setLayout(new java.awt.FlowLayout());
	    frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    
	    JPanel jp = new JPanel();
	    jp.setBackground(new java.awt.Color(200, 200, 200));
	    //jp.setSize(1000, 620);
	    frame.setContentPane(jp);
	    
	    frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            	System.out.println(e.getX()+" "+e.getY());
            	
            	//Ball redBall = new Ball(e.getX(),e.getY(),100,100,Color.red, jp);
            	frame.setContentPane(jp);
                
                Thread redBall = new Thread(new Ball(e.getX(),e.getY(),100,100,Color.red, jp),"Ball1");
                redBall.start();
                //frame.setContentPane(jp);
                
                //frame.validate();
                //frame.repaint();
                //jp.revalidate();
                //jp.repaint();
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //System.out.println("Mouse released");
            }
        });

	}

}
