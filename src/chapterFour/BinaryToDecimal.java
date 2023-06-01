package chapterFour;

import java.util.Scanner;

public class BinaryToDecimal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a binary integer: ");
            String binaryString = input.nextLine();

            int decimal = 0;
            int base = 1;

            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digitChar = binaryString.charAt(i);
                int digit = Character.getNumericValue(digitChar);

                decimal += digit * base;
                base *= 2;
            }

            System.out.println("Decimal equivalent: " + decimal);

            input.close();
        }
}

