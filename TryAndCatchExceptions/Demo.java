package TryAndCatchExceptions;

public class Demo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            System.out.println("i divided by j is : " + i/j);
        } catch (Exception e) {
            System.out.println("Something went wrong my man, so these nuts in your face!");
            e.printStackTrace();
        }
    }
}
