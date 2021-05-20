import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CreateTree {
	public static ArrayList<NodeAttribute> all = new ArrayList<NodeAttribute>();
	public static ArrayList<Integer> level = new ArrayList<Integer>();
	public static ArrayList<Node> node = new ArrayList<Node>();
	public static String[] line;
	public static int check = 0;
	public static int height = 0;
		
	public CreateTree() {
		
		try {
			String text = TextEditor.textArea.getText();
			line = text.split("\n");
			
			for(int i = 0; i < line.length; i++) level.add(0);
        
			for(int i = 0; i < line.length; i++) {
				int tab = 0;
           
				while(line[i].charAt(tab) == '\t') {
					tab++;
				}
				
				level.add(tab, level.get(tab)+1);
           
				line[i] = line[i].substring(tab);
          
				all.add(new NodeAttribute(line[i], tab, i));
				node.add(new Node(all.get(i)));
				all.get(i).n = level.get(tab);
           
        
				if(i >= 1) {
        	   
					int j = 1;
					while(true) {
						if (all.get(i).tab > all.get(i-j).tab) {
							node.get(i-j).addChild(node.get(i));
							break;
						}
						else if (all.get(i).tab == all.get(i-j).tab) {
							node.get(i-j).getParent().addChild(node.get(i)); 
							break;
						}
						else {
							j++;
							continue;
						}
					}
                    
					
				}
				
								           
			}
			
			for(int i = 0; i < line.length; i++) all.get(i).setLlocation(node.get(i));
        
			check = 1;
        
		} catch(StringIndexOutOfBoundsException k) {
			JOptionPane.showMessageDialog(null, "Please type anything in the TextEditor");
		}
		
        
        
	}
}
