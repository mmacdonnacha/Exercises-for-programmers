import java.util.ArrayList;
import java.util.Scanner;


public class FilteringValuesUsingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNums = new ArrayList<>();
        ArrayList<Integer> listOfEven;

        System.out.print("Enter a list of numebrs separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        for (String s : input.split(" ")) {
            listOfNums.add(Integer.parseInt(s));
        }

        listOfEven = filterEvenNumbers(listOfNums);
        String output = "The even numbers are";
        for(int num: listOfEven)
            output += " " + num;

        System.out.println(output);

    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> listOfInts) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int num : listOfInts) {
            if (num % 2 == 0) even.add(num);
        }
        return even;
    }
}
