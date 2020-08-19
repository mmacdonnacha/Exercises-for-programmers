package exercise09;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CONVERSION_RATE = 350;
        int length, width, area, tinsOfPaint;
        String output;

        System.out.print("What is the length of the room in feet? ");
        length = scan.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = scan.nextInt();

        scan.close();

        area = length * width;
        tinsOfPaint = (int)Math.ceil( ((double)area) / CONVERSION_RATE );

        output = String.format("\nYou will need to puchase %d gallons of paint to cover %d square feet.",
            tinsOfPaint, area);

        System.out.println(output);
    }
}