package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        int sum = number*number;

        if (number > 100 && sum > 100) System.out.println("Greater");
        if (number == 100 && sum == 100) System.out.println("Equal");
        if(number != 100 && sum != 100) System.out.println("Not equal");
        if (number < 100 && sum < 100) System.out.println("Lesser");
    }
}
