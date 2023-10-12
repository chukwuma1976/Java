package ControlFlowExercises;

public class Sentence {
    static String [] curseWords = {"fuck", "bitch", "shit", "ass", "dick", "pussy"};

    static public boolean screenForExpletives (String message){
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        String replaced = message;
        for (String expletive : curseWords){
            if (message.contains(expletive)){
                replaced = replaced.replaceAll(expletive, replacement(expletive));
            }
        }
        return replaced;
    }    

    static public String replacement (String expletive){
        String str = "";
        for (int i=0; i<expletive.length(); i++) str += "#";
        return str;
    }
}
