import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class MindMap extends JPanel {
	
	public static Surface panel;

   public MindMap() {
      setLayout(new BorderLayout(0, 0));
      
      JLabel lblMindmap = new JLabel("MindMap");
      lblMindmap.setHorizontalAlignment(SwingConstants.CENTER);
      add(lblMindmap, BorderLayout.NORTH);
      
      JScrollPane scrollPane = new JScrollPane();
      add(scrollPane, BorderLayout.CENTER);
      
      panel = new Surface();
      scrollPane.setViewportView(panel);
      
   }

}

