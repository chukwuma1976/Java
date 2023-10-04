package Strings;

import java.util.*;

public class Main {
    static public void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            // System.out.print("Enter something: ");
            // String input = scanner.nextLine();
            // System.out.println("The integer is: "+StringMethods.convertToInteger(input));
            // System.out.println("******************************");

            // System.out.print("Enter an integer: ");
            // int number = scanner.nextInt();
            // System.out.println("The string is: "+StringMethods.convertToString(number));
            // System.out.println("******************************");

            // System.out.print("Enter a string: ");
            // String phrase = scanner.nextLine();
            // System.out.println(StringMethods.isPalindrome(phrase)? "This is a palindrome":"This is not a palindrome");
            // System.out.println("******************************");

            // System.out.print("Enter a string: ");
            // String entry1 = scanner.nextLine();
            // System.out.print("Enter another string: ");
            // String entry2 = scanner.nextLine();
            // System.out.println(StringMethods.compareStrings(entry1, entry2)? "These strings are the same":"These strings are different");
            // System.out.println("******************************");

            // System.out.print("Enter a string: ");
            // String thisString = scanner.nextLine();
            // System.out.print("Enter starting index for substring: ");
            // int start = scanner.nextInt();
            // System.out.print("Enter end index for substring: ");
            // int end = scanner.nextInt();
            // System.out.println("The substring for " + thisString + " is : " + StringMethods.returnSubstring(thisString, start, end));
            // System.out.println("The substring for " + thisString + "starting at "+ start + " is : " + StringMethods.returnSubstring(thisString, start));
            // System.out.println("******************************");

            System.out.print("Enter a snake cased string: ");
            String snaked = scanner.nextLine();
            System.out.println("Your new non snake cased string is: " + StringMethods.removeUnderscoreReplaceWithSpaces(snaked));
            System.out.println("******************************");
        }

    }
}
