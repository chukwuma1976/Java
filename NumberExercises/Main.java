package NumberExercises;

public class Main {

    public static void main(String[] args) {
        Integer number = 12;
        String numberStr = "21";
        Byte n = 12;
        System.out.println(number.intValue()); 
        System.out.println(n.byteValue());
        System.out.println(Integer.valueOf(numberStr));
        System.out.println(Integer.parseInt(numberStr));;
        System.out.print(number.toString() + " is now a string: ");
        System.out.println(number.toString() instanceof String);
        System.out.println("Number is 12 compared to 13 using compareTo method: " + number.compareTo(13));
        System.out.println("Number is 12 compared to 11 using compareTo method: " + number.compareTo(11));
        System.out.println("Number is 12 compared to 12 using compareTo method: " + number.compareTo(12));
        System.out.println();

        System.out.println("Dollars:");
        Formatter.output(1_000_000_000.011d, "$###,###.##");
        System.out.println("Big Ass Number:");
        Formatter.output(1_000_000_000_000.005d, "###,###.###");
        System.out.println();
        System.out.println("Pi = "+Math.PI);
        System.out.println("E = "+Math.E);
        System.out.println(Math.rint(27.7));

        double degrees = 45;
        double radians = Math.toRadians(degrees);
        System.out.println(radians);
        System.out.println("Cos 45: " + Math.cos(radians));
        System.out.println("Sin 45: " + Math.sin(radians));
        System.out.println("Tan 45: " + Math.tan(radians));
        System.out.println("Random Number: " + Math.round(Math.random()*10));
    }

}
