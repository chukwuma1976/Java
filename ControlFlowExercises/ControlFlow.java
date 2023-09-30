package ControlFlowExercises;

import java.util.Scanner;

public class ControlFlow {
    static public void main (String[] args){
        System.out.println("Welcome to Control Flow");
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.nextLine();
            System.out.println("The phrase that you entered is: " + word);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
