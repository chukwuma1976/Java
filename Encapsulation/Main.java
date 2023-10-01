package Encapsulation;

public class Main {
    public static void main(String[] args){
        Profile billie = new Profile("Billie", "Jean", 37, "billie@gmail.com");
        System.out.println("This is after instantiation.");
        System.out.println("First name: " + billie.getFirstName());
        System.out.println("Last name: " + billie.getLastName());
        System.out.println("Age: " + billie.getAge());
        System.out.println("Email address: " + billie.getEmail());

        billie.setAge(38);
        billie.setLastName("Gene");
        System.out.println();
        System.out.println("After changing age and last name.");
        System.out.println("First name: " + billie.getFirstName());
        System.out.println("Last name: " + billie.getLastName());
        System.out.println("Age: " + billie.getAge());
        System.out.println("Email address: " + billie.getEmail());
    }
}
