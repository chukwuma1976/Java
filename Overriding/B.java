package Overriding;

public class B extends A{
    public void methodOne(int i) {
        System.out.println("This is methodOne in class B, an instance method. Number: " + i);
    }
    public void methodTwo(int i) {
        System.out.println("This is methodTwo in class B, an instance method. Number: " + i);
    }
    public static void methodThree(int i) {
        System.out.println("This is methodThree in class B, a static/class method. Number: "+ i 
        + ". I hide static methodThree in class A");
    }
    public static void methodFour(int i) {
        System.out.println("This is methodFour in class B, a static/class method. Number: " + i
        + ". I hide static methodFour in class A");
    }
}
