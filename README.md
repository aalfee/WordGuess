<h1>Word Guessing Game Project</h1>

    <p>This project implements a simple word guessing game with a graphical user interface (GUI) using Java Swing. The game allows users to guess a target word, receive hints, and keep track of their attempts.</p>

    <h2>Classes</h2>

    <ul>
        <li><strong>AppendClickListener:</strong> ActionListener for handling button clicks in the GUI.</li>
        <li><strong>ListGUI:</strong> Main GUI class that initializes and displays the game interface.</li>
        <li><strong>Main:</strong> Main class to start the application.</li>
        <li><strong>StringList:</strong> Class representing a linked list of strings with various methods for manipulation.</li>
        <li><strong>StringNode:</strong> Class representing a node in the linked list.</li>
    </ul>

    <h2>Features</h2>

    <ul>
        <li>Append and prepend user input to a linked list of strings.</li>
        <li>Provide hints for the guess word, including word and letter hints.</li>
        <li>Allow users to make guesses and display results.</li>
        <li>Change the guess word during the game.</li>
        <li>Track and display previous attempts and hints.</li>
        <li>Lose the game after a certain number of incorrect guesses.</li>
    </ul>

    <h2>Usage</h2>

    <ol>
        <li>Compile and run the <code>Main.java</code> class to start the game.</li>
        <li>Enter words in the provided text field and use the buttons to interact with the game.</li>
        <li>Receive hints, make guesses, and change the guess word as needed.</li>
        <li>View previous attempts and hints in the displayed text areas.</li>
    </ol>

    <h2>Notes</h2>

    <ul>
        <li>The game includes a limit on the number of hints and guesses allowed.</li>
        <li>The user can change the guess word and its meaning during the game.</li>
        <li>The linked list (<code>StringList</code>) handles string manipulations and tracking previous attempts.</li>
    </ul>

    <p>Feel free to customize and enhance the code for additional features or improvements!</p>
