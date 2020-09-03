import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euros = scanner.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate = scanner.nextDouble();

        scanner.close();

        
        double dollars = Math.ceil(euros * rate) / 100.0;


        System.out.printf("%d euros at an exchange rate of %.2f is %.2f U.S. dollars.", euros, rate, dollars);
    }
}