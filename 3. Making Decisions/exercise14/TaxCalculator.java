import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = Double.valueOf(scanner.nextLine());

        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        scanner.close();

        double rate = 5.5;
        double tax = Math.ceil(rate * amount) / 100;
        double newAmount = amount;


        if(state.equals("WI")){
            System.out.printf("The subtotal is €%.2f.\n", amount);
            System.out.printf("The tax is €%.2f.\n", tax);
            newAmount = amount + tax;
            
        }

        System.out.printf("The total is €%.2f.", newAmount);
    }
}