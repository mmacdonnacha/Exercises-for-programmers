package exercise05;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input, output;
        int firstNumber, secondNumber;
        int addition, substitution, multiplication, division;

        System.out.print("What is the first number? ");
        input = scan.nextLine();
        firstNumber = Integer.parseInt(input);

        System.out.print("What is the second number? ");
        input = scan.nextLine();
        secondNumber = Integer.parseInt(input);

        scan.close();

        addition  = firstNumber + secondNumber;
        substitution  = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division  = firstNumber / secondNumber;


        output = String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", 
                                firstNumber, secondNumber, addition,
                                firstNumber, secondNumber, substitution,
                                firstNumber, secondNumber, multiplication,
                                firstNumber, secondNumber, division);


        System.out.println(output);
    }
}