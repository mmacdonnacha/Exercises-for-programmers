import java.util.Scanner;

public class HandlingBadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        boolean validInput = false;

        while(!validInput){
            System.out.print("What is the rate of return? ");
            input = scanner.nextLine();

            validInput = validateInput(input);

            if(!validInput)
                System.out.println("Sorry. That's not a valid input.");
        }
        scanner.close();

        String output = formOutputString(input);

        System.out.println(output);

    }

    public static boolean validateInput(String input){
        if(input.equals("0")){
            return false;
        }

        if(input.matches("^[^0-9]+$")){
            return false;
        }

        return true;
    }

    public static String formOutputString(String numStr){
        int num = Integer.parseInt(numStr);

        int years = 72 / num;

        return "It will take " + years + " years to double your initial investment.";
    }
}