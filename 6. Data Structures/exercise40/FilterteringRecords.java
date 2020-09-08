import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FilterteringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("John", new ArrayList<String>(Arrays.asList("John", "Johnson", "Manager", "2016-12-31")));
        map.put("Tou", new ArrayList<String>(Arrays.asList("Tou", "Xiong", "Software Engineer", "2016-10-05")));
        map.put("Michaela", new ArrayList<String>(Arrays.asList("Michaela", "Michaelson", "District Manager", "2015-21-19")));
        map.put("Jake", new ArrayList<String>(Arrays.asList("Jake", "Jacobson", "Programmer", "")));
        map.put("Jacquelyn", new ArrayList<String>(Arrays.asList("Jacquelyn", "Jackson", "DBA", "")));
        map.put("Sally", new ArrayList<String>(Arrays.asList("Sally", "Weber", "Web Developer", "2015-12-18")));

        System.out.print("Enter a string to search:  ");
        String search = scanner.nextLine();
        scanner.close();


        
        String output = "";
        for(String key : map.keySet()){
            if(map.get(key).get(1).contains(search)){
                String name = map.get(key).get(0) + " " + map.get(key).get(1);
                String position = map.get(key).get(2);
                String date = map.get(key).get(3);
                
                output += String.format("%-20s| %-18s| %s\n", name, position, date);
            }
        }

        System.out.println("\nResults: ");
        System.out.println("Name                | Position          | Separation date");
        System.out.println("--------------------|-------------------|-----------------");
        System.out.println(output);

    }
}
