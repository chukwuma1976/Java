package FunctionalInterfacesAndLambdas;

public class Demo {
    public static void main(String[] args) {
        Functional functional = new Functional(){
            public void execute(){
                System.out.println("Using functional interface to say 'These nuts!'");
            }
        };
        functional.execute();

        Functional functional2 = () -> System.out.println("Using arrow expression to say 'These nuts!'");
        functional2.execute();

        MathFunction volumeOfSphere = num -> (4/3)*Math.PI*Math.pow(num, 3);
        System.out.println("The volume of a sphere with a radius of three is " + volumeOfSphere.doMath(3));
    }
}
