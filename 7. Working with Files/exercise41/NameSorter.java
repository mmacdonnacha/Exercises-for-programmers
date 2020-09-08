import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {

        String input = "input.txt";
        String output = "output.txt";
        ArrayList<String> names = getInput(input);

        Collections.sort(names);

        writeToFile(output, names);

    }

    public static ArrayList<String> getInput(String fileName) {
        ArrayList<String> names = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                names.add(input);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        return names;
    }

    public static void writeToFile(String fileName, ArrayList<String> list) {
        try (PrintWriter writer = new PrintWriter(fileName)) {

            writer.println("Total of " + list.size() + " names");
            writer.println("----------------------------------");
            for (String line : list) {
                writer.println(line);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
