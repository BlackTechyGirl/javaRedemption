package chapterTwo;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("sum: " + (num1+num2+num3));
        System.out.println("Product: " + (num1*num2*num3));
        System.out.println("Average: " + (num1+num2+num3)/3);
        System.out.println("Largest: " + Math.max(Math.max(num1, num2),num3));
        System.out.println("Smallest: " + Math.min(Math.min(num1,num2),num3));
    }
}
