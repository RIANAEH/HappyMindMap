import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar {
	
	public static JToolBar toolBar = new JToolBar();
	
	public ToolBar() {
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new NewActionListener());
		toolBar.add(btnNew);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new OpenActionListener());
		toolBar.add(btnOpen);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new SaveActionListener());
		toolBar.add(btnSave);
		
		JButton btnSaveAs = new JButton("Save As ...");
		btnSaveAs.addActionListener(new SaveAsActionListener());
		toolBar.add(btnSaveAs);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ExitActionListener());
		toolBar.add(btnExit);
		
		toolBar.addSeparator();
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CreateTree();
				
			}
		});
		toolBar.add(btnApply);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ChangeActionListener());
		toolBar.add(btnChange);
		
	}

}
