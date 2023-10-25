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
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println(sb.capacity());
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah);
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.charAt(15));
        System.out.println("Was it a car or a cat I saw?".substring(9, 12));

        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));
/*3*/   result.insert(1, original.charAt(4));
/*4*/   result.append(original.substring(1,4));
/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); 

        System.out.println(result);

        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi+mom);
        System.out.println(hi.concat(mom));
    }
}
