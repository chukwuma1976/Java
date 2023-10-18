package Overriding;

public class A {
    public void methodOne(int i) {
        System.out.println("This is methodOne in class A, an instance method. Number: " + i);
    }
    public void methodTwo(int i) {
        System.out.println("This is methodTwo in class A, an instance method. Number: " + i);
    }
    public static void methodThree(int i) {
        System.out.println("This is methodThree in class A, a static/class method. Number: "+ i);
    }
    public static void methodFour(int i) {
        System.out.println("This is methodFour in class A, a static/class method. Number: " + i);
    }
}
