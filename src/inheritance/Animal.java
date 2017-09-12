package inheritance;

/**
 * Created by ankur on 11/7/17.
 */
public class Animal {

    int legs;

    Animal() {
        System.out.println("This is a constructor of Animal class");
    }

    protected void run() {

        System.out.println("Hello running");
    }
}
