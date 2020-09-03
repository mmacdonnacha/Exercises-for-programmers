import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0, tax = 0;

        System.out.print("What is the order amount? ");
        double amount = Double.valueOf(scanner.nextLine());

        System.out.print("What state do you live in? ");
        String state = scanner.nextLine().toLowerCase();

        if(state.equals("illinois")){
            tax = amount * 0.08;
            total = amount + tax;

        }else if(state.equals("wisconsin")){
            System.out.print("What county do live in? ");
            String county = scanner.nextLine().toLowerCase();

            if(county.equals("eay claire")){
                tax = amount * 0.085;
                total = amount + tax;

            }else if(county.equals("dunn")){
                tax = amount * 0.084;
                total = amount + tax;

            }
        }

        scanner.close();

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f", 
            tax, total);
    }
}