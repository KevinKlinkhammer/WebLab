package ch.hslu.ad.sw05;

import java.awt.BorderLayout;
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
            jp.setLayout(new BorderLayout());
	    frame.setContentPane(jp);
            
	    frame.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    Ball ball = new Ball(e.getX(), e.getY(), 5);
                    jp.add(ball);
                    
                    jp.revalidate();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }
            });
	}
}