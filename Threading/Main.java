package Threading;

public class Main {
    public static void main(String[] args) {
        Runnable runBarryRun = new MyRunnable();
        Thread myRunnable = new Thread(runBarryRun);
        Thread myThread = new MyThread();
        Thread badBitch = new Thread(()->System.out.println("Hello Bad Bitches"));

        System.out.println("myRunnable state: "+myRunnable.getState());
        System.out.println("myThread state: "+myThread.getState());
        System.out.println("badBitch state: "+badBitch.getState());


        System.out.println("myRunnable is Alive: "+myRunnable.isAlive());
        System.out.println("myThread is Alive: "+myThread.isAlive());
        System.out.println("badBitch is Alive: "+badBitch.isAlive());

        System.out.println("myRunnable is Interrupted: "+myRunnable.isInterrupted());
        System.out.println("myThread is Interrupted: "+myThread.isInterrupted());
        System.out.println("badBitch is Interrupted: "+badBitch.isInterrupted());

        System.out.println("myRunnable is Daemon: "+myRunnable.isDaemon());
        System.out.println("myRunnable is Daemon: "+myThread.isDaemon());
        System.out.println("myRunnable is Daemon: "+badBitch.isDaemon());

        badBitch.start();
        myRunnable.start();
        myThread.start();

        System.out.println("myRunnable state: "+myRunnable.getState());
        System.out.println("myThread state: "+myThread.getState());
        System.out.println("badBitch state: "+badBitch.getState());

    }
}
