# Word Guessing Game

This project implements a Word Guessing Game using Java Swing. The game allows users to guess a target word, receive hints, and keep track of their attempts.

## Project Structure
The project consists of the following Java files:

* `AppendClickListener.java`: Handles button click events, appends user input to a StringList, provides hints, and manages game logic.

* `ListGUI.java`: Creates the graphical user interface (GUI) using Java Swing. Initializes the main frame and components for user interaction.

* `Main.java`: Contains the main method to initiate the GUI and run the Word Guessing Game.

* `StringList.java`: Represents a linked list of strings. Provides methods for manipulating and analyzing the list, such as counting strings of a certain length or matching a specific word.

* `StringNode.java`: Defines a node for the linked list, containing a string value and a reference to the next node.

## How to Run
- Open the project in your Java IDE.
- Run the `Main` class, which initiates the GUI for the Word Guessing Game.

## Gameplay Instructions
1. Enter a word (without spaces) in the text field.
2. Use buttons like "Append," "Prepend," "Word Hint," "Letter Hint," and "Guess" to interact with the game.
3. Receive hints and feedback on your attempts in the text area.
4. You have a limited number of hints and guesses. Once exhausted, the game ends.

## Changing the Guess Word
To change the target word, click the "Change Guess Word" button. Enter a new word and its meaning when prompted.

## Screenshots

![Alt text](/Screenshots/Screenshot1.png?raw=true "Screenshot1")
![Alt text](/Screenshots/Screenshot2.png?raw=true "Screenshot2")
![Alt text](/Screenshots/Screenshot3.png?raw=true "Screenshot3")
![Alt text](/Screenshots/Screenshot4.png?raw=true "Screenshot4")
![Alt text](/Screenshots/Screenshot5.png?raw=true "Screenshot5")

## Note
+ The game uses a linked list (`StringList`) to store and manipulate user attempts.
+ The `AppendClickListener` class handles user interactions, appends input to the list, and provides hints.

## Developers
Alfiya Valitova
alfiyav6@gmail.com

## Acknowledgments
This project uses Java Swing for the graphical user interface. Developed for educational purposes.
