package CharacterStuff;

import java.util.*;

public class CharMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a character: ");
                String input = scanner.nextLine();
                if (input.equals("exit")) break;
                if (input.length()>1){
                    System.out.println("This is more than one character");
                    continue;
                }
                System.out.println("You have entered this as a character: " + input);
                System.out.println();
                System.out.println("Is a letter: " + Character.isLetter(input.charAt(0)));
                System.out.println("Is a digit: " + Character.isDigit(input.charAt(0)));
                System.out.println("Is uppercase: " + Character.isUpperCase(input.charAt(0)));
                System.out.println("Is lowercase: " + Character.isLowerCase(input.charAt(0)));
                System.out.println("To uppercase: " + Character.toUpperCase(input.charAt(0)));
                System.out.println("To lowercase: " + Character.toLowerCase(input.charAt(0)));
                System.out.println("Is a whitespace: " + Character.isWhitespace(input.charAt(0)));
                System.out.println();
                System.out.println("***********************************************************");
                System.out.println();
            }
        }
    }
}
