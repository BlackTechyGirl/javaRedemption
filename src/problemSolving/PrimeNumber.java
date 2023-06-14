package problemSolving;

import java.security.SecureRandom;

public class PrimeNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt(10);
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        }else {
            System.out.println(number+ " is not prime");
        }

    }
    public static boolean isPrime(int number){
        if (number<=1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i ==0) return false;
        }
        return true;
    }
}
