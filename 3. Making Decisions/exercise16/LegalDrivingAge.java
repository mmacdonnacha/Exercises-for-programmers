import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = Integer.valueOf(scanner.nextLine());

        scanner.close();

        String answer = age >= 18 ? "You are old enough to legally drive." 
                                  : "You are not old enough to legally drive";

        System.out.print(answer);
    }
}