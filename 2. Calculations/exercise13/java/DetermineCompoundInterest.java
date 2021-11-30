import java.util.Scanner;

public class DetermineCompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal, time, compound;
        double rate, amount;

        System.out.print("What is the principal amount? ");
        principal = scanner.nextInt();

        System.out.print("What is the rate? ");
        rate = scanner.nextDouble();

        System.out.print("What is the number of years? ");
        time = scanner.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = scanner.nextInt();

        scanner.close();


        amount = principal * Math.pow((1 + ((rate/100) / compound)), (compound * time));


        System.out.printf("€%d invested at %.2f%% for %d years compounded %d times per year is €%.2f\n",
            principal, rate, time, compound, amount);
    }
}