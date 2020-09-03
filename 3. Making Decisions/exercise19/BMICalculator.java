import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height;
        String output = "";

        while(true){
            try{
                System.out.print("Enter the person's height in inches: ");
                weight = Double.valueOf(scanner.nextLine());

                System.out.print("Enter the person's weight in pounds: ");
                height = Double.valueOf(scanner.nextLine());
                
                break;

            }catch(NumberFormatException nfe){
                System.out.print("Make sure to enter numerical digits.\n\n");
            }
        }

        scanner.close();

        double bmi = (weight / (height * height)) * 703;
        output = String.format("Your BMI is %.1f\n", bmi);

        if(bmi < 18.5){
            output += "You are underweight. You should see your doctor.";
        } else if(bmi < 25.0) {
            output += "You are overweight. You should see your doctor.";
        } else {
            output += "You are within the ideal weight range.";
        }

        System.out.print(output);
        
    }
}