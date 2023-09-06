package chapterFour;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double base = 30000;
        double taxBase = 15*100;
        double additionalTax = 20*100;

        for (int i = 0; i <3; i++) {
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Earnings: ");
            double earnings = input.nextDouble();
            input.nextLine();

            if(earnings<=base){
                double actualTaxRate = base * taxBase;
                total+=actualTaxRate;
            }else {
                double additional = earnings - base;
                double additionalTaxRate = additional * additionalTax;
                double actualTaxRate = base * taxBase + additionalTaxRate;
                total += actualTaxRate;
            }
        }
        System.out.println("Total: " + total);
    }
}
