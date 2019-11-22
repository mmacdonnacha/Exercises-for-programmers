package exercise04;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noun, verb, adjective, adverb; 
        String story = "Do you VERB your ADJECTIVE NOUN ADVERB? That's hilarious!";

        System.out.print("Enter a noun: ");
        noun = scan.nextLine();

        System.out.print("Enter a verb: ");
        verb = scan.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = scan.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = scan.nextLine();

        scan.close();

        story = story.replace("NOUN", noun)
                     .replace("ADVERB", adverb)
                     .replace("VERB", verb)
                     .replace("ADJECTIVE", adjective);
                     

        System.out.println(story);


    }
}