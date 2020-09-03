import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text, messageOutput;

        System.out.print("What is the input string? ");
        text = scan.next();
        scan.close();

        messageOutput = String.format("%s has %d characters", text, text.length());

        System.out.println(messageOutput);

    }
}