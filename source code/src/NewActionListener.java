import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		MindMap.panel.removeAll();
		CreateTree.all.clear();
		CreateTree.node.clear();
		CreateTree.level.clear();
		MindMap.panel.validate();
		MindMap.panel.repaint();
		
		
        TextEditor.textArea.setText(null);
        
        for(int i = 1; i<= 6; i++) {
			
			Attribute.tf[i-1].setText(null);
		
		}
		
	}
}