import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortingRecords {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("John", new ArrayList<String>(Arrays.asList("John", "Johnson", "Manager", "2016-12-31")));
        map.put("Tou", new ArrayList<String>(Arrays.asList("Tou", "Xiong", "Software Engineer", "2016-10-05")));
        map.put("Michaela", new ArrayList<String>(Arrays.asList("Michaela", "Michaelson", "District Manager", "2015-21-19")));
        map.put("Jake", new ArrayList<String>(Arrays.asList("Jake", "Jacobson", "Programmer", "")));
        map.put("Jacquelyn", new ArrayList<String>(Arrays.asList("Jacquelyn", "Jackson", "DBA", "")));
        map.put("Sally", new ArrayList<String>(Arrays.asList("Sally", "Weber", "Web Developer", "2015-12-18")));


        Comparator<Entry<String, ArrayList<String>>> valueComparator = new Comparator<Entry<String,ArrayList<String>>>() {
            
            @Override
            public int compare(Entry<String, ArrayList<String>> e1, Entry<String, ArrayList<String>> e2) {
                // 0 -> first name
                // 1 -> last name
                // 2 -> position
                // 3 -> Separation Date

                String v1 = e1.getValue().get(1);
                String v2 = e2.getValue().get(1);
                return v1.compareTo(v2);
            }
        };
        
        
        List<Entry<String, ArrayList<String>>> listOfEntries = new ArrayList<Entry<String, ArrayList<String>>>(map.entrySet());
        Collections.sort(listOfEntries, valueComparator);



        
        String output = "";
        for(int i=0; i< listOfEntries.size(); i++){
            String name = listOfEntries.get(i).getValue().get(0) + " " + listOfEntries.get(i).getValue().get(1);
            String position = listOfEntries.get(i).getValue().get(2);
            String date = listOfEntries.get(i).getValue().get(3);

            output += String.format("%-20s| %-18s| %s\n", name, position, date);
        }



        System.out.println("Name                | Position          | Separation date");
        System.out.println("--------------------|-------------------|-----------------");
        System.out.println(output);
        
    }
}
