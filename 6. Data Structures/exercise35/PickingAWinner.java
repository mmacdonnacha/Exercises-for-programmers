import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class PickingAWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contestants = getContestants(scanner);
        String winner = getWinner(contestants);

        System.out.println("The winner is... " + winner);
    }

    public static ArrayList<String> getContestants(Scanner scanner){
        ArrayList<String> tempList = new ArrayList<>();
                
        while(true){
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if(name.isEmpty())
                break;

            tempList.add(name);
        }

        return tempList;
    }

    public static String getWinner(ArrayList<String> list){
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        return list.get(randomNumber);
    }
}
