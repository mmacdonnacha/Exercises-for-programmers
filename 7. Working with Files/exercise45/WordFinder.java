import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Path path = Paths.get("input.txt");
        String s = readFile(path);
        s = changeWords(s);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name for the output file: ");
        String fileName = scan.nextLine();
        writeFile(s, fileName);
        scan.close();
    }

    public static String readFile(Path filePath){
        try{
            return Files.readString(filePath);
        }catch(IOException e){
            System.out.println("Error: Cannot find file.");
        }

        return "";
    }

    public static void writeFile(String contents, String fileName){
        try{
            Path outputFile = Paths.get(fileName);
            Files.writeString(outputFile, contents);
        }catch(IOException e){
            System.out.println("Unable to write new file.");
        }
    }

    public static String changeWords(String contents){
        String oldWord = "utilize";
        String newWord = "use";

        return contents.replace(oldWord, newWord);
    }
}