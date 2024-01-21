# Word Guessing Game Project
## Overview
This project implements a Word Guessing Game with a graphical user interface (GUI) using Java. The project includes classes such as `AppendClickListener`, `ListGUI`, `Main`, `StringList`, and `StringNode`.

## Classes
1. AppendClickListener
* Implements `ActionListener` to handle button clicks in the GUI.
* Includes logic for appending, prepending, providing word hints, letter hints, and making guesses.
* Uses a `StringList` to manage and manipulate string data.

2. ListGUI
* Extends `JFrame` to create the GUI for the Word Guessing Game.
* Includes buttons for appending, prepending, word hints, letter hints, and making guesses.
* Uses an instance of `AppendClickListener` to handle button actions.

3. Main
* Main class to run the Word Guessing Game.
* Initiates the GUI using the `ListGUI.initiateGUI()` method.
  
4. StringList
* Represents a linked list of strings.
* Includes methods for prepending, appending, counting strings with a specific length, counting word strings, counting letter strings, printing the list, and more.

5. StringNode
* Represents a node in the linked list.
* Contains data (a string) and a reference to the next node.

## How to Run
To run the Word Guessing Game, execute the Main class. This will initiate the GUI, allowing users to interact with the game.

```sh
java Main
```

## Game Instructions
1. Append: Add a new string at the end of the list.
2. Prepend: Add a new string at the beginning of the list.
3. Word Hint: Count and display the number of words in the list matching a predefined word.
4. Letter Hint: Count and display the number of letters in the list matching letters in a predefined word.
5. Guess: Make a guess for a predefined word and check if it matches.

## Screenshots

![Alt text](/relative/path/to/img.jpg?raw=true "Optional Title")

## Dependencies
No external dependencies are required to run the project.
