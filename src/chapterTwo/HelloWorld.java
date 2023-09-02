package chapterTwo;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();//cleans up the input buffer
        int age1 = Integer.parseInt(input.nextLine());


        System.out.println("Language: ");
        String language = input.nextLine();

        input.close();

    }
}
