package chapterFour;

public class Tabular {
    public static void main(String[] args) {
        System.out.printf("%s%8s%8s%8s%n", "N","N2","N3","N4");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("%-7d%-8d%-10d%-9d%n", i,i*i,i*i*i,i*i*i*i);
                break;
            }
        }
    }
}
