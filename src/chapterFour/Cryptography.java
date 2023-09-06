package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digits: ");
        String digits = input.nextLine();

        int[] arrDigits = new int[4];


        if (digits.length()==4 && digits.matches("\\d+")) {
            System.out.println("You've entered a valid 4 digits");
            int myDigit = Integer.parseInt(digits);
            int digit1 = myDigit/1000;
            int digit2 = (myDigit%1000)/100;
            int digit3 = (myDigit%100)/10;
            int digit4 = myDigit%10;

            arrDigits[0] = digit1;
            arrDigits[1] = digit2;
            arrDigits[2] = digit3;
            arrDigits[3] = digit4;

            System.out.println(Arrays.toString(arrDigits));

            int [] result = new int[4];

            for (int i=0; i<arrDigits.length; i++) {
                int calc = (arrDigits[i] + 7) % 10;
                System.out.println(calc);
                result[i] = calc;
            }
            System.out.println(Arrays.toString(result));

            int temp = result[0];
            result[0] = result[2];
            result[2] = temp;

            temp = result[1];
            result[1] = result[3];
            result[3] = temp;

            int encrypted = result[0]*1000 + result[1]*100 + result[2]*10 + result[3];
            System.out.println(encrypted);


        }else{
            System.out.println("invalid number.Enter a 4 digit number: ");
        }
    }
}
