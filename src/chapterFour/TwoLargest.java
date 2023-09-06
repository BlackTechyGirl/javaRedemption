package chapterFour;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int secondLargest = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println("number: ");
            int number = input.nextInt();
            if (number < largest && number > secondLargest) {
                secondLargest= number;
            }else {
                largest = number;
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
