package chapterFour;

public class Astericks {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i%2 == 0) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 8; j++) {
                System.out.print("* ");
                if (i%2 == 1) {
                    System.out.print("");
                }
            }
            System.out.println();


        }
    }
}
