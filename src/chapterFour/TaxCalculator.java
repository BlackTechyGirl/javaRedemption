package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double baseTaxRate = 0.15;
        double additionalRate = 0.20;
        double minimum = 30_000;



        while (counter<3){
            counter++;
            System.out.println("Name : ");
            String name = input.nextLine();
            System.out.println("Earnings: ");
            double earning = input.nextDouble();
            input.nextLine();

            if (earning<= minimum) {
                double taxRate = earning-minimum*baseTaxRate;
                System.out.println("The total tax for "+name+" is "+taxRate);
            }else {
                double taxRate = minimum*baseTaxRate+(earning-minimum)*additionalRate;
                System.out.println("The total tax for "+name+" is "+taxRate);
            }



        }

    }
}
