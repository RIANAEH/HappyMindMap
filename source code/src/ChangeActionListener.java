import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ChangeActionListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		int i;
		
		try {
			
			for(i = 0; i < CreateTree.line.length; i++) {
				if(CreateTree.all.get(i).text.equals(Attribute.tf[0].getText())) {
					break;
				}
         	else continue;	
            }
			
			CreateTree.all.get(i).x = Integer.parseInt(Attribute.tf[1].getText());
			CreateTree.all.get(i).y = Integer.parseInt(Attribute.tf[2].getText());
			CreateTree.all.get(i).w = Integer.parseInt(Attribute.tf[3].getText());
			CreateTree.all.get(i).h = Integer.parseInt(Attribute.tf[4].getText());
			CreateTree.all.get(i).color = new Color(Integer.parseInt(Attribute.tf[5].getText()));
		 
			CreateTree.all.get(i).label.setBackground(CreateTree.all.get(i).color);
			CreateTree.all.get(i).label.setBounds(CreateTree.all.get(i).x, CreateTree.all.get(i).y, CreateTree.all.get(i).w, CreateTree.all.get(i).h); 
		
			
			} catch (NullPointerException k){
				JOptionPane.showMessageDialog(null, "There is no \""+Attribute.tf[0].getText()+"\"");
			}
			 
		 
	}

}
