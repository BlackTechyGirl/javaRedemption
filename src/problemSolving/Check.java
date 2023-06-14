package problemSolving;

import java.security.SecureRandom;

public class Check {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt(6);
        if (number%2 == 0) {
            System.out.println(number+" even");
        }
        else {
            System.out.println(number+" odd");
        }
    }

}
