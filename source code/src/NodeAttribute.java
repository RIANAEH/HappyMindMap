import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class NodeAttribute extends JPanel{
	public final String text;
	public int x;
	public int y;
	public int w;
	public int h;
	public int tab;
	public Color color;
	public JLabel label;
	public int pw, ph;
	int i;
	public int n;
	
	public NodeAttribute(String text, int tab, int i) {
		this.text = text;
		this.tab = tab;
		this.i= i;
		pw = MindMap.panel.getWidth(); //476
		ph = MindMap.panel.getHeight(); //368
		w = 50;
		h = 30;
		
		x = pw / 2 - w / 2;
		//y = ph / 2 - h / 2;
		y = tab * 100;
		
		color = new Color(255-tab*50, 200, tab*50); 
		label = new JLabel(this.text);
		label.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mousePressed(MouseEvent e) {
	            new ClickedLabel(i);
	         }
	      });

		
		MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
		label.addMouseListener(myMouseAdapter);
		label.addMouseMotionListener(myMouseAdapter);
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBackground(color);
		label.setSize(w,h);
		label.setLocation(x,y);
		MindMap.panel.add(label);
		
        MindMap.panel.repaint();
		
	}
	
	
	void setLlocation(Node node) {
		
		x = (476 / (CreateTree.level.get(tab)+1)) * n;
		y = 80 * tab;
		label.setLocation(x, y);
		
	}
	   
	   
}