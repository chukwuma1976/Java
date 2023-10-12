package Numbers;

import java.util.*;

public class Numbers {

    static boolean isPrimeNumber(int number){
            if (number  == 1 || number == 2) return true;
            for (int i=2; i<number; i++){
                if (number%i == 0) return false;
            }
            return true;
        }

    static List<Integer> fibonacci (int number){
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i=2; i<number; i++){
            fib.add(fib.get(i-2)+fib.get(i-1));
        }        
        return fib;
    }

    static long factorial (int number){
        if (number == 1) return 1;
        return number * (factorial(number-1));
    }

    static List<Integer> getDivisors (int number){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i<=number; i++){
            if (number%i==0) divisors.add(i);
        }

        return divisors;
    }
}
