import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SaveActionListener implements ActionListener{
   
   public void actionPerformed(ActionEvent e) {
      JFileChooser jfc=new JFileChooser(new File("c:\\"));
      jfc.setDialogTitle("파일 저장");
      jfc.setFileFilter(new FileTypeFilter(".txt", "Data File"));
      int result=jfc.showSaveDialog(null);
      if (result==JFileChooser.APPROVE_OPTION) {
         File fi=jfc.getSelectedFile();
         try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fi+".txt"));
            String text = TextEditor.textArea.getText();
              String[] line = text.split("\n");
            for (int i=0; i<line.length; i++) {
               writer.write(line[i]);
               writer.write("\r\n");
            }
            writer.close();
         } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, e2.getMessage());
         }
      } 
   }
}