package Strings;

import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your full name: ");
            String input = scanner.nextLine();
            System.out.print("Here are your initials: ");
            for (String name: input.split(" ")){
               System.out.print(name.charAt(0)); 
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}
