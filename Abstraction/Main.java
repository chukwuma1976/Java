package Abstraction;

public class Main {
  public static void main(String[] args) {
    System.out.println("This is abstraction using an abstract class");
    DoctorChildClass doctorFromAbstractClass = new DoctorChildClass();
    doctorFromAbstractClass.printNameAndTitle("Alfred", "Whipple", "M.D.");
    doctorFromAbstractClass.printGreeting("Alfred", "Whipple", "M.D.");

    System.out.println();
    System.out.println("This is abstraction using an interface");
    Doctor doctorFromInterface = new Doctor();
    doctorFromInterface.printNameAndTitle("Thomas", "DeBakey", "M.D.");
    doctorFromInterface.printGreeting("Thomas", "DeBakey", "M.D.");
  }
}
