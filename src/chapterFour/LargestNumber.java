package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 0;
        int largest = 0;
        int secondLargest = 0;
        Scanner input = new Scanner(System.in);


        while (counter< 10) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            input.nextLine();

            if(number>largest){
                secondLargest= largest;
                largest = number;
            }
            else if(number>secondLargest) secondLargest=number;
            counter++;
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second: "+secondLargest);
    }
}
