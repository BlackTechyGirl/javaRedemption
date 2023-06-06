package chapterSix;

public class RoundingNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" -> "+ Math.floor(i+0.5));
        }




        for (int i = 0; i <10 ; i++) {
            double rounded = Math.floor(i);
            System.out.println(i+" -> "+rounded+" -> "+rounded/10+" -> "+rounded/100+" -> "+rounded/1000);
        }
    }

}
