package Level2basic;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int number = rand.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("\nI'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you've used all your attempts! The correct number was " + number);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
