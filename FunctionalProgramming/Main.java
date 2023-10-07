package FunctionalProgramming;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Numbers doubleIt = x->x*2;
        Numbers tripleIt = x->x*3;
        Numbers negateIt = x-> -x;

        int twoX = doubleIt.doMath(2);
        int threeX = tripleIt.doMath(3);
        int negative = negateIt.doMath(5);

        System.out.println(twoX);
        System.out.println(threeX);
        System.out.println(negative);

        List<String> superheroes = Arrays.asList("Superman", "Wonder Woman", "Batman", "The Flash", "Cyborg", "Aquaman");
        superheroes.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> expletives = List.of("fuck", "dick", "pussy", "ass", "shit");
        expletives.stream().map(String::toUpperCase).forEach(System.out::println);;

    }
}
