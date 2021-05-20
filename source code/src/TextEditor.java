import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextEditor extends JPanel {
	public static JTextArea textArea;
	
	public TextEditor() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTextEditor = new JLabel("Text Editor");
		lblTextEditor.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTextEditor, BorderLayout.NORTH);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CreateTree();
				
			}
		});
		add(btnApply, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea("", 20, 20);
		scrollPane.setViewportView(textArea);

	}

}
