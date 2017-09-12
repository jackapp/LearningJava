package threads;

/**
 * Created by ankur on 11/8/17.
 */
public class MainThread {

    public static void main(String[] args) {

        Counter counter =  new Counter(1);
        Thread t1 = new Thread(new MyRunnable(counter,"1"));
        Thread t2 = new Thread(new MyRunnable(counter,"2"));

        t1.start();
        t2.start();

    }
}
