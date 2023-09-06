package chapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if (x == y) System.out.println(0);
        if (x>y) System.out.println(1);
        if (y>x)  System.out.println(-1);
    }
}
