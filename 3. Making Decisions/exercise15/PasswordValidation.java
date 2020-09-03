import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        final String PASSWORD = "password";
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the password? ");
        String userPassword = scanner.nextLine();
        scanner.close();

        if(userPassword.equals(PASSWORD)){
            System.out.print("Welcome!");
        }else{
            System.out.print("I don't know you.");
        }
    }
}