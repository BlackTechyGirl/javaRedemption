package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;
        int balance;
        int totalCharged;
        int credits;
        int allowedCredits;

        System.out.println("Account number: ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.println("Balance at the beginning of the month: ");
            balance = input.nextInt();
            System.out.println("Total of all items charged ny the customer this month: ");
            totalCharged = input.nextInt();
            System.out.println("Total of all credits applied to the customer's account this month: ");
            credits = input.nextInt();
            System.out.println("Allowed credits limit: ");
            allowedCredits = input.nextInt();

            int newBalance = balance + totalCharged - credits;
            System.out.println("New Balance: " + newBalance);

            if (newBalance > allowedCredits) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println("Account number: ");
            accountNumber = input.nextInt();
        }
        input.close();
    }
}
