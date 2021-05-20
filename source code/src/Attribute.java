import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Attribute extends JPanel {
	public static JTextField[] tf;

	public Attribute() {
		
		setLayout(new BorderLayout());
		
		JLabel[] lb = new JLabel[7];
		String[] lbname = {"Attribute", "TEXT:", "X:     ", "Y:     ", "W:     ", "H:     ", "Color:"};
		
		tf = new JTextField[6];
		lb[0] = new JLabel(lbname[0]);
		lb[0].setHorizontalAlignment(SwingConstants.CENTER);
		add(lb[0], BorderLayout.NORTH);
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(6,0));
		add(center, BorderLayout.CENTER);
		JPanel[] jp = new JPanel[6];
		for(int i = 1; i<= 6; i++) {
			jp[i-1] = new JPanel();
			center.add(jp[i-1]);
			lb[i] = new JLabel(lbname[i]);
			tf[i-1] = new JTextField(15);
			jp[i-1].add(lb[i]); 
			jp[i-1].add(tf[i-1]);
		}
		JButton bt = new JButton("Change");
		bt.addActionListener(new ChangeActionListener());
		add(bt, BorderLayout.SOUTH);	

	}

}
