package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Balance at the beginning of the month: ");
        int balance = input.nextInt();
        System.out.println("Total of all items charged ny the customer this month: ");
        int totalCharged = input.nextInt();
        System.out.println("Total of all credits applied to the customer's account this month: ");
        int credits = input.nextInt();
        System.out.println("Allowed credits limit: ");
        int allowedCredits = input.nextInt();

        int newBalance = balance+totalCharged-credits;
        System.out.println("New Balance: "+newBalance);

        if(newBalance>allowedCredits){
            System.out.println("Credit limit exceeded");
        }
    }
}
