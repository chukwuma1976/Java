package NumberExercises;

import java.text.DecimalFormat;

public class Formatter {
    public static void output(Double number, String pattern){
        DecimalFormat formatter = new DecimalFormat(pattern);        
        System.out.println(formatter.format(number));
    }
}
