import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

public class Myednotepad {
    public static void main(String[] args) {
        JFrame f = new JFrame("JavaNotepad");

        // create textarea
        JTextArea messageArea = new JTextArea();

        JMenu FileMenu, Edit, Format;

        JMenuBar mb = new JMenuBar();
        FileMenu = new JMenu("Menu");
        Edit = new JMenu("Edit");
        Format = new JMenu("Format");

        JMenuItem save, i2, i3, i4, i5, ia, paste, copy, i8, i9, cut;

        copy = new JMenuItem(new AbstractAction("Copy") {
            // when copy menu is click perform the action in the following method
            public void actionPerformed(ActionEvent e) {
                // copy text in the message area
                messageArea.copy();
            }
        });
        paste = new JMenuItem(new AbstractAction("Paste") {
            // when paste menu is click perform the action in the following method
            public void actionPerformed(ActionEvent e) {
                // paste text in the message area
                messageArea.paste();
            }
        });

        cut = new JMenuItem(new AbstractAction("cut") {
            // when cut menu is click perform the action in the following method
            public void actionPerformed(ActionEvent e) {
                // cut text in the message area
                messageArea.cut();
                System.out.println("go and work");
            }
        });

        save = new JMenuItem("Save");
        ia = new JMenuItem("Save As");
        i2 = new JMenuItem("New Folder");
        i3 = new JMenuItem("Open");
        i4 = new JMenuItem("Print");
        i5 = new JMenuItem("Exit");
        i8 = new JMenuItem("delete");
        i9 = new JMenuItem("word wrap");
        cut = new JMenuItem("cut");

        messageArea.setBounds(0, 0, 400, 400);
        FileMenu.add(save);
        FileMenu.add(ia);
        FileMenu.add(i2);
        FileMenu.add(i3);
        FileMenu.add(i4);
        FileMenu.add(i5);
        Edit.add(copy);
        Edit.add(paste);
        Format.add(i8);
        Format.add(i9);
        Format.add(cut);
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
