import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for(int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;
        }

        scanner.close();

        System.out.println("The total is " + sum + ".");
    }
}