package InnerClass;

public class Outer {

    public void show(){
        System.out.println("Displaying outer class");
    }

    class Inner {
        public void show(){
            System.out.println("Displaying inner class");
        }
    }

    class StaticInner {
        public void show(){
            System.out.println("Displaying static inner class");
        }
    }
    
}
