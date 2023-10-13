package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringMethods {
    
    static int convertToInteger(String input){
        return Integer.valueOf(input);
    }

    static String convertToString(int input){
        return Integer.toString(input);
    }

    static boolean isPalindrome(String entry){
        String input = entry.toLowerCase();
        int start = 0;
        int end = input.length()-1;
        while (start<=end){
            if (input.charAt(start)!=input.charAt(end)) return false;
            start++;
            end--; 
        }
        return true;
    }

    static String returnSubstring(String input, int start, int end){
        return input.substring(start, end);
    }

    static String returnSubstring(String input, int start){
        return input.substring(start);
    }

    static boolean compareStrings(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }

    static String removeUnderscoreReplaceWithSpaces(String input){
        return input.replace('_', ' ');
    }

    static String removeWhiteSpaces(String input){
        return input.trim();
    }

    static String returnPigLatin(String input){
        String pig_latin = input.substring(1, input.length()).concat(input.charAt(0) + "ay");
        return pig_latin;

    }

    static char recurringChar(String str) {
        Map<Character, Integer> characters = new HashMap<>();
        int highest = 0;
        Character mostCommon = null;
        for (Character character : str.toCharArray()){
            if (characters.get(character)==null) characters.put(character, 1);
                else characters.put(character, characters.get(character)+1);

            if (characters.get(character)>highest) mostCommon = character;

            highest = Math.max(characters.get(character), highest);
        }
        return mostCommon;
    }


}
