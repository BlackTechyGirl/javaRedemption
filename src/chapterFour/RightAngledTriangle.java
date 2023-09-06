package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Base length: ");
//        int base = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
