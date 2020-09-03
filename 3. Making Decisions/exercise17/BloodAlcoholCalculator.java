import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double men = 0.73;
        final double women = 0.66;
        String gender;
        double weight;
        int numberOfDrinks;
        double alcoholContent;
        double time;

        while (true) {

            // get inputs
            System.out.print("Enter your gender: ");
            gender = scanner.nextLine();

            try {
                System.out.print("Enter your weight: ");
                weight = Double.valueOf(scanner.nextLine());

                System.out.print("Enter the number of drinks consumed: ");
                numberOfDrinks = Integer.valueOf(scanner.nextLine());

                System.out.print("Enter alcohol content of the drinks: ");
                alcoholContent = Double.valueOf(scanner.nextLine());

                System.out.print("Enter the time since you consumed the drinks: ");
                time = Double.valueOf(scanner.nextLine());

                scanner.close();

                // Process the input data
                double r;
                if (gender.equals("men")) {
                    r = men;
                } else {
                    r = women;
                }

                double A = numberOfDrinks * alcoholContent;
                double bac = (A * 5.14 / weight * r) - 0.15 * time;


                // Print outputs
                System.out.println("Your BAC is " + bac);
                if (bac < 0.08) {
                    System.out.println("It is not legal for you to drive.");
                } else {
                    System.out.println("It is legal for you to drive.");
                }

                
            } catch (Exception e) {
                System.out.println("Enter digits in the correct places");
            }

            break;
        }
    }
}