package chapterFive;

public class Summation {
    public static void main(String[] args) {

        System.out.printf("%s%8s%n", "n", "sum");
//        formula for the sum of an arithmetic series: Sum = (n * (n + 1)) / 2
        for (int n = 1; n <= 100; n++) {
            long summation = (n * (n + 1)) / 2;
            System.out.println(n + "\t" + summation);
        }

        long product = 0;
        for (int n = 1; n <= 100 ; n++) {
            product*=n;
            System.out.printf("%d%6d%n", n, product);
        }
    }
}
