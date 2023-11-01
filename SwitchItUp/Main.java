package SwitchItUp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type in a number:  ");
            int input = scanner.nextInt();
            switch (input){
                case 0 : System.out.println("Zero");
                    break;
                case 1 : System.out.println("Easy Money");
                    break;
                case 2 : System.out.println("These nuts in your face");
                    break;
                case 3 : System.out.println("Silly Ho");
                    break;
                default: System.out.println("You ain't getting none");
            }
        }       
    }
}
