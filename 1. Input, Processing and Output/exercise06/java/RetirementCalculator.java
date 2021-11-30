import java.util.Scanner;
import java.time.LocalDate;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentAge, retirementAge;
        int yearsLeft, retirementYear;
        LocalDate date = LocalDate.now();
        String output;
        

        System.out.print("What is your current age? ");
        currentAge = scan.nextInt();

        System.out.print("At what age would you like to retire? ");
        retirementAge = scan.nextInt();

        scan.close();

        yearsLeft = retirementAge - currentAge;
        retirementYear = date.getYear() + yearsLeft;

        output = String.format("You have %d year(s) left until you can retire."
            + "\nIt's %d, so you can retire in %d.", yearsLeft, date.getYear(), retirementYear);

        System.out.println(output);

    }
}