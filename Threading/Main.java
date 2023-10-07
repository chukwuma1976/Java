package Threading;

public class Main {
    public static void main(String[] args) {
        Runnable runBarryRun = new MyRunnable();
        Thread myRunnable = new Thread(runBarryRun);
        Thread myThread = new MyThread();
        Thread badBitch = new Thread(()->System.out.println("Hello Bad Bitches"));

        System.out.println(myRunnable.getState());
        System.out.println(myThread.getState());
        System.out.println(badBitch.getState());


        System.out.println(myRunnable.isAlive());
        System.out.println(myThread.isAlive());
        System.out.println(badBitch.isAlive());

        badBitch.start();
        myRunnable.start();
        myThread.start();

        System.out.println(myRunnable.getState());
        System.out.println(myThread.getState());
        System.out.println(badBitch.getState());

    }
}
