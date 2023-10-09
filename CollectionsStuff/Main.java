package CollectionsStuff;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List<String> expletives = new ArrayList<>();
        // String[] listOfExpletives = {"fuck", "bitch", "shit", "ass", "dick", "pussy"};
        // for (String expletive : listOfExpletives) expletives.add(expletive);
        // List<String> words = new ArrayList<>();
        // String[] listOfWords = {"Nuts", "In", "Your", "Face"};
        // for (String word : listOfWords) words.add(word);
        // expletives.add("asshole");
        // expletives.addAll(words);
        // expletives.addAll(words);
        // Stack<String> expletiveLinkedList = new Stack<>();
        // for (String word: expletives){
        //     expletiveLinkedList.push(word);
        // }

        // for (String word : expletiveLinkedList) System.out.print(word + " ");
        // System.out.println();
        // expletiveLinkedList.pop();
        // expletiveLinkedList.pop();        
        // expletiveLinkedList.pop();
        // Iterator<String> wordIterator = expletiveLinkedList.iterator();
        // while (wordIterator.hasNext()) System.out.print(wordIterator.next() + " ");
        // System.out.println();
        // expletiveLinkedList.push("In");
        // expletiveLinkedList.push("Your");        
        // expletiveLinkedList.push("Face");
        // for (String word : expletiveLinkedList) System.out.print(word + " ");

        Map<String, String> family = new HashMap<>();
        family.put("Father", "Barna Anyadike");
        family.put("Mother", "Helen Anyadike");
        family.put("Oldest Son", "Chukwuma 'Slick As A Puma' Anyadike");
        family.put("1st Brother", "Uzoma Chuddy Anyadike");
        family.put("2nd Brother", "Emeka Anyadike");
        family.put("3rdBrother", "Chika Anyadike");
        family.put("Sister", "Kechi Anyadike");
        family.put("Ex Wife", "Adwoa");

        System.out.println(family.entrySet());
        System.out.println(family.keySet());
        System.out.println(family.values());
        family.remove("Ex Wife");
        family.put("Grandchild", "Afua Anyadike");

        for (String key : family.keySet())System.out.println(key +": \t" + family.get(key));


    }
}
