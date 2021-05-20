import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;


class MyMouseAdapter extends MouseAdapter {
	private Point initialLoc;
    private Point initialLocOnScreen; 
    private int t;
    private Color c;
 
        public void mousePressed(MouseEvent e) {
        	Component comp = (Component) e.getSource();
            initialLoc = comp.getLocation();
            initialLocOnScreen = e.getLocationOnScreen();
            
            for(int i = 0; i < CreateTree.line.length; i++) {
            	if(CreateTree.all.get(i).x == comp.getX() && CreateTree.all.get(i).y == comp.getY()) {
            		t = i;
            		break;
            	}
            	else continue;
            }
            
            c = CreateTree.all.get(t).color;
            CreateTree.all.get(t).label.setBackground(Color.RED);
            
        }
 
        public void mouseReleased(MouseEvent e)
        {
        	Component comp = (Component) e.getSource();
            Point locOnScreen = e.getLocationOnScreen();

            int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
            int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
            comp.setLocation(x, y);
            CreateTree.all.get(t).x = x; CreateTree.all.get(t).y = y;
            new ClickedLabel(t);
            
            CreateTree.all.get(t).label.setBackground(c);
            
            MindMap.panel.repaint();
        }
 
        public void mouseDragged(MouseEvent e)
        {
        	Component comp = (Component) e.getSource();
            Point locOnScreen = e.getLocationOnScreen();

            int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
            int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
            comp.setLocation(x, y);
            CreateTree.all.get(t).x = x; CreateTree.all.get(t).y = y;
            new ClickedLabel(t);
            
            CreateTree.all.get(t).label.setBackground(Color.RED);
            
            MindMap.panel.repaint();
        }
    }

