package chapterFour;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter=0;
        int largest = 0;
        for (counter = 0; counter < 10; counter++) {
            System.out.println("Enter number: ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;
            }
        }
        System.out.println("largest: "+ largest);
    }
}
