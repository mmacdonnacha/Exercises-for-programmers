import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] answers = new String[]{"Yes", "No", "Maybe", "Ask again later."};

        System.out.print("What's your question? ");
        scanner.nextLine();
        scanner.close();

        String response = answers[random.nextInt(answers.length)];
        System.out.print(response);
    }
}
