package inheritance;

import codeChef.Husky;

/**
 * Created by ankur on 11/7/17.
 */
public class MainClass {

    public static void main(String []args) {


        Animal husky = new Husky();

        husky.run();

        for (int i=-10;i<11;i++) {

            System.out.println("Complement of "+i+" is " + (i>>63));
        }
        //System.out.println(~-5);


    }
}
