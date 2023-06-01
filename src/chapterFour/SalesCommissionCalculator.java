package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalItemsSold = 0;

        System.out.println("Item sold or -1 to quit: ");
        int itemSold = input.nextInt();

        while (itemSold!=-1){
            if(itemSold == 1) totalItemsSold+=239.99;
            else if(itemSold==2) totalItemsSold+=129.75;
            else if(itemSold==3) totalItemsSold+=99.95;
            else if(itemSold==4) totalItemsSold+=350.89;

            System.out.println("Item sold or -1 to quit: ");
            itemSold = input.nextInt();
        }

        double ninePercent =((totalItemsSold*9)/100);
        double weeklyEarnings = 200 + ninePercent;
        System.out.println("Your weekly earnings is: " + weeklyEarnings);
    }
}
