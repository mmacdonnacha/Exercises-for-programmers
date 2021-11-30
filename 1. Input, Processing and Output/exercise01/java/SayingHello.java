import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, outputMessage;

        System.out.print("What is your name ? ");
        name = scan.next();
        scan.close();

        outputMessage = String.format("Hello, %s, nice to meet you!", name);

        System.out.println(outputMessage);
    }
}