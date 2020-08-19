package exercise22;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter the first number: ");
        num1 = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the second number: ");
        num2 = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the third number: ");
        num3 = Integer.valueOf(scanner.nextLine());
        
        scanner.close();

        int tempVariable;

        if(num1 > num2){
            tempVariable = num1;
        }else{
            tempVariable = num2;
        }


        if(num3 > tempVariable){
            tempVariable = num3;
        }

        System.out.println("The largest number is " + tempVariable);
    }
}