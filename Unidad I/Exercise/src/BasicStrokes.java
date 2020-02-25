import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicStrokes extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        
		Graphics2D g2d = (Graphics2D)g;
        
        float [] dash1 = {2f, 0f, 2f};
        float [] dash2 = {1f, 1f, 1f};
        float [] dash3 = {4f, 0f, 2f};
        float [] dash4 = {5f, 4f, 1f};
        
        
        g2d.setColor(new Color(255,0,0));
        g2d.drawLine(20,40,250,40);
       
        
        BasicStroke bs1 = new BasicStroke(5,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,1.0f,dash1,2f);
        BasicStroke bs2 = new BasicStroke(5,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,1.0f,dash2,2f);
        BasicStroke bs3 = new BasicStroke(5,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,1.0f,dash3,2f);
        BasicStroke bs4 = new BasicStroke(5,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,1.0f,dash4,2f);
        
        g2d.setColor(new Color(0,255,0));
        g2d.setStroke(bs1);
        g2d.drawLine(20,80,250,80);
        
        g2d.setColor(new Color(255,0,255));
        g2d.setStroke(bs2);
        g2d.drawLine(20,120,250,120);
        
        g2d.setColor(new Color(0,0,255));
        g2d.setStroke(bs3);
        g2d.drawLine(20,160,250,160);
        
        g2d.setColor(new Color(0,255,255));
        g2d.setStroke(bs4);
        g2d.drawLine(20,200,250,200);
    }
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("BasicStrokes");
		BasicStrokes bs = new BasicStrokes();
		bs.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(280, 270);
		frame.setLocationRelativeTo(null);
		frame.add(bs);
		frame.setVisible(true);
	}
}



