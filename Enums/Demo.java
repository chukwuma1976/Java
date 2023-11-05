package Enums;

public class Demo {
    public static void main(String[] args) {
        CarFactory.displayCars();
        System.out.println();
        CarFactory.displayCarsAndStatus();
        System.out.println("\n \tOur Luxury Cars: ");
        CarFactory.displayLuxuryCars();
        System.out.println("\n \tOur Non Luxury Cars: ");
        CarFactory.displayNonLuxuryCars();
    }
}
