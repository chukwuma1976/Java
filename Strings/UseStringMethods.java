package Strings;

import java.util.Scanner;

public class UseStringMethods {
    
    static void convertToInteger(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String input = scanner.nextLine();
            System.out.println("The integer is: "+StringMethods.convertToInteger(input));
        }
    }

    static void convertToString(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("The string is: '"+StringMethods.convertToString(number) + "'");
        }
    }

    static void isPalindrome(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String phrase = scanner.nextLine();
            System.out.println(StringMethods.isPalindrome(phrase)? "This is a palindrome":"This is not a palindrome");
        }
    }

    static void compareStrings(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String entry1 = scanner.nextLine();
            System.out.print("Enter another string: ");
            String entry2 = scanner.nextLine();
            System.out.println(StringMethods.compareStrings(entry1, entry2)? "These strings are the same":"These strings are different");
        }
    }

    static void returnSubstring(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String thisString = scanner.nextLine();
            System.out.print("Enter starting index for substring: ");
            int start = scanner.nextInt();
            System.out.print("Enter end index for substring: ");
            int end = scanner.nextInt();
            System.out.println("The substring for '" + thisString + "'' is : '" + StringMethods.returnSubstring(thisString, start, end)+"'");
            System.out.println("The substring for " + thisString + " starting at "+ start + " is : " + StringMethods.returnSubstring(thisString, start));
        }
    }

    static void removeUnderscoreReplaceWithSpaces(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a snake cased string: ");
            String snaked = scanner.nextLine();
            System.out.println("Your new non snake cased string is: '" + StringMethods.removeUnderscoreReplaceWithSpaces(snaked)+"'");
        }
    }

    static void removeWhiteSpaces(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a white spaced string: ");
            String whiteSpaced = scanner.nextLine();
            System.out.println("Your new white space free string is: '" + StringMethods.removeWhiteSpaces(whiteSpaced)+"'");
        }
    }

    static void returnPigLatin(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            System.out.println("The pig latin for: "+ word +" is '" + StringMethods.returnPigLatin(word)+"'");
        }
    }

}
