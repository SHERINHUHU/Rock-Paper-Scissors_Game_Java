# Rock, Paper, Scissors Game

## Overview
This Java program is a simple implementation of the classic Rock, Paper, Scissors game. Players can input their choice (rock, paper, or scissors), and the program randomly selects the computer's choice. The winner is determined based on the classic rules of the game.

## How to Play
1. Run the program.
2. Enter your choice (rock, paper, or scissors) when prompted.
3. The program randomly selects the computer's choice.
4. The winner is determined, and the result is displayed on the console.
5. The game prompts you to play again.

## Features
- **User Input:** Utilizes the `Scanner` class to receive the player's choice.
- **Random Computer Choice:** Generates a random index to select the computer's choice.
- **Comparison Logic:** Compares the player's choice with the computer's choice to determine the winner.
- **Loop Structure:** Allows players to play the game multiple times if desired.

## Code Snippet
```java
// Example of user input and game logic
Scanner in = new Scanner(System.in);
String[] choices = {"paper", "scissors", "rock"};

boolean playAgain = false;
do {
    int rand = (int) (random() * 3);

    System.out.print("Enter your choice (paper/scissors/rock): ");
    String playerChoice = in.nextLine();
    
    // ... (rest of the code)

    // Prompt for playing again
    System.out.print("Do you want to play again? (yes/no): ");
    String playAgainInput = in.nextLine();
    playAgain = playAgainInput.equalsIgnoreCase("yes");
} while (playAgain);
