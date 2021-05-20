import java.util.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.geom.Line2D;

import javax.swing.*;
 
public class Surface extends JPanel {
	
	public static Graphics2D g2;
    public static Line2D.Double dl;
 
    public void paintComponent(Graphics g){
         
        super.paintComponent(g);
        setLayout(null);
         
        if(CreateTree.check == 1) {
        	
                g2 = (Graphics2D)g;
                
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                
                for(int i = 1; i < CreateTree.node.size(); i++) {
            		JLabel label1 = CreateTree.node.get(i).getData().label;
            		JLabel label2 = CreateTree.node.get(i).getParent().getData().label;
            		
            		Point point1 = label1.getLocation();
            		Point point2 = label2.getLocation();
            		
            		
            		dl = new Line2D.Double(point1.x + label1.getWidth() / 2 , point1.y + label1.getHeight() / 2 , point2.x + label2.getWidth() / 2 , point2.y  +  label2.getHeight() / 2);
            		g2.draw(dl);
            		
            	}
            }
        	
        	MindMap.panel.revalidate();
            MindMap.panel.repaint();          
            
        }
            

}