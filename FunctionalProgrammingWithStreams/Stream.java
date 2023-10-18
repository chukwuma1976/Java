package FunctionalProgrammingWithStreams;

import java.util.*;
import java.util.stream.Collectors;
import ControlFlowExercises.Sentence;

public class Stream {
    public static void main(String[] args) {
        System.out.println("\nUsing streams with Lists:\n");
        List<String> hitList = List.of("Bullshit Motherfucker", "Silly Ho", "Hater", "Ugly Bitch", "Bullshit Guy");
        List<String> hitListDeclaration = 
            hitList.stream().map(sucker-> ("This is " + sucker)).collect(Collectors.toList());
        hitListDeclaration.forEach(System.out::println);
        System.out.println();
        hitListDeclaration.stream()
            .filter(sentence->!Sentence.screenForExpletives(sentence))
            .collect(Collectors.toList())
            .forEach(System.out::println);

        String[] shitList = {"Bullshit Motherfucker", "Silly Ho", "Hater", "Ugly Bitch", "Bullshit Guy"};
        System.out.println("\nUsing streams with arrays:\n");
        Arrays.stream(shitList)
            .map(String::toUpperCase)
            .collect(Collectors.toList())
            .forEach(System.out::println);
        
    }
}