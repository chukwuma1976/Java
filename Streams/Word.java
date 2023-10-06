package Streams;

import java.util.List;

public class Word {
    static String filterExpletives (String word){
        List<String> expletives = List.of("fuck", "bitch", "shit", "ass", "dick", "pussy");
        for (String curse : expletives){
            if (word.contains(curse)) return "*****";
        }
        return word;
    }
}
