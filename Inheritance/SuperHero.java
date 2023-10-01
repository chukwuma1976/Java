package Inheritance;

public class SuperHero {
    public static void main(String[] args) {
        Hero wolverine = new Hero("Wolverine", "Logan", "Healing Factor", "retractable Adamantium claws");
        System.out.println(wolverine.generateProfile());
    }
}
