package Abstraction;

public class DoctorChildClass extends DoctorAbstractClass {
    public void printNameAndTitle(String firstName, String lastName, String title){
        System.out.println(firstName + " " + lastName + " " + title);
    }
    public void printGreeting(String firstName, String lastName, String title){
        System.out.println("My name is " + firstName + " " + lastName + " " + title + ".  How may I help you?");
    }        
}
