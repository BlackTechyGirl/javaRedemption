package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("number: ");
        int  number1 = input.nextInt();
        int number2 = input.nextInt();

        int squareNum1 = number1*number1;
        int squareNum2 = number2*number2;
        int sum = squareNum1 + squareNum2;
        int difference = squareNum1 - squareNum2;

        System.out.println("Square num1: " + squareNum1);
        System.out.println("Square num2: " + squareNum2);
        System.out.println("Sum: "+ sum);
        System.out.println("Difference: "+difference);
    }
}
