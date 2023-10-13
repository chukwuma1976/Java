package Numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                System.out.print("Please enter a number or type 0 to exit: ");
                int number = scanner.nextInt();
                if (number == 0) break;

                System.out.println();
                System.out.println(number + (Numbers.isPrimeNumber(number)?" is a prime number.":" is not a prime number."));
                System.out.println("The divisors of " + number + " are: " + Numbers.getDivisors(number));
                System.out.println(number + "! equals: " + 
                    (Numbers.factorial(number) == Long.MAX_VALUE ? "Too Large to Calculate" : Numbers.factorial(number)));
                System.out.println("Fibonacci sequence for the first " + number + " numbers is:" + Numbers.fibonacci(number));
                System.out.println("Tribonacci sequence for the first " + number + " numbers is:" + Numbers.tribonacci(number));
                System.out.println("Quadratic (squared) sequence for the first " + number + " numbers is:" + Numbers.quadratic(number));
                System.out.println("Factorial sequence for the first " + number + " numbers is:" + Numbers.factorialSequence(number));
                System.out.println();
            }
        }
    }
}
