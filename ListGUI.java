import java.awt.*;
import javax.swing.*;

public class ListGUI extends JFrame{
    public static ListGUI initiateGUI(ListGUI GUI) throws Exception{
        GUI = new ListGUI();
        GUI.setSize(650,540);
        GUI.setLocation(300,300);
        GUI.setLayout(new GridLayout(3,1));
        GUI.setTitle("Word Guessing Game");
        GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container myContentPane = GUI.getContentPane();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("No 'space' inputs");
        JTextField textField = new JTextField(8);
        JButton button1 = new JButton("Append");
        JButton button2 = new JButton("Prepend");
        JButton button3 = new JButton("Word Hint");
        JButton button4 = new JButton("Letter Hint");
        JButton button5 = new JButton("Guess");
        TextArea textArea = new TextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));; 
        myContentPane.add(panel);
        myContentPane.add(textArea);
        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        myContentPane.add(button5);

        AppendClickListener acl = new AppendClickListener(textField, textArea);
        button1.addActionListener(acl);
        button2.addActionListener(acl);
        button3.addActionListener(acl);
        button4.addActionListener(acl);
        button5.addActionListener(acl);

        GUI.setVisible(true);
        return GUI;
    }

}