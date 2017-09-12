package threads;

/**
 * Created by ankur on 14/8/17.
 */
public class Counter {

    int counter;

    Counter (int counter) {

        this.counter = counter;

    }

    synchronized public void printNumbers() {
        System.out.println(counter);
        counter++;
    }

     int getCounter() {
        return this.counter;
    }
}
