package Strings;

import java.util.Scanner;

public class Main {
    static public void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("these nuts".concat(" in your face."));
                System.out.println("Please enter a number below to use a string method.");
                System.out.println("Enter 1 to convert a number to a string.");
                System.out.println("Enter 2 to convert a string to a number.");
                System.out.println("Enter 3 to test if a string is a palindrome.");
                System.out.println("Enter 4 to compare two strings.");
                System.out.println("Enter 5 to compare return a substring.");
                System.out.println("Enter 6 to replace underscores with spaces.");
                System.out.print("Enter 7 to remove white spaces from a string.  ");
                int choice = scanner.nextInt();
                System.out.println();
                switch(choice){
                    case 1: UseStringMethods.convertToString();
                        break;
                    case 2: UseStringMethods.convertToInteger();
                        break;
                    case 3: UseStringMethods.isPalindrome();
                        break;
                    case 4: UseStringMethods.compareStrings();
                        break;
                    case 5: UseStringMethods.returnSubstring();
                        break;
                    case 6: UseStringMethods.removeUnderscoreReplaceWithSpaces();
                        break;
                    case 7: UseStringMethods.removeWhiteSpaces();
                        break;
                    case 9:
                        break;
                    default: System.out.println("Please enter a valid number");
                }
        } 
    }
}
