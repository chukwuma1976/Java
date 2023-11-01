package Strings;

import java.util.Scanner;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a word: ");
            String input = scanner.nextLine();
            String firstSorted = sortLetters(input);
            System.out.print("Please enter another word: ");
            String nextInput = scanner.nextLine();
            String nextSorted = sortLetters(nextInput);
            if (firstSorted.equalsIgnoreCase(nextSorted))
                System.out.println("These two words are anagrams.");
                else System.out.println("These two words are not anagrams.");
        }        
    }

    public static String sortLetters(String input){
        String[] letters = input.replaceAll(" ", "").split("");
        List<String> listOfLetters = Arrays.asList(letters);
        Collections.sort(listOfLetters); 
        String sorted = "";
        for (String letter: listOfLetters) sorted = sorted.concat(letter);
        return sorted;     
    }
}
