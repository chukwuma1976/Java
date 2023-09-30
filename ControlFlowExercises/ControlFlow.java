package ControlFlowExercises;

import java.util.Scanner;

public class ControlFlow {
    static public void main (String[] args){
        System.out.println("Welcome to Control Flow");
        String sentence = "";
        try (Scanner scanner = new Scanner(System.in)) {
            while (!sentence.toLowerCase().equals("exit")){
                    System.out.println("Please enter a sentence or type exit to end this.");
                    sentence = scanner.nextLine();
                    System.out.println("The phrase that you entered is: " + sentence);
                    System.out.println("Presence of curse word: " + screenForExpletives(sentence));
                    if (screenForExpletives(sentence)){
                        System.out.println();
                        System.out.println("Here is your censored sentence: ");
                        System.out.println(replaceExpletives(sentence));
                    }
                    System.out.println();
            }
        }
    }

    static public boolean screenForExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass"};
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass", "motherfucker"};
        String [] array = message.toLowerCase().split(" ");
        String newMessage = "";
        for (String expletive : curseWords){
            for (int i=0; i<array.length; i++){
                if (array[i].contains(expletive)){
                    array[i]="*****";
                }
            }
        }
        for (String word : array){
            newMessage = newMessage + " " + word;
        }
        return newMessage;
    }
}
