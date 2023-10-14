package ControlFlowExercises;

public class Sentence {
    static String [] curseWords = 
    {"arse", "fuck", "bitch", "shit", "ass", "dick", "pussy", "cock", "cunt", "dyke", "goddamn", "kike", 
    "nigga", "nigger", "whore", "wanker", "dyke", "slut"};

    static public boolean screenForExpletives (String message){
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    static public String replaceExpletives (String message){
        String replaced = message;
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)){
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
