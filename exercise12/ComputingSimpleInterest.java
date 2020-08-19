package exercise12;

import java.util.Scanner;

public class ComputingSimpleInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        scanner.close();


        double amount = principal * (1 + (rateOfInterest / 100) * years);
    
        System.out.printf("After %d years at %.2f%%, the investment will be worth €%.2f",
            years, rateOfInterest, amount);
    }
}