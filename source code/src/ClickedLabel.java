import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickedLabel {
	int i;
	
	public ClickedLabel(int i) {
		this.i = i;
		
		Attribute.tf[0].setText(CreateTree.all.get(i).text);
		Attribute.tf[1].setText(Integer.toString(CreateTree.all.get(i).x));
        Attribute.tf[2].setText(Integer.toString(CreateTree.all.get(i).y));
        Attribute.tf[3].setText(Integer.toString(CreateTree.all.get(i).w));
        Attribute.tf[4].setText(Integer.toString(CreateTree.all.get(i).h));
        int rgb = CreateTree.all.get(i).color.getRGB();
        Attribute.tf[5].setText(Integer.toString(rgb));
        
	}

}