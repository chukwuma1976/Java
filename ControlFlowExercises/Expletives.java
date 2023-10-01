package ControlFlowExercises;

public class Expletives {

    static public boolean screenForExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass"};
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass", "motherfucker"};
        String [] array = message.split(" ");
        String newMessage = "";
        for (String expletive : curseWords){
            for (int i=0; i<array.length; i++){
                if (array[i].toLowerCase().contains(expletive)){
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
