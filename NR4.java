package ch.hslu.ad.sw05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class NR4 {

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        JFrame frame=new JFrame();
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                balls.forEach(ball -> {
                    g.setColor(Color.red);
                    int offset = ball.getSize() / 2;
                    g.drawOval(ball.getX() - offset, ball.getY() - 2 * ball.getSize(), ball.getSize(), ball.getSize());
                });
            };
        };
        jp.setBackground(new java.awt.Color(200, 200, 200));
        jp.setLayout(new BorderLayout());
        frame.setContentPane(jp);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                balls.add(new Ball(e.getX(), e.getY(), 20));
                jp.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
        });
    }
}