import javax.swing.*;
public class Myednotepad {
    public static void main(String[] args){
        JFrame f = new JFrame("Note.txt");

        JMenu FileMenu, Edit, Format;

        JMenuBar mb = new JMenuBar();
        FileMenu = new JMenu("Menu");
        Edit = new JMenu("Edit");
        Format = new JMenu("Format");

        JMenuItem i1, i2, i3, i4, i5, ia;

        i1 = new JMenuItem("Save");
        ia = new JMenuItem("Save As");
        i2 = new JMenuItem("New Folder");
        i3 = new JMenuItem("Open");
        i4 = new JMenuItem("Print");
        i5 = new JMenuItem("Exit");
        

        JMenuItem i6, i7, i8, i9, ib;
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("copy");
        i8 = new JMenuItem("delete");
        i9 = new JMenuItem("word wrap");
        ib = new JMenuItem("cut");

        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(0, 0, 400, 400);
       FileMenu.add(i1); FileMenu.add(ia); FileMenu.add(i2); FileMenu.add(i3); FileMenu.add(i4); FileMenu.add(i5);
       Edit.add(i6); Edit.add(i7); 
       Format.add(i8); Format.add(i9); Format.add(ib); 
       Edit.add(Format);

       f.add(messageArea);
       mb.add(FileMenu);
       mb.add(Edit);
       f.setJMenuBar(mb);

       f.setSize(400, 400);
       f.setLayout(null);
       f.setVisible(true);

    }

}
