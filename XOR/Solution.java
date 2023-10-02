package XOR;

import java.util.Scanner;

public class Solution {
    /*
    In this challenge, the task is to debug the existing code to successfully execute all provided test files.
    Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
    Debug the given function strings_xor to find the XOR of the two given strings appropriately.
    Input Format

    The input consists of two lines. The first line of the input contains the first string, , and the second line contains the second string, .

    Print the string obtained by the XOR of the two input strings in a single line.

    Sample Input

    10101
    00101

    Sample Output

    10000
     */
    public static void main(String args[] ) throws Exception {
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first binary number: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter the next binary number of the same length: ");
            String str2 = scanner.nextLine();
            if (isBinary(str1) && isBinary(str2)) System.out.println("The result is: " + strings_xor(str1, str2));
                else System.out.println("Please enter two binary numbers next time");
        }
    }
    static String strings_xor(String str1, String str2){
        if (str1.length()!=str2.length()) {
            return "The two strings need to be the same length";
        }
        String xor = "";
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i)==str2.charAt(i)){
                xor = xor + '0';
            } else {
                xor = xor + '1';
            }
        }
        return xor;
    }
    static boolean isBinary(String str){
        String[] nonBinaryCharacters = {"2", "3", "4", "5", "6", "7", "8", "9"};
        for (String digit : nonBinaryCharacters) 
            if (str.contains(digit)) return false;
        return true;
    }
}
