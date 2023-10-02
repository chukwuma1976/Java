package Polymorphism;

public class Main {
    static public void main (String[] args){
        Hero batman = new Hero("Batman", "Bruce Wayne", "I'm rich", "Utility belt, bullet proof bat-suit");
        System.out.println("Batman instance method with no arguments");
        System.out.println(batman.generateProfile());
        System.out.println();
        System.out.println("Batman instance method with one argument.  This is method overloading");
        System.out.println(batman.generateProfile("I am vengeance, I'm Batman!"));

        System.out.println("==========================================================");
        SuperHero superman = new SuperHero("Superman", "Clark Kent", "Flight, Super strength, Invulnerability", "Heat vision");
        
        System.out.println("Superman instance with overridden method from parent class which prints and returns a value");
        superman.generateProfile("I believe in justice");
    }
}
