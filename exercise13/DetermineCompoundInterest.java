package exercise13;

import java.util.Scanner;

public class DetermineCompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal, time, compound;
        double rate, amount;

        System.out.print("What is the principal amount? ");
        principal = scanner.nextInt();

        System.out.print("What is the rate? ");
        rate = scanner.nextDouble() / 100;

        System.out.print("What is the number of years? ");
        time = scanner.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = scanner.nextInt();

        scanner.close();


        amount = principal * Math.pow((1 + (rate / compound)), (compound * time));


        System.out.printf("€%d invested at %.2f for %d years compounded %d times per year is €%.2f",
            principal, rate, time, compound, amount);
    }
}