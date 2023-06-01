package chapterFour;

import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a five-digit integer: ");
            int number = input.nextInt();
            input.nextLine(); // consume the newline character

            if (number < 10000 || number > 99999) {
                System.out.println("Invalid input. The number must be five digits long.");
            } else {
                int originalNumber = number;
                int reversedNumber = 0;

                while (number > 0) {
                    int digit = number % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    number /= 10;
                }

                if (originalNumber == reversedNumber) {
                    System.out.println("The number is a palindrome.");
                } else {
                    System.out.println("The number is not a palindrome.");
                }
            }

            input.close();
        }
}
