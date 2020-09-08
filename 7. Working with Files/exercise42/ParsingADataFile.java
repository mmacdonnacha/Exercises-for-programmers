import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class ParsingADataFile {
    public static void main(String[] args) {

        ArrayList<String[]> details = getInputs();
        int lastNameLength = getMaxSize(details, 0);
        int firstNameLength = getMaxSize(details, 1);
        int salaryLength = getMaxSize(details, 2);
        int fullLength = lastNameLength + firstNameLength + salaryLength;
        String output = "";

        String last = addCharacter("Last", " ", lastNameLength);
        String first = addCharacter("First", " ", firstNameLength);
        String salary = addCharacter("Salary", " ", salaryLength);
        String line = addCharacter("", "-", fullLength);


        output += String.format("%s %s%s\n", last, first, salary);
        output += String.format("%s\n", line);

        for (String[] s : details) {
            last = addCharacter(s[0], " ", lastNameLength);
            first = addCharacter(s[1], " ", firstNameLength); 
            output += String.format("%s%s%s\n", last, first, s[2]);
        }


        System.out.println(output);
    }

    public static ArrayList<String[]> getInputs() {
        ArrayList<String[]> details = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {

            while (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(",");
                details.add(array);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return details;
    }

    public static int getMaxSize(ArrayList<String[]> list, int position) {
        int max = list.get(0)[0].length();

        for (String[] s : list) {
            int length = s[position].length();
            if (max < length) {
                max = length;
            }
        }

        return max;
    }

    public static String addCharacter(String word, String insert, int length){
        while (word.length() < length) 
            word += insert;

        return word;
    }
}
