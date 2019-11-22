package exercise08;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people, pizzas, slices, slicesPerPerson, leftover;
        String output;

        System.out.print("How many people? ");
        people = scan.nextInt();

        System.out.print("How many pizzas do you have? ");
        pizzas = scan.nextInt();

        System.out.print("How many slices in a pizza? ");
        slices = scan.nextInt();

        scan.close();

        slicesPerPerson = (pizzas * slices) / people;
        leftover = (pizzas * slices) % people;

        output = String.format("\n%d people with %d pizzas"
            + "\nEach person gets %d piece(s) of pizza."
            + "\nThere are %d leftover pieces.", people, pizzas, slicesPerPerson, leftover);

        System.out.println(output);
    }
}

/*
EXAMPLE OUTPUT
-How many people? 8
-How many pizzas do you have? 2

- 8 people with 2 pizzas
- Each person gets 2 pieces of pizza.
- There are 0 leftover pieces.
*/