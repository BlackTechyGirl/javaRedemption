package problemSolving;

import java.security.SecureRandom;

public class Largest {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(10);

        int largest = Math.max(number1, Math.max(number2, number3));

        System.out.println(number1+" "+number2+" "+number3);
        System.out.println(largest);
    }
}
