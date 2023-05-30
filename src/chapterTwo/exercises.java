package chapterTwo;

import java.util.Arrays;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
//        this program performs a simple payroll calculation
//        System.out.println("Enter an integer: ");
//        int b = 6;
//        int c= 4;
//        int a = b*c;
//        System.out.println("1 2 3 4");
//        System.out.print("1 2 3 4\n");
//        System.out.printf("%d %d %d %d", 1,2,3,4);

        Scanner input = new Scanner(System.in);
//        2.15
//        System.out.println("Enter the first number: ");
//        int a = input.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = input.nextInt();
//
//        int squareA = a*a;
//        int squareB = b*b;
//        int sum = squareA + squareB;
//        int difference = squareA-squareB;
//
//        System.out.println("The square of the first number is:  "+squareA);
//        System.out.println("The square of the second number is: "+squareB);
//        System.out.println("The sum of their squares is: "+sum);
//        System.out.println("The difference of their squares is: "+difference);

//        2.16
//        System.out.println("Enter an integer: ");
//        int integer = input.nextInt();
//
//        int square = integer*integer;
//        if(integer>100) System.out.println("The number is greater than 100");
//        if(square>100) System.out.println("The square is greater than 100");
//        if(integer==100) System.out.println("The number is equal to 100");
//        if(square==100) System.out.println("The square is equal to 100");
//        if(integer!=100) System.out.println("The number is not equal to 100");
//        if(square!=100) System.out.println("The square is not equal to 100");
//        if(integer<100) System.out.println("The number is less than 100");
//        if(square<100) System.out.println("The number is less than 100");

//        2.17
//        System.out.println("first num: ");
//        int first = input.nextInt();
//        System.out.println("second num: ");
//        int second = input.nextInt();
//        System.out.println("third num: ");
//        int third = input.nextInt();
//
//        int sum = first+second+third;
//        System.out.println("the sum is: "+sum);
//
//        int average = sum/3;
//        System.out.println("the average is: "+average);
//
//        int product = first*second*third;
//        System.out.println("the product is: "+product);
//
//
//        if(first<second && first<third) System.out.println("the first number is the smallest ");
//        if(second<first && second<third) System.out.println("the second number is the smallest");
//        if(third<first && third<second) System.out.println("the third number is the smallest");
//
//        if(first>second && first>third) System.out.println("the first number is the largest ");
//        if(second>first && second>third) System.out.println("the second number is the largest");
//        if(third>first && third>second) System.out.println("the third number is the largest");

//        2.19
//        System.out.printf(" ****%n ******%n*******%n ******%n ****%n");
//        System.out.println();
//
//        System.out.println("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("**");
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("***");
//        System.out.print("*****");
//        System.out.print("****");
//        System.out.println("**");
//
//        System.out.println();
//        System.out.print("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.print("****");
//        System.out.println("**");
//        System.out.println();
//
//        System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", " *");

//        2.24
//        System.out.println("First: ");
//        int first = input.nextInt();
//        System.out.println("Second: ");
//        int second = input.nextInt();
//        System.out.println("Third: ");
//        int third = input.nextInt();
//        System.out.println("Fourth: ");
//        int fourth = input.nextInt();
//        System.out.println("Fifth: ");
//        int fifth = input.nextInt();
//
//        int max = Math.max(fifth, Math.max(fourth, Math.max(third, Math.max(second, first))));
//        int min = Math.min(fifth, Math.min(fourth, Math.min(third, Math.min(second, first))));
//
//        System.out.println("The max: "+max);
//        System.out.println("The min: "+min);

//        2.25
//        System.out.println("Ënter a number: ");
//        int number=input.nextInt();
//        if(number%3==0) System.out.println("The number is divisible by 3");

//        2.26
//        System.out.println("first: ");
//        int first=input.nextInt();
//        System.out.println("second: ");
//        int second=input.nextInt();
//
//        int firstTripled=first*first*first;
//        int secondDoubled=second*second;
//
//        if(firstTripled%secondDoubled ==0) System.out.println("Yes it is");

//        2.27
//        System.out.println("* * * * * * * *");
//        System.out.println(" * * * * * * * *");
//        System.out.println("* * * * * * * *");
//        System.out.println(" * * * * * * * *");
//        System.out.println("* * * * * * * *");
//        System.out.println(" * * * * * * * *");
//        System.out.println("* * * * * * * *");
//        System.out.println(" * * * * * * * *");

//        2.28
//        System.out.println("radius: ");
//        float radius = input.nextFloat();
//
//        System.out.printf("diameter: %.2f%n", radius*radius);
//        System.out.printf("circumference: %.2f%n", (2*(Math.PI)*radius));
//        System.out.printf("area: %.2f%n", (Math.PI*(radius*radius)));

//        2.29
//        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
//        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
//        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
//        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
//        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
//        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
//        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
//        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
//        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
//        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
//        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
//        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
//        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
//        System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));

//        2.30
//        System.out.println("enter one number consisting of 5 digits: ");
//        int digit = input.nextInt();
//
//        int first = digit/10000;
//        int second = (digit%10000)/1000;
//        int third = ((digit%10000)%1000)/100;
//        int fourth =(((digit%10000)%1000)%100)/10;
//        int fifth = (((digit%10000)%1000)%100)%10;
//        System.out.println(first + "   " + second + "   " + third + "   " + fourth + "   " + fifth);

//        2.31
//        System.out.println("number  square  cube");
//        System.out.printf("0 %8d%8d%n",(0),(0));
//        System.out.printf("1 %8d%8d%n",(1),(1));
//        System.out.printf("2 %8d%8d%n",(2*2),(2*2*2));
//        System.out.printf("3 %8d%8d%n",(3*3),(3*3*3));
//        System.out.printf("4 %8d%8d%n",(4*4),(4*4*4));
//        System.out.printf("5 %8d%8d%n",(5*5),(5*5*5));
//        System.out.printf("6 %8d%8d%n",(6*6),(6*6*6));
//        System.out.printf("7 %8d%8d5%n",(7*7),(7*7*7));
//        System.out.printf("8 %8d%8d%n",(8*8),(8*8*8));
//        System.out.printf("9 %8d%8d%n",(9*9),(9*9*9));
//        System.out.printf("10 %8d%8d%n",(10*10),(10*10*10));

//        2.32
//        System.out.println("first: ");
//        int first =input.nextInt();
//        if(first<0) System.out.println("negative");
//        if(first>0) System.out.println("positive");
//        if(first==0) System.out.println("zero");
//
//        System.out.println("second: ");
//        int second =input.nextInt();
//        if(second<0) System.out.println("negative");
//        if(second>0) System.out.println("positive");
//        if(second==0) System.out.println("zero");
//
//        System.out.println("third: ");
//        int third =input.nextInt();
//        if(third<0) System.out.println("negative");
//        if(third>0) System.out.println("positive");
//        if(third==0) System.out.println("zero");
//
//        System.out.println("fourth: ");
//        int fourth =input.nextInt();
//        if(fourth<0) System.out.println("negative");
//        if(fourth>0) System.out.println("positive");
//        if(fourth==0) System.out.println("zero");
//
//        System.out.println("fifth: ");
//        int fifth =input.nextInt();
//        if(fifth<0) System.out.println("negative");
//        if(fifth>0) System.out.println("positive");
//        if(fifth==0) System.out.println("zero");

//        2.33
//        BMI
        System.out.println("weight in kg: ");
        float weight = input.nextInt();
        System.out.println("height in meters: ");
        float height = input.nextInt();

        float bmi = weight/(height*height);
    }
}
