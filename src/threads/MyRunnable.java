package threads;

/**
 * Created by ankur on 11/8/17.
 */
public class MyRunnable implements Runnable {

    Counter counter;
    String name;
    MyRunnable(Counter counter,String name) {
        this.counter = counter;
        this.name = name;

    }

    @Override
    public void run() {



            counter.printNumbers();
            System.out.println("From Thread " + name);


    }


}
