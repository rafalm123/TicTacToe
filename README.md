# TicTacToe
Tic-Tac-Toe Game in Java
This is a simple command-line Tic-Tac-Toe game implemented in Java. The game allows a human player to compete against a computer player.

# Features
- Human vs. Computer gameplay
- Random starting player selection
- Board display and user-friendly input
- Replay option after a game finishes

# How to Play

- Clone the repository or download the source code.
- Compile the Java files.
- Run the TicTacToe class.
- Follow the on-screen prompts to play the game.

# Rules

- The game board consists of a 3x3 grid.
- The human player uses 'O' and the computer player uses 'X'.
- The starting player is chosen randomly.
- Players take turns to place their symbol in an empty cell.
- The first player to align three symbols horizontally, vertically, or diagonally wins the game.
- If the board is full and no player has won, the game ends in a tie.

# Implementation Details

The game consists of several classes:

- Board: Represents the game board and handles placing symbols on the board.
- Human: Represents the human player and handles user input.
- Cpu: Represents the computer player and handles computer move generation.
- Game: Controls the game flow, including the game loop and determining the starting player.
- Player: An interface implemented by Human and Cpu classes.
- WinnerLogic: Handles checking for a winner or a tie.
- TicTacToe: The main class that runs the game.
