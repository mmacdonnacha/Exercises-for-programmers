import java.util.Scanner;

public class MonthsToPayOffACreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your balance? ");
        int balance = Integer.parseInt(scanner.nextLine());

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = Double.parseDouble(scanner.nextLine());

        System.out.print("What is the monthly payment you can make? ");
        int payment = Integer.parseInt(scanner.nextLine());

        scanner.close();

        double monthsLeft = calculateMonthsUntilPaidOff(apr, balance, payment);

        String output = String.format("It will take you %.0f months to pay off this card.", monthsLeft);

        System.out.println(output);
    }

    public static double calculateMonthsUntilPaidOff(double interest, int balance, int paymentPerMonth){
        double i = (interest / 100) / 365.0;

        double power = Math.pow((1 + i), 30);
        double balDIVpay = 1.0 * balance / paymentPerMonth;
        double c = balDIVpay * (1 - power);

        double top = Math.log(1 + c);
        double bottom = Math.log(1 + i);

        double n = (-1.0 / 30.0) * (top / bottom);

        return Math.ceil(n);
    }
}