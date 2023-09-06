package chapterFive;

public class Divisibleby3 {
    public static void main(String[] args) {

        int counter = 1;
        int sum = 0;
        while (counter<=30){
            if (counter%3 == 0){
                sum+=counter;
            }
            counter++;
        }
        System.out.println(sum);
    }
}
