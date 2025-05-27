import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the number (between 1 and 100):");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}

