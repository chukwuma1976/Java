package TryAndCatchExceptions;

public class Demo {
    public static void main(String[] args) throws Exception {
        int i = 10;
        int j = 2;

        int[] numbers = new int[4];
        try {
            System.out.println("i divided by j is : " + i/j);
            System.out.println(numbers[3]);
            if (j==1) throw new CustomException("A custom exception was thrown");
            DuckExceptionGuy.doNonsense(0);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong my man.  Do not divide by zero!");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your lane man.  Keep your array index in bounds son!");
            e.printStackTrace();
        } catch (CustomException e){
            System.out.println("You really messed up man");
            e.printStackTrace();
        } finally {
            System.out.println("This line will print regardless, son!");
        }
    }
}
