import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int c =0;
//        int thisIsAVariable =0;
//        int q76354 = 0;
//        int number =0;
//
//        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
//        int value = input.nextInt();

//        System.out.println("This is a Java program");
//        System.out.printf("%s%n%s", "This is a Java", "program");

//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//
//        if(number!= 7) System.out.println("This number is not equal to seven");
//
//        this program will calculate the product of three integers
        System.out.println("Enter the first number: ");
        int x = input.nextInt();

        System.out.println("Enter a second number: ");
        int y = input.nextInt();

        System.out.println("Enter a third number: ");
        int z = input.nextInt();

        int result = x*y*z;

        System.out.printf("%s%d", "The product is ", result);

    }
}