package codeChef;

import inheritance.Dog;

/**
 * Created by ankur on 8/8/17.
 */
public class Husky extends Dog {

    public Husky() {
        System.out.println("Hello i am a Husky");
    }

    public void run() {
        super.run();
        System.out.println("This is Husky running");
    }
}
