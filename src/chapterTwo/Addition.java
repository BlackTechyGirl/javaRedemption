package chapterTwo;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 =input.nextInt();

        System.out.print("Enter second number: ");
        int number2 =input.nextInt();

        int sum =number1 +number2;

        System.out.printf("Sum is %d %d%n", sum, (number2+number1));
    }
}