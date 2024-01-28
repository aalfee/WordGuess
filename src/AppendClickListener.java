package src;
import javax.swing.*;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class AppendClickListener implements ActionListener{
    private JTextField textField;
    private TextArea textArea1;
    private TextArea textArea2;
    public StringList sl = new StringList();
    public static Boolean flag = true;
    private String word = "Love";               // Change the guess word here
    private String wordMeaning = "What is ? Baby dont hurt me";
    public static int hintCount = 3;
    public static int guessCount = 3;
    public static int countDown = 25;
    public AppendClickListener(JTextField textField, TextArea textArea, TextArea hintTextArea) {
        this.textField = textField;
        textArea1 = textArea;
        textArea2 = hintTextArea;
        textArea1.setText("Previous attempts: \n");
       
    }

public void actionPerformed(ActionEvent event) {
        String buttonName = event.getActionCommand();
        if((hintCount == 0) && ((buttonName == "Letter Hint")||(buttonName == "Word Hint"))) { ListGUI.showNoMoreHintsMessage(); flag = false; }


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
    } else if (buttonName == "Word Hint" && flag == true){
        textArea1.setText("Previous attempts: \n");
        if (sl != null) {
            // Your logic to append to StringList
            int answer = sl.countWordStrings(word);
            textArea2.setText("Meaning: "+wordMeaning+"\nYour previous attempt(s) had "+String.valueOf(answer)+" word(s) that match the length of the guess word");
            hintCount--;
        } else {
            // Handle the case where sl is null
            System.out.println("Previous attempt is not initialized!");
        }
        String[] output = sl.printStringList();
            for(int i = 0; i < output.length; i++){
                textArea1.append(output[i]);
                textArea1.append(" ");
        
            }
    } else if (buttonName == "Letter Hint" && flag == true){
            textArea1.setText("Previous attempts: \n");
            textArea2.setText("");
            if (sl != null) {
                int answer = 0;
                for(int i = 0; i < word.length(); i++){
                answer += sl.countLetterStrings(word.charAt(i));
                }

                String test = removeRepeatingCharacters(textArea2.getText());

                textArea2.setText(test+"\n Your previous attempt(s) had "+answer+" letter(s) that match the guess word \n");
                hintCount--;
                
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
                if(userInput.equalsIgnoreCase(word)){ textArea2.setText("You guessed it! The word was: "+word);
             } else {textArea2.setText("No wrong guess"); guessCount--;
                    if(guessCount == 0) {JOptionPane.showMessageDialog(null, "You Lose!"); System.exit(0);}    
            }
            } else {
                // Handle the case where sl is null
                System.out.println("Previous attempt is not initialized!");
            }
            String[] output = sl.printStringList();
                for(int i = 0; i < output.length; i++){
                    textArea1.append(output[i]);
                    textArea1.append(" ");
            
                }
        } else if (buttonName == "Change Timer"){
            String userInput = JOptionPane.showInputDialog("Change Timer to: ");
            try {
            countDown = Integer.parseInt(userInput);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Enter Integer Values Only");
            }
        
        } else if (buttonName == "Change Guess Word"){
            hintCount = 3;
            guessCount = 3;
            flag = true;
            String userInput = JOptionPane.showInputDialog("Enter a new Guess Word");
            word = userInput;
            userInput = JOptionPane.showInputDialog("Enter the new Guess Word meaning");
            wordMeaning = userInput;
            TimerJFrame tjf2 = new TimerJFrame(10, 1000, 350);
        }
    }

    public static String removeRepeatingCharacters(String inputString) {
        StringBuilder result = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (seenCharacters.add(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}



