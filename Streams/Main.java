package Streams;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    static public void main(String[] args){
        // List<String> expletives = List.of("fuck", "bitch", "shit", "ass", "dick", "pussy");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence to screen:  ");
            String input = scanner.nextLine();
            System.out.println("Here is what you entered: "+ input);
            List<String> wordsArray = List.of(input.split(" "));
            List<String> filteredArray = wordsArray.stream().map(word->{
                return Word.filterExpletives(word);
                // for (String curse : expletives){
                //     if (word.contains(curse)) return "*****";
                // }
                // return word;
            }).collect(Collectors.toList());
            String filteredString = "";
            for (String word : filteredArray) filteredString += (word + " ");
            System.out.println("The filtered sentence is now: "+ filteredString);
        }
    }
}
