package exercise07;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        final float CONVERSION_FACTOR = 0.09290304f;
        Scanner scan = new Scanner(System.in);
        int length, width, areaFeet;
        float areaMeters;
        String output;

        System.out.print("What is the length of the room in feet? ");
        length = scan.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = scan.nextInt();

        scan.close();

        areaFeet = length * width;
        areaMeters = areaFeet * CONVERSION_FACTOR;
        //m^2 = f^2 * 0.09290304

        output = String.format("You entered dimensions of %d feet by %d feet." 
            + "\nThe area is \n%d square feet\n%.3f square meters.", 
            length, width, areaFeet, areaMeters);

        System.out.print(output);
    }
}