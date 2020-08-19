package exercise18;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" + 
                         "Press F to convert from Celsius to Fahreneheit.\n" +
                         "Your choice: ");
        String temperatureStr = scanner.nextLine().toUpperCase();
        int temperatureValue;

        if(temperatureStr.equals("F")){
            System.out.print("\nPlease enter the temperature in Celsius: ");
            temperatureValue = Integer.valueOf(scanner.nextLine());
            double temperature = (temperatureValue * 9.0 / 5.0) + 32;

            System.out.println("The temperature in Fahrenheit is " + temperature);
        }

        if(temperatureStr.equals("C")){
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            temperatureValue = Integer.valueOf(scanner.nextLine());
            double temperature = (temperatureValue - 32) * 5.0 / 9.0;

            System.out.println("The temperature in Celsius is " + temperature);
        }

        scanner.close();
    }
}