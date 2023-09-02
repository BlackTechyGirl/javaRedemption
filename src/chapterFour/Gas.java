package chapterFour;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Miles Driven or -1 to exit: ");
        int miles = input.nextInt();

        while (miles !=-1){
            System.out.println("Gallons or -1 to exit: ");
            int gallons = input.nextInt();

            double milesPerGallon = (double) miles/gallons;

            System.out.println("Miles per gallon for this trip: "+milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.println("Miles Driven or -1 to exit: ");
            miles = input.nextInt();
        }

        if(totalGallons > 0){
            double totalMpg = (double) totalMiles/totalGallons;
            System.out.println("Combined miles per gallon: "+totalMpg);
        }else {
            System.out.println("No data entered");
        }

        input.close();

    }
}
