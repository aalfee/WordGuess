import javax.swing.*;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppendClickListener implements ActionListener{
    private JTextField textField;
    private TextArea textArea1;
    public StringList sl = new StringList();
    private String word = "Love";
    
    public AppendClickListener(JTextField textField, TextArea textArea) {
        this.textField = textField;
        textArea1 = textArea;
        textArea1.setText("Previous attempts: \n");
       
    }

public void actionPerformed(ActionEvent event) {
        String buttonName = event.getActionCommand();
    if(buttonName == "Append"){
        textArea1.setText("Previous attempts: \n");
        String userInput = textField.getText();
        if (sl != null) {
            // Your logic to append to StringList
            sl.append(userInput);
        } else {
            // Handle the case where sl is null
            System.out.println("Previous attempt is not initialized!");
        }
        String[] output = sl.printStringList();
            for(int i = 0; i < output.length; i++){
                textArea1.append(output[i]);
                textArea1.append(" ");
            
        }
    } else if (buttonName == "Prepend"){
        textArea1.setText("Previous attempts: \n");
        String userInput = textField.getText();
        if (sl != null) {
            // Your logic to append to StringList
            sl.prepend(userInput);
            
        } else {
            // Handle the case where sl is null
            System.out.println("Previous attempt is not initialized!");
        }
        String[] output = sl.printStringList();
            for(int i = 0; i < output.length; i++){
                textArea1.append(output[i]);
                textArea1.append(" ");
        
            }
    } else if (buttonName == "Word Hint"){
        textArea1.setText("Previous attempts: \n");
        if (sl != null) {
            // Your logic to append to StringList
            int answer = sl.countWordStrings(word);
            System.out.println("Your previous attempt(s) had "+String.valueOf(answer)+" word(s) that match the length of the guess word");
        } else {
            // Handle the case where sl is null
            System.out.println("Previous attempt is not initialized!");
        }
        String[] output = sl.printStringList();
            for(int i = 0; i < output.length; i++){
                textArea1.append(output[i]);
                textArea1.append(" ");
        
            }
    } else if (buttonName == "Letter Hint"){
            textArea1.setText("Previous attempts: \n");
            if (sl != null) {
                int answer = 0;
                for(int i = 0; i < word.length(); i++){
                answer += sl.countLetterStrings(word.charAt(i));
                }
                System.out.println("Your previous attempt(s) had "+answer+" letter(s) that match the guess word");
                // Handle the case where sl is null
            } else {    
                System.out.println("Previous attempt is not initialized!");
            }
            String[] output = sl.printStringList();
                for(int i = 0; i < output.length; i++){
                    textArea1.append(output[i]);
                    textArea1.append(" ");
            
                }
        } else if (buttonName == "Guess"){
            textArea1.setText("Previous attempts: \n");
            String userInput = textField.getText();
            if (sl != null) {
                if(userInput.equalsIgnoreCase(word)){ System.out.println("You guessed it! The word was: "+word);
             } System.out.println("No wrong guess");
            } else {
                // Handle the case where sl is null
                System.out.println("Previous attempt is not initialized!");
            }
            String[] output = sl.printStringList();
                for(int i = 0; i < output.length; i++){
                    textArea1.append(output[i]);
                    textArea1.append(" ");
            
                }
        }
    }
}



