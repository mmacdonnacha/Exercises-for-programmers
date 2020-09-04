import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String difficulty = "";
        String guess = "";
        int guesses;
        boolean playAgain;

        System.out.println("Let's play Guess the Number.");

        do {
            guesses = 0;
            System.out.print("Pick a difficulty level (1, 2 or 3): ");

            // Set difficulty
            while (true) {
                difficulty = scanner.nextLine();

                // valid input is 1, 2 or 3 only
                if (difficulty.matches("^(1|2|3)$")) {
                    break;
                } else {
                    System.out.print("Invalid input. Enter 1, 2 or 3: ");
                }
            }

            int myNumber = getRandomNumber(difficulty);
            System.out.print("I have my number. What's your guess? ");

            // main loop
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                guess = scanner.nextLine();
                guesses++;
                guessedCorrectly = checkGuess(myNumber, guess, guesses);
            }

            
            playAgain = replayGame(scanner);


        } while (playAgain);


        scanner.close();
    }

    public static int getRandomNumber(String difficulty) {
        Random random = new Random();
        int EASY = 10;
        int NORMAL = 100;
        int HARD = 1000;

        if (difficulty.equals("1"))
            return random.nextInt(EASY) + 1;
        else if (difficulty.equals("2"))
            return random.nextInt(NORMAL) + 1;
        else
            return random.nextInt(HARD) + 1;
    }

    public static boolean checkGuess(int myNumber, String guess, int guesses) {
        boolean guessedCorrectly;

        if (guess.matches("^[0-9]+$")) {
            int userGuess = Integer.parseInt(guess);

            if (userGuess > myNumber) {
                System.out.print("Too high. Guess again: ");
                guessedCorrectly = false;
            } else if (userGuess < myNumber) {
                System.out.print("Too low. Guess again: ");
                guessedCorrectly = false;
            } else {
                String g = guesses == 1 ? "guess" : "guesses";
                System.out.printf("You got it in %d %s!.\n", guesses, g);
                guessedCorrectly = true;
            }

        } else {
            System.out.print("Invalid input. Guess again: ");
            guessedCorrectly = false;
        }

        return guessedCorrectly;
    }

    public static boolean replayGame(Scanner scanner){
        System.out.print("Play again (y or n)? ");
        String replay = scanner.nextLine();

        if(replay.equals("y")){
            return true;
        }else{
            System.out.println("Goodbye!");
            return false;
        }
    }
}
