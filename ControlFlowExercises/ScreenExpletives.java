package ControlFlowExercises;

import java.util.Scanner;

public class ScreenExpletives {
    static public void main (String[] args){
        System.out.println("Filtering out expletives");
        String sentence = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (!sentence.toLowerCase().equals("exit")){
                System.out.println("Please enter a sentence or type exit to end this.");
                sentence = scanner.nextLine();
                System.out.println("The phrase that you entered is: " + sentence);
                System.out.println(Sentence.screenForExpletives(sentence) ? "There is at least one expletive" : "This sentence is clean");
                if (Sentence.screenForExpletives(sentence)){
                    System.out.println();
                    System.out.println("Here is your censored sentence: ");
                    System.out.println(Sentence.replaceExpletives(sentence));
                }
                System.out.println();
            }
        }
    }
}
