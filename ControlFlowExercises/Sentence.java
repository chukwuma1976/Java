package ControlFlowExercises;

import java.util.*;

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

    static void printExpletives (){
        System.out.println();
        Arrays.sort(curseWords);
        for (String expletive : curseWords){
            System.out.println(expletive);
        }
        System.out.println();
    }

    static List<String> returnListOfExpletives(){
        Arrays.sort(curseWords);
        return List.of(curseWords);
    }

    static int countExpletivesInSentence(String sentence){
        String [] wordList = sentence.split(" ");
        int count = 0;
        for (String word : wordList){
            for (String expletive : curseWords){
                if (word.contains(expletive)) count++;
            }
        }
        return count;
    }

    static Set<String> returnListOfExpletivesInSentence(String sentence){
        Set<String> list = new HashSet<>();
        String [] wordList = sentence.split(" ");
        for (String word : wordList){
            for (String expletive : curseWords){
                if (word.contains(expletive)) list.add(expletive);
            }
        }
        return list;
    }
}
