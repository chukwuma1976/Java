package Strings;

public class StringBuilderStuff {
    public static void main(String[] args) {
        StringBuilder theseNuts = new StringBuilder("These Nuts");
        System.out.format("The length of 'These Nuts In Your Face' is %d \n", theseNuts.length());
        System.out.format("The capacity is: %d \n", theseNuts.capacity());
        System.out.println(theseNuts.append(" In Your Face!"));
        System.out.println(theseNuts);
        System.out.println(theseNuts.deleteCharAt(23));
        System.out.println(theseNuts.append(" you stupid bitch!"));
        System.out.println(theseNuts.reverse());
    }
}
