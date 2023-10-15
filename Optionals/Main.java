package Optionals;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type something: ");
            String inputted = scanner.nextLine();
            if (inputted.isEmpty()) inputted = null;
            Optional<String> input = Optional.ofNullable(inputted);

            System.out.println();
            System.out.println("Using Optionals methods isPresent and isEmpty which are boolean");
            System.out.println("Value is present: " + input.isPresent());
            System.out.println("Value is empty: "+input.isEmpty());

            System.out.println();
            System.out.println("Using Optionals methods orElse to return default value");
            System.out.println(input.orElse("For not entering a value: These nuts in your face"));

            System.out.println();
            System.out.println("Using Optionals method ifPresent");
            input.ifPresent(str->System.out.println(str.toUpperCase()));

            System.out.println();
            System.out.println("Using Optionals method ifPresentOrElse");
            input.ifPresentOrElse(str->System.out.println(str.toUpperCase()), 
                ()->System.out.println("These nuts in your face"));
        }
    }
}
