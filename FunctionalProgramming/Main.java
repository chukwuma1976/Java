package FunctionalProgramming;
import java.time.LocalDate;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import ControlFlowExercises.Sentence;

public class Main {
    public static void main(String[] args) {
        // Numbers doubleIt = x->x*2;
        // Numbers tripleIt = x->x*3;
        // Numbers negateIt = x-> -x;

        // int twoX = doubleIt.doMath(2);
        // int threeX = tripleIt.doMath(3);
        // int negative = negateIt.doMath(5);

        // System.out.println(twoX);
        // System.out.println(threeX);
        // System.out.println(negative);

        List<String> superheroes = Arrays.asList("Superman", "Wonder Woman", "Batman", "The Flash", "Cyborg", "Aquaman");
        superheroes.stream().map(String::toUpperCase).forEach(System.out::println);

        Function<String, String> addMyNuts = phrase -> phrase + " my nuts!";
        Function<String, String> addBitch = phrase -> phrase + " Bitch!";
        System.out.println(addMyNuts.apply("Criticize"));
        System.out.println(addBitch.apply("I'm Rick James"));

        BiFunction<String, String, String> callBS = (str1, str2) -> str1 + " and " + str2 + " are bullshit.";
        System.out.println(callBS.apply("Bro Splits", "Half Reps"));

        Consumer<String> sayHelloTo = person -> System.out.println("Hello " + person);
        sayHelloTo.accept("Bitches!");

        BiConsumer<String, String> sayHelloToBoth = (person1, person2) -> System.out.println("Hello " + person1 + " and " + person2);
        sayHelloToBoth.accept("Bitches", "Snitches");

        Predicate<String> isCursing = sentence -> Sentence.screenForExpletives(sentence);
        System.out.println("The phrase 'Fuck that' contains an expletive: " + isCursing.test("Fuck that"));
        System.out.println("The phrase 'There are whores in this house' contains an expletive: " + isCursing.test("There are whores in this house"));
        System.out.println("The phrase 'One with God is a Majority' contains expletive: "+ isCursing.test("One with God is a Majority") );

        BiPredicate<Integer, Integer> divisible = (num1, num2) -> num1%num2 == 0;
        System.out.println("10 is divisible by 3: " + divisible.test(10,3));

        Supplier<List<String>> expletives = ()-> Sentence.returnListOfExpletives();

        System.out.println(expletives.get());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(1976, 8, 14));
    }
}
