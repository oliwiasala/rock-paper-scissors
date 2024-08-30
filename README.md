# Rock Paper Scissors Game

A simple command-line implementation of the classic game "Rock, Paper, Scissors" written in Java.

## How to Play

1. **Objective**: The goal is to beat the computer in a game of Rock, Paper, Scissors.
    - **Rock** beats **Scissors**.
    - **Scissors** beats **Paper**.
    - **Paper** beats **Rock**.

2. **Game Flow**:
    - The game will prompt you to enter either "rock", "paper", or "scissors".
    - The computer will randomly choose one of the options as well.
    - The result of the game (win, lose, or tie) will be displayed.
    - You can choose to play again or quit the game by typing "yes" or "no".

3. **Quit the Game**:
    - At any point, you can quit the game by typing `quit`.

## Example Gameplay
```java
Welcome to the Rock, Paper, Scissors Game! Please enter one of these options: rock, paper, or scissors.
Please enter your choice: rock
Your choice: rock
Computer's choice: scissors
You won! Do you want to play again? (yes/no): yes
```


## How to Run

1. **Clone the Repository**:
    ```bash
    git clone git@github.com:oliwiasala/rock-paper-scissors.git
    ```

2. **Navigate to the Project Directory**:
    ```bash
    cd RockPaperScissors
    ```

3. **Compile the Java Code**:
    ```bash
    javac RockPaperScissors.java
    ```

4. **Run the Game**:
    ```bash
    java RockPaperScissors
    ```

## Features

- Handles invalid input and prompts the user for valid entries.
- Allows the player to play multiple rounds.
- Clears the console before each new round for a clean playing experience.
- Exits gracefully when the user decides to quit.
