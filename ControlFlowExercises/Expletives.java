package ControlFlowExercises;

public class Expletives {

    static public boolean screen(String message){
        switch (message.toUpperCase()){
            case "fuck": return true;
            case "bitch": return true;
            case "shit": return true;
            case "ass": return true;
            default: return false;
        }
    }
}
