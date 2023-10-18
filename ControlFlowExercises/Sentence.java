package ControlFlowExercises;

import java.util.*;

public class Sentence {
    public static String [] curseWords = 
    {"arse", "fuck", "bitch", "shit", "ass", "dick", "pussy", "cock", "cunt", "dyke", "goddamn", "kike", 
    "nigga", "nigger", "whore", "wanker", "dyke", "slut"};

    public static boolean screenForExpletives (String message){
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)) return true;
        }
        return false;
    }

    public static String replaceExpletives (String message){
        String replaced = message;
        for (String expletive : curseWords){
            if (message.toLowerCase().contains(expletive)){
                replaced = replaced.replaceAll(expletive, replacement(expletive));
            }
        }
        return replaced;
    }    

    public static String replacement (String expletive){
        String str = "";
        for (int i=0; i<expletive.length(); i++) str += "#";
        return str;
    }

    public static void printExpletives (){
        System.out.println();
        Arrays.sort(curseWords);
        for (String expletive : curseWords){
            System.out.println(expletive);
        }
        System.out.println();
    }

    public static List<String> returnListOfExpletives(){
        Arrays.sort(curseWords);
        return List.of(curseWords);
    }

    public static int countExpletives(String sentence){
        String [] wordList = sentence.split(" ");
        int count = 0;
        for (String word : wordList){
            for (String expletive : curseWords){
                if (word.contains(expletive)) count++;
            }
        }
        return count;
    }

    public static Map<String, Integer> provideCountOfEachExpletive(String sentence){
        Map<String, Integer> expletiveMap = new HashMap<>();
        String [] wordList = sentence.split(" ");
        for (String word : wordList){
            for (String expletive : curseWords){
                if (word.contains(expletive)){
                    if (expletiveMap.get(expletive)==null)
                        expletiveMap.put(expletive, 1);
                        else expletiveMap.put(expletive, expletiveMap.get(expletive)+1);
                }
            }
        }        
        return expletiveMap;
    }

    public static List<String> returnListOfExpletives(String sentence){
        Set<String> list = new HashSet<>();
        String [] wordList = sentence.split(" ");
        for (String word : wordList){
            for (String expletive : curseWords){
                if (word.contains(expletive)) list.add(expletive);
            }
        }
        return new ArrayList<>(list);
    }
    
}
