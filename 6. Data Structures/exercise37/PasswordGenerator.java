import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        ArrayList<String> specials = new ArrayList<>(Arrays.asList("!","$","%","&","@","#","?"));
        
        String password = "";
        int specialCount = 0;
        int numberCount = 0;


        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("How many special characters? ");
        int amountOfSpecials = Integer.parseInt(scanner.nextLine());
        System.out.print("How many numbers? ");
        int amountOfNumbers = Integer.parseInt(scanner.nextLine());
        scanner.close();


        while(password.length() <= length){
            int randomChoice = rand.nextInt(3);

            if(randomChoice == 0){
                // password = addLetter(letters, password);
                password = generatePassword(letters, password);
            }else if((randomChoice == 1) && (specialCount < amountOfSpecials) ){
                // password = addSpecial(specials, password);
                password = generatePassword(specials, password);
                specialCount++;
            }else if((randomChoice == 2) && (numberCount < amountOfNumbers) ){
                // password = addNumber(numbers, password);
                password = generatePassword(numbers, password);
                numberCount++;
            }
        }

        System.out.println("You password is \n" + password);


    }

    public static String generatePassword(ArrayList<String> list, String password) {
        Random random = new Random();

        int index = random.nextInt(list.size());
        String character = list.get(index);
        list.remove(character);

        password += character;

        return password;
    }


    // public static String addLetter(ArrayList<String> letters, String password) {
    //     Random random = new Random();

    //     int index = random.nextInt(letters.size());
    //     String character = letters.get(index);
    //     letters.remove(character);

    //     password += character;

    //     return password;
    // }

    // public static String addNumber(ArrayList<String> numbers, String password) {
    //     Random random = new Random();

    //     int index = random.nextInt(numbers.size());
    //     String num = numbers.get(index);
    //     numbers.remove(num);

    //     password += num;

    //     return password;
    // }


    // public static String addSpecial(ArrayList<String> specials, String password) {
    //     Random random = new Random();

    //     int index = random.nextInt(specials.size());
    //     String spec = specials.get(index);
    //     specials.remove(spec);

    //     password += spec;

    //     return password;
    // }
}
