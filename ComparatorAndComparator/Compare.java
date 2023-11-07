package ComparatorAndComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Compare {
    public static void main(String[] args) {

        List<Superhero> heroes = new ArrayList<>();
        List<Hero> comparableHeroes = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)){
            while (true){
                System.out.print("Please enter a superhero code name (or enter 'exit'): ");
                String codeName = scanner.nextLine();
                if (codeName.equalsIgnoreCase("exit")) break;
                System.out.print("Please enter the real name: ");
                String realName = scanner.nextLine();   
                heroes.add(new Superhero(codeName, realName));  
                comparableHeroes.add(new Hero(codeName, realName));
            }   
        }

        Comparator<Superhero> compareByCodeName = new Comparator<Superhero>(){
            public int compare(Superhero first, Superhero second){
                return first.getCodeName().compareTo(second.getCodeName());
            }       
        };
        Comparator<Superhero> compareByRealName = (first, second) -> first.getRealName().compareTo(second.getRealName());

        System.out.println("Before sorting");
        System.out.println(heroes);
        System.out.println("\nSorting by code name using Comparator");
        Collections.sort(heroes, compareByCodeName);
        System.out.println(heroes);
        System.out.println("\nSorting by code name using Comparable");
        Collections.sort(comparableHeroes);
        System.out.println(comparableHeroes);
        System.out.println("\n********************************************************************************");
        System.out.println("Sorting by real name using Comparator");
        Collections.sort(heroes, compareByRealName);
        System.out.println(heroes);
        
    }
}
