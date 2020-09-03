 package exercise03;

 import java.util.Scanner;

 public class PrintingQuotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String quote, author, outputMessage;

        System.out.print("What is the quote? ");
        quote = scan.nextLine();

        System.out.print("Who said it? ");
        author = scan.nextLine();

        scan.close();

        outputMessage = String.format("%s says, \"%s\"", author, quote);

        System.out.println(outputMessage);
    }
}