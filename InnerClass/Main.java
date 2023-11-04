package InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = outer.new Inner();
        inner.show();
        // Outer.StaticInner staticInner = outer.new StaticInner();
        // staticInner.show();
        outer.new StaticInner().show();
        Outer newOuter = new Outer(){
            public void show(){
                System.out.println("Displaying anonymous inner class");
                System.out.println("\tThese nuts!!!!");
            }
        };
        newOuter.show();
        AbstractOuter abstractOne = new AbstractOuter() {
            public void show(){
                System.out.println("Displaying anonymous inner class with outer abstract class");
            }
        };
        abstractOne.show();
        abstractOne.theseNuts();
    }   
}
