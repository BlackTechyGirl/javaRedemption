package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalMilesPerGallon =0;

        System.out.println("Miles driven or -1 to quit: ");
        int milesDriven = input.nextInt();
        System.out.println("Gallons used or -1 to quit: ");
        int gallonsUsed = input.nextInt();

        while (milesDriven != -1 && gallonsUsed!=-1) {
            double milesPerGallon =  (double) milesDriven/gallonsUsed;
            totalMilesPerGallon+=milesPerGallon;

            System.out.println("Miles driven or -1 to quit: ");
            milesDriven = input.nextInt();
            System.out.println("Gallons used or -1 to quit: ");
            gallonsUsed = input.nextInt();
        }
        System.out.println("Total miles per gallon is " + totalMilesPerGallon);
    }
}
