import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Menu {
	
	public static JMenuBar menuBar = new JMenuBar();
	
	public Menu() {
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new NewActionListener());
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new OpenActionListener());
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new SaveActionListener());
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As ...");
		mntmSaveAs.addActionListener(new SaveActionListener());
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ExitActionListener()); 
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmApply = new JMenuItem("Apply");
		mntmApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CreateTree();
				
			}
		});
		mnEdit.add(mntmApply);
		
		JMenuItem mntmChange = new JMenuItem("Change");
		mntmChange.addActionListener(new ChangeActionListener());
		mntmChange.setHorizontalAlignment(SwingConstants.LEFT);
		mnEdit.add(mntmChange);
		
	}

}
