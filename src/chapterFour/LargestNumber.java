package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (counter< 9) {
            if(number>largest) largest = number;
            counter++;
            System.out.println("Enter a number: ");
            number = input.nextInt();
        }
        System.out.println("Largest: "+largest);
    }
}
