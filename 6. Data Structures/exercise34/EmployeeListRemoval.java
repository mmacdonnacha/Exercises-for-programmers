import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        employeeList.add("John Doe");

        
        printEmployees(employeeList);
        // usingArrayList(scanner, employeeList);
        usingArray(scanner, employeeList);
        
    }

    public static void printEmployees(ArrayList<String> list){
        System.out.printf("\nThere are %d employees:\n", list.size());

        for(String s : list){
            System.out.println(s);
        }
    }

    public static void printEmployees(String[] arrayStr){
        System.out.printf("\nThere are %d employees:\n", arrayStr.length);

        for(String s : arrayStr){
            System.out.println(s);
        }
    }

    public static void usingArrayList(Scanner scanner, ArrayList<String> empList){
        System.out.print("\nEnter an employee name to remove: ");
        String name = scanner.nextLine();

        if(empList.contains(name)){
            empList.remove(name);
        }

        printEmployees(empList);
    }

    public static void usingArray(Scanner scanner, ArrayList<String> empList){
        String[] initialArray = new String[empList.size()];
        String[] finalArray;
        empList.toArray(initialArray);
        
        System.out.print("\nEnter an employee name to remove: ");
        String name = scanner.nextLine();

        int index = 0;
        for(String s : initialArray){
            if(!name.equals(s)){
                index++;
            }
        }

        finalArray = new String[index];
        index = 0;
        for(String s : initialArray){
            if(!name.equals(s)){
                finalArray[index] = s;
                index++;
            }
        }


        printEmployees(finalArray);
    }
}
