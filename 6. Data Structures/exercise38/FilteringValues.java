import java.util.Scanner;

public class FilteringValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numebrs separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] arrayOfStrings = input.split(" ");
        int length = arrayOfStrings.length;
        int[] intArray = new int[length];

        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(arrayOfStrings[i]);
        }

        int[] evenArray = filterEvenNumbers(intArray);
        String output = "The even numbers are";
        for(int num: evenArray)
            output += " " + num;

        System.out.println(output);

    }

    public static int[] filterEvenNumbers(int[] arrayOfInts) {
        int evenCount = 0;
        for (int num : arrayOfInts) {
            if (num % 2 == 0)
                evenCount++;
        }

        int[] newArray = new int[evenCount];
        int index = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] % 2 == 0) {
                newArray[index] = arrayOfInts[i];
                index++;
            }
        }

        return newArray;
    }
}
