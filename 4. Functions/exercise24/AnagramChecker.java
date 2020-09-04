import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine().toLowerCase().trim();

        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine().toLowerCase().trim();

        scanner.close();

        if(isAnagram(word1, word2)){
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        }else{
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }

        char[] first = firstWord.toCharArray();

        for(char c : first){
            if(secondWord.contains("" + c)){
                secondWord = secondWord.replaceFirst("" + c, "");
            }else{
                return false;
            }
        }

        if(secondWord.isEmpty()){
            return true;
        }

        return false;
    }

    public static boolean isAnagramAlternative(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }

        char[] firstArray  = firstWord.toCharArray();
        char[] secondArray = secondWord.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        
        return Arrays.equals(firstArray, secondArray);
    }
}