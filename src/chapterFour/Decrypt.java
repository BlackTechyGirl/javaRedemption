package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4 digit decryption number: ");
        int code = input.nextInt();

        int[] arrDigits = new int[4];


        if (code >= 1000 && code <= 9999) {
            System.out.println("Valid");

            int digit1 = code/1000;
            int digit2 = (code%1000)/100;
            int digit3 = (code%100)/10;
            int digit4 = code%10;

            int temp = digit1;
            digit1 = digit3;
            digit3 = temp;

            temp = digit2;
            digit2 = digit4;
            digit4 = temp;

            arrDigits[0] = digit1;
            arrDigits[1] = digit2;
            arrDigits[2] = digit3;
            arrDigits[3] = digit4;

            System.out.println(Arrays.toString(arrDigits));

            int[] result = new int[4];

            for (int i = 0; i < arrDigits.length; i++) {
                int calc = (arrDigits[i]*10) -7;
                result[i] = calc;
            }
            System.out.println(Arrays.toString(result));





        }else {
            System.out.println("Not 4 digits");
        }
    }
}
