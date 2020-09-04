import java.util.Scanner;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password for validation: ");
        String password = scanner.nextLine();
        scanner.close();


        int passStrength = passwordValidator(password);

        String output = "The password '" + password + "' is a ";

        switch(passStrength){
            case 1:
                output += "very weak password.";
                break;
            case 2:
                output += "weak password.";
                break;
            case 3:
                output += "strong password.";
                break;
            case 4:
                output += "very strong password.";
                break;
            default:
                output += "invalid password.";
        }


        System.out.println(output);


    }

    public static int passwordValidator(String password){
        if(password.isEmpty()){
            return 0;
        }


        // very weak password
        if(password.length() < 8 && password.matches("^[0-9]+$")){
            return 1;
        }

        // weak password
        if(password.length() < 8 && password.matches("^[a-zA-Z]+$")){
            return 2;
        }

        if(password.matches("(.*)[a-zA-Z]+(.*)") && password.matches("(.*)[0-9]+(.*)")){
            
            if(!(password.matches("(.*)[^a-zA-Z0-9 ](.*)")))  // does not contain special characters
                // strong password
                return 3;
            else
                // very strong password
                return 4;
        }
        

        return 0;
    }

}