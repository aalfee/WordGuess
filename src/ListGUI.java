package src;
import java.awt.*;
import javax.swing.*;

public class ListGUI extends JFrame{
    public static TextArea hintTextArea = new TextArea();
    public static ListGUI initiateGUI(ListGUI GUI) throws Exception{
        GUI = new ListGUI();
        GUI.setSize(650,540);
        GUI.setLocation(300,300);
        GUI.setLayout(new GridLayout(5,1));
        GUI.setTitle("Word Guessing Game");
        GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container myContentPane = GUI.getContentPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Enter a word with no 'space' inputs");
        JTextField textField = new JTextField(8);
        JButton button1 = new JButton("Append");
        JButton button2 = new JButton("Prepend");
        JButton button3 = new JButton("Word Hint");
        JButton button4 = new JButton("Letter Hint");
        JButton button5 = new JButton("Guess");
        JButton button6 = new JButton("Change Guess Word");
        TextArea textArea = new TextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));; 
        hintTextArea.setFont(new Font("Arial", Font.PLAIN, 20));
        myContentPane.add(panel1);
        myContentPane.add(panel2);
        myContentPane.add(textArea);
        myContentPane.add(hintTextArea);
        panel1.add(label);
        panel1.add(textField);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button6);
        myContentPane.add(button5);


        AppendClickListener acl = new AppendClickListener(textField, textArea, hintTextArea);
        button1.addActionListener(acl);
        button2.addActionListener(acl);
        button3.addActionListener(acl);
        button4.addActionListener(acl);
        button5.addActionListener(acl);
        button6.addActionListener(acl);

        GUI.setVisible(true);
        return GUI;
    }

    public static void showNoMoreHintsMessage(){
        JOptionPane.showMessageDialog(null, "No More hints!"); 
    }

}