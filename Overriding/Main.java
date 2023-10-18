package Overriding;

public class Main {
    public static void main(String[] args) {
        A thisIsA = new A();
        B thisIsB = new B();

        System.out.println("This is class A");
        thisIsA.methodOne(1);
        thisIsA.methodOne(2);
        A.methodThree(3);
        A.methodFour(4);
        System.out.println();

        System.out.println("This is class B which inherits from class A and overrides or hides class A methods");
        thisIsB.methodOne(1);
        thisIsB.methodOne(2);
        B.methodThree(3);
        B.methodFour(4);

    }
}
