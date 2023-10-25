package Strings;

import java.util.Scanner;

public class PalindromeWithStringBuilder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.print("Please enter some text to see if it is a palindrome or 'exit' to stop:  ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit"))break;
                System.out.println();
                StringBuilder inputBuilder = new StringBuilder(input);
                if (input.equalsIgnoreCase(inputBuilder.reverse().toString()))
                    System.out.println("\tThis is a palindrome");
                    else System.out.println("\tThis is not a palindrome");  
                System.out.println();             
            }
        }
    }

}
