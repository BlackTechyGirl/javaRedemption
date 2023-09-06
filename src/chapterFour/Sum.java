package chapterFour;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
//        int counter = 0;
        int sum = 0;
        while (sum < num){
            System.out.println("Enter a number: ");
            int value = in.nextInt();

            sum+=value;
//            counter++;
            System.out.println("Sum: "+sum);
        }

    }
}
