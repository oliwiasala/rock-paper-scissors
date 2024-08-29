import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {

    // Define the valid options for the game
    private final String[] options = {"rock", "paper", "scissors"};

    // Main method to start the game
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rock, Paper, Scissors Game! Please enter one of these options: rock, paper, or scissors.");

        // Main game loop
        while (true) {
            System.out.print("Please enter your choice: ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            // Exit the game if the user types "quit"
            if (userChoice.equals("quit")) {
                System.out.println("Thank you for playing!");
                break;
            }

            // Check if the user's choice is valid
            if (isValidChoice(userChoice)) {
                String result = determineOutcome(userChoice);
                System.out.println(result);

                // Ask the user if they want to play again
                while (true) {
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scanner.nextLine().trim().toLowerCase();

                    // Check if the user input is valid (yes/no)
                    if (isValidPlayAgain(playAgain)) {
                        // Exit the game if the user chooses "no"
                        if (playAgain.equals("no")) {
                            System.out.println("Thank you for playing!");
                            return;  // Exit the entire game
                        } else {
                            break;  // Restart the game loop
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a valid value (yes or no).");
                    }
                }
            } else {
                System.out.println("Invalid input! Please enter a valid value (rock, paper, or scissors).");
            }
        }
    }

    // Method to check if the user's choice is valid
    private boolean isValidChoice(String userChoice) {
        List<String> validOptions = Arrays.asList(options);
        return validOptions.contains(userChoice);
    }

    // Method to check if the play again input is valid (yes/no)
    private boolean isValidPlayAgain(String playAgain) {
        return playAgain.equals("yes") || playAgain.equals("no");
    }

    // Method to generate the computer's choice
    private String generateComputerChoice() {
        return options[(int) (Math.random() * 3)];
    }

    // Method to determine the outcome of the game
    private String determineOutcome(String userChoice) {
        String computerChoice = generateComputerChoice();

        // Display both choices
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + computerChoice);

        // Determine the outcome based on the choices
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("rock") && computerChoice.equals("paper") ||
                userChoice.equals("paper") && computerChoice.equals("scissors") ||
                userChoice.equals("scissors") && computerChoice.equals("rock")) {
            return "You lost!";
        } else {
            return "You won!";
        }
    }

    // Main method to start the game from the command line
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.play();
    }
}