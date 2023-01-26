import javax.swing.*;
public class Myednotepad {
    public static void main(String[] args){
        JFrame f = new JFrame("Note.txt");

        JMenu File, Edit, Format;

        JMenuBar mb = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Format = new JMenu("Format");

        JMenuItem i1, i2, i3, i4, i5;

        i1 = new JMenuItem("Save");
        i2 = new JMenuItem("New Folder");
        i3 = new JMenuItem("Open");
        i4 = new JMenuItem("Print");
        i5 = new JMenuItem("Exit");

        JMenuItem i6, i7, i8, i9;
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("copy");
        i8 = new JMenuItem("delete");
        i9 = new JMenuItem("word wrap");

        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(0, 0, 400, 400);
        


       File.add(i1); File.add(i2); File.add(i3); File.add(i4); File.add(i5);
       Edit.add(i6); Edit.add(i7); 
       Format.add(i8); Format.add(i9);
       Edit.add(Format);

       f.add(messageArea);
       mb.add(File);
       mb.add(Edit);
       f.setJMenuBar(mb);
       f.setSize(400, 400);
       f.setLayout(null);
       f.setVisible(true);

    }

}
