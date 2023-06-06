package chapterSix;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter the hours parked for customer " + i + ": ");
            int hoursParked = scanner.nextInt();
            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Customer %d: $%.2f%n", i, charge);
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
    }

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
