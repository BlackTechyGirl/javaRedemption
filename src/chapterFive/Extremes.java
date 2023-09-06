package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many times: ");
        int times = input.nextInt();

//        int[] numbers = new int[times];

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <=times; i++) {
            int number = input.nextInt();
//            numbers[i] = number;
            if (number > maxNum){
                maxNum = number;
            }
            if (number < minNum){
                minNum = number;
            }
        }
        System.out.println("Max: "+maxNum);
        System.out.println("Min: "+minNum);

        System.out.println("Extremes: "+maxNum+minNum);


    }
}
