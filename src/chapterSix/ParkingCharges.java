package chapterSix;

import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(int hours) {
        double minimumFee = 2.00;
        double additionalFee = 0.5;
        double maximumFee = 10.0;

        double parkingCharge = 0;

        if (hours <= 3) {
           return parkingCharge = minimumFee;
        } else if (hours <= 24) {
            int additionalHours = hours - 3;
            double additionalCharges = additionalHours * 0.5;
            return Math.min(minimumFee+additionalCharges, maximumFee);
        }
        return maximumFee;

    }

}
