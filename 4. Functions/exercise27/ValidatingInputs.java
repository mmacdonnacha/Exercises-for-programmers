import java.util.Scanner;

public class ValidatingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter an employee ID: ");
        String employeeID = scanner.nextLine();
        
        scanner.close();

        String output = validateInput(firstName, lastName, zipCode, employeeID);

        System.out.println(output);
    }


    public static String validateInput(String firstName, String lastName, String zipCode, String employeeID){
        String valFname = validateFirstName(firstName);
        String valLname = validateLastName(lastName);
        String valZIPCode = validateZIPCode(zipCode);
        String valEmpID = validateEmployeeID(employeeID);

        String value = valFname + valLname + valZIPCode + valEmpID;

        if(value.isEmpty()){
            return "There were no errors found.";
        }


        return value;
    }

    public static String validateFirstName(String firstName){

        if(firstName.isEmpty())
            return "The first name must be filled in.\n";

        if(!firstName.matches("[a-zA-Z]{2,}")){
            return "\"" + firstName + "\" is not a valid first name. It is too short.\n";
        }

        return "";

    }

    public static String validateLastName(String lastName){
        if(lastName.isEmpty())
            return "The last name must be filled in.\n";

        if(!lastName.matches("[a-zA-Z]{2,}")){
            return "\"" + lastName + "\" is not a valid last name. It is too short.\n";
        }

        return "";
        
    }

    public static String validateZIPCode(String zipCode){
        if(!zipCode.matches("^[0-9]+$")){
            return "The ZIP Code must be numeric.\n";
        }

        return "";
    }

    public static String validateEmployeeID(String empID){
        if(!empID.matches("^[a-zA-z]{2}-[0-9]{4}")){
            return "\"" + empID + "\" is not a valid ID.\n";
        }

        return "";
    }
}