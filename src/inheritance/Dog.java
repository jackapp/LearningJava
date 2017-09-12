package inheritance;

/**
 * Created by ankur on 11/7/17.
 */
public class Dog extends  Animal {


    public Dog() {
        System.out.println("This is a constructor for Dog");

    }

    public void run() {
        super.run();
        System.out.println("This is a dog running");

    }

}
