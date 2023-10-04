import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner suresh = new Scanner(System.in);
        Random random = new Random();

        int lowerNo = 1;
        int upperNo = 100;
        int numberToGuess = random.nextInt(upperNo - lowerNo + 1) + lowerNo;
        int maxAttempts = 10;
        int attempts = 0;
        int score = 0;
        int rounds = 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + lowerNo + " and " + upperNo);

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = suresh.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                score += maxAttempts - attempts + 1;

                System.out.println("Round " + rounds + " Score: " + score);

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = suresh.next().toLowerCase();
                if (playAgain.equals("yes")) {
                    numberToGuess = random.nextInt(upperNo - lowerNo + 1) + lowerNo;
                    attempts = 0;
                    rounds++;
                    System.out.println("Next round!");
                } else {
                    System.out.println("Thanks for playing!");
                    break;
                }
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }

            if (attempts >= maxAttempts) {
                System.out.println("You've run out of attempts! The correct number was: " + numberToGuess);

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = suresh.next().toLowerCase();
                if (playAgain.equals("yes")) {
                    numberToGuess = random.nextInt(upperNo - lowerNo + 1) + lowerNo;
                    attempts = 0;
                    rounds++;
                    System.out.println("Next round!");
                } else {
                    System.out.println("Thanks for playing!");
                    break;
                }
            }
        }
    }
}

