package chapterFour;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of terms: ");
        int n = input.nextInt();
        double factorial = 1;
        double e = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            double terms = 1/factorial;
            e+=terms;
        }
        System.out.println(e);

        System.out.println("Number of terms: ");
        int n2 = input.nextInt();

        System.out.println("Value of x: ");
        int x = input.nextInt();

        for (int i = 1; i < n; i++) {
            factorial *= i;
//            int term = x**i/;
        }




        input.close();
    }

}
