package Numbers;

public class NumbersToStringAndBack {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf("11"));
        System.out.println(Float.valueOf("11.23"));
        System.out.println(Long.valueOf("1111111111111111"));
        System.out.println(Double.valueOf("11.00001"));
        System.out.println(Short.valueOf("11"));
        System.out.println(Byte.valueOf("11"));
        System.out.println(Integer.toString(123));
        System.out.println(123 + "" instanceof String);
        System.out.println(String.valueOf(1234));
        System.out.println(String.valueOf(1234) instanceof String);
    }
}
