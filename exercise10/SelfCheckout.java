package exercise10;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 5.5;
        int item1, item2, item3;
        int qty1, qty2, qty3;

        System.out.print("Enter the price of item 1: ");
        item1 = scanner.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        qty1 = scanner.nextInt();

        System.out.print("Enter the price of item 2: ");
        item2 = scanner.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        qty2 = scanner.nextInt();

        System.out.print("Enter the price of item 3: ");
        item3 = scanner.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        qty3 = scanner.nextInt();

        scanner.close();


        double subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);
        double tax = subtotal * TAX_RATE / 100.0;
        double total = subtotal + tax;


        System.out.printf("Subtotal: €%.2f\n", subtotal);
        System.out.printf("Subtotal: €%.2f\n", tax);
        System.out.printf("Subtotal: €%.2f\n", total);
    }
}