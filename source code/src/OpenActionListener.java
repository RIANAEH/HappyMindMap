import java.awt.event.ActionListener;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OpenActionListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
      JFileChooser jfc=new JFileChooser();
      jfc.setDialogTitle("¿­±â");
      jfc.setFileFilter(new FileTypeFilter(".txt", "Data File"));
      int result=jfc.showOpenDialog(null);
      if (result==JFileChooser.APPROVE_OPTION) {
         String content=TextEditor.textArea.getText();
         File fi=jfc.getSelectedFile();
         try {
            File file=jfc.getSelectedFile();
            BufferedReader br=new BufferedReader(new FileReader(file.getPath()));
            String s="";
            int k = 0;
            while ((s=br.readLine())!=null) {
               TextEditor.textArea.append(s);
               TextEditor.textArea.append("\n");
               
            }
            if(br!=null) 
               br.close();
         } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, e2.getMessage());
         }
      } 
   }
   
}