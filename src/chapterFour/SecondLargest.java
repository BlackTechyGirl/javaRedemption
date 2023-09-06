package chapterFour;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int largest = 0;
        int secondLargest = 0;
        int i;

        for (i = 0; i <=10; i++) {
            if(i > largest) {
                secondLargest = largest;
                largest = i;
            }else{
                largest = i;
            }
            System.out.println(i);
        }
        System.out.println("Largest: "+largest);
        System.out.println("SecondLargest: "+secondLargest);
    }
}
