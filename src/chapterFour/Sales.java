package chapterFour;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        display();
        double itemSold = input.nextDouble();

        double totalItemSold = 0;

        while (itemSold !=-1){
            totalItemSold+= itemSold;

            display();
            itemSold = input.nextDouble();
        }
        double earnings = 200 + (totalItemSold*0.09);

        System.out.println("Your Earnings for last week is: "+ earnings);
        input.close();
    }

    public static void display(){
        System.out.print("""
                Here are a list of items:
                1  - 239.99
                2  - 129.75
                3  - 99.95
                4  - 350.89
                
                Enter item sold or -1 to quit: \n
                """);
    }
}
