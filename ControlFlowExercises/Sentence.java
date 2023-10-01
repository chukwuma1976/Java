package ControlFlowExercises;

public class Sentence {

    static public boolean screenForExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass"};
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        String [] curseWords = {"fuck", "bitch", "shit", "ass", "dick"};
        String [] array = message.split(" ");
        String newMessage = "";
        for (String expletive : curseWords){
            for (int i=0; i<array.length; i++){
                if (array[i].toLowerCase().contains(expletive)){
                    int startIndex = Math.max(array[i].indexOf(expletive), 0);
                    int endIndex = startIndex + expletive.length();
                    StringBuilder censored = new StringBuilder(array[i]);
                    array[i] = censored.replace(startIndex, endIndex, "@#%**!").toString();
                }
            }
        }
        for (String word : array){
            newMessage = newMessage + " " + word;
        }
        return newMessage;
    }    
}
