package chapterTwo;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();
        input.nextLine();

        System.out.println("""
                What operation would you like to perform?
                The operations include:
                Addition
                Subtraction
                Multiplication
                Division
                Remainder
                """);
        String operation = input.nextLine();

//        if(operation.equals("addition")) System.out.printf("%.2f + %.2f%n = %.2f", number1, number2, (number1+number2));
//        else if(operation.equals("subtraction")) System.out.printf("%.2f - %.2f%n = %.2f%n", number1, number2, (number1-number2));
//        else if(operation.equals("multiplication")) System.out.printf("%.2f * %.2f%n = %.2f%n", number1, number2, (number1*number2));
//        else if(operation.equals("division")) System.out.printf("%.2f / %.2f%n = %.2f%n", number1, number2, (number1/number2));
//        else if(operation.equals("remainder")) System.out.printf("%.2f Remainder %.2f%n = %.2f%n", number1, number2, (number1%number2));
//        else System.out.println("Wrong input");
        switch (operation){
            case "Addition":
                System.out.printf("%.2f + %.2f%n = %.2f", number1, number2, (number1+number2));
                break;
            case "Subtraction":
                System.out.printf("%.2f - %.2f%n = %.2f%n", number1, number2, (number1-number2));
                break;
            case "Multiplication":
                System.out.printf("%.2f * %.2f%n = %.2f%n", number1, number2, (number1*number2));
                break;
            case "Division":
                if (number2 == 0) System.out.println("Cannot divide by zero1");
                System.out.printf("%.2f / %.2f%n = %.2f%n", number1, number2, (number1/number2));
                break;

            default:
                System.out.println("Invalid input");


        }

        System.out.println("Thank you for using my calculator");

        input.close();
    }
}


