package Strings;

import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine();
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println();
            System.out.format("The word you entered is \"%s\" and the number you entered is %d.\n", input, number);
            System.out.format("The text that you have entered has a length of %d.\n", input.length());
        }
        
    }
}
