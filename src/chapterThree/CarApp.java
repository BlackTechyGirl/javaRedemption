package chapterThree;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car("toyota", "2022", 50000);
        Car car2 = new Car("honda", "2022", 70000);

        System.out.printf("Price of car1: %.2f%n", car1.getPrice());
        System.out.printf("Price of car2: %.2f%n", car2.getPrice());

        double discountCar1 = car1.getPrice()*(5.0/100);
        double discountCar2 = car2.getPrice()*(7.0/100);

        double priceCar1 = car1.getPrice() - discountCar1;
        double priceCar2 = car2.getPrice() - discountCar2;

        System.out.printf("Discount for car1: %.2f%n", priceCar1);
        System.out.printf("Discount for car2: %.2f", priceCar2);



//        System.out.println("enter your car model");
//        String model = input.nextLine();
//        car2.setModel(model);
//        System.out.printf("Model: %s", car2.getModel());
//        System.out.printf("The price of the car is %s%n", car.getPrice());


    }
}
