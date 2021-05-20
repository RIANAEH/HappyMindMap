import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Frame() {
		setTitle("HappyMindMapbyHaeKey");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		
		Menu cm = new Menu();
		setJMenuBar(cm.menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ToolBar toolBar = new ToolBar();
		contentPane.add(toolBar.toolBar, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerLocation(230);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerLocation(480);
		splitPane.setRightComponent(splitPane_1);
		
		TextEditor panel = new TextEditor();
		splitPane.setLeftComponent(panel);
		
		Attribute panel_1 = new Attribute();
		splitPane_1.setRightComponent(panel_1);
		
		MindMap mmp = new MindMap();
		splitPane_1.setLeftComponent(mmp);
	}

}
