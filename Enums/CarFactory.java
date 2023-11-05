package Enums;

public class CarFactory {
    enum Car{
        Honda (false), Nissan(false), Toyota(false), Acura(true), Infiniti(true), Lexus(true);

        private boolean isLuxury;
        Car(){
            isLuxury = false;
        }

        Car(boolean isLuxury){
            this.isLuxury = isLuxury;
        }

        public boolean isLuxury() {
            return isLuxury;
        }

        public void setLuxury(boolean isLuxury) {
            this.isLuxury = isLuxury;
        }
        
    }

    public static void displayCars(){
        for (Car car: Car.values()) System.out.println(car);
    }

    public static void displayCarsAndStatus(){
        for (Car car: Car.values()) System.out.println(car + " is a luxury car: " + car.isLuxury());
    }

    public static void displayLuxuryCars(){
        for (Car car: Car.values()) 
            if (car.isLuxury()) System.out.println(car);
    }

    public static void displayNonLuxuryCars(){
        for (Car car: Car.values()) 
            if (!car.isLuxury()) System.out.println(car);
    }
}
