package ControlFlowExercises;

public class Sentence {
    static String [] curseWords = {"fuck", "bitch", "shit", "ass", "dick"};

    static public boolean screenForExpletives (String message){
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        StringBuilder newMessage = new StringBuilder(message);
        for (String expletive : curseWords){
            if (newMessage.toString().toLowerCase().contains(expletive)){
                int startIndex = Math.max(newMessage.toString().indexOf(expletive), 0);
                int endIndex = startIndex + expletive.length();
                newMessage = newMessage.replace(startIndex, endIndex, "@#%**!");
            }
        }

        return newMessage.toString();
    }    
}
