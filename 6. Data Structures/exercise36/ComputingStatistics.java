import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = getInput(scanner);
        int max = max(list);
        int min = min(list);
        double mean = mean(list);
        double standardDeviation = standardDeviation(list);


        System.out.println("Numbers: " + list.toString().replace("[", "").replace("]", ""));
        System.out.println("The average is " + mean);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", standardDeviation);


    }

    public static ArrayList<Integer> getInput(Scanner scanner){
        ArrayList<Integer> tempList = new ArrayList<>();

        while(true){
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if(input.equals("done"))
                break;

            if(input.matches("[a-zA-Z]+"))
                continue;
            
            int num = Integer.parseInt(input);
            tempList.add(num);
        }

        return tempList;
    }


    public static int min(ArrayList<Integer> list){
        int min = list.get(0);

        for(int num : list){
            if(num < min) min = num;
        }

        // return list.stream().mapToInt(x -> x).min().getAsInt();
        return min;
    }

    public static int max(ArrayList<Integer> list){
        int max = list.get(0);

        for(int num : list){
            if(num > max) max = num;
        }

        
        // return list.stream().mapToInt(x -> x).max().getAsInt();
        return max;
    }

    public static double mean(ArrayList<Integer> list){
        int sum = 0;

        for(int num : list){
            sum += num;
        }

        return (1.0 * sum) / list.size();
        // return list.stream().mapToInt(x -> x).average().getAsDouble();
    }

    public static double standardDeviation(ArrayList<Integer> list){
        double mean = mean(list);
        ArrayList<Integer> listOfSquares = new ArrayList<>();

        for(int num : list){
            listOfSquares.add((int)Math.pow((num - mean), 2));
        }


        double sum = 0;

        for(double num : listOfSquares){
            sum += num;
        }

        double meanOfSquares = sum / (listOfSquares.size()-1);
        
        return Math.sqrt(meanOfSquares);
    }
}
