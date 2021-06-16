import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyFinder {
    public static void main(String[] args) {
        Path path = Paths.get("input.txt");
        String s = readFile(path);
        Map<String, Integer> map = countWords(s);

        printHistogram(map);
    }

    public static String readFile(Path filePath){
        try{
            return Files.readString(filePath);
        }catch(IOException e){
            System.out.println("Error: Cannot find file.");
        }

        return "";
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();

        for(String word : text.split(" ")){
            if(!map.containsKey(word)){
                map.put(word, 1);
            }else{
                map.put(word, map.get(word)+1);
            }
        }

        return map;
    }


    public static void printHistogram(Map<String, Integer> map) {
        int longest = map.keySet().stream().mapToInt(noun -> noun.length()).max().orElse(0) + 1;

        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
           .forEachOrdered(x -> {
                String paddedWord = padRight(x.getKey(), longest);
                String stars = populateStars(x.getValue());
                System.out.println(paddedWord + "  " + stars);
           });
    }


    public static String padRight(String word, int length){
        if (word.length() >= length) {
            return word;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.append(":");

        while (sb.length() < length) {
            sb.append(' ');
        }

        return sb.toString();
    }

    public static String populateStars(int num){
        String stars = "";
        for(int i=0; i<num; i++)
            stars += "*";

        return stars;
    }
}