/**
 * Created by ankur on 26/8/17.
 */
public class Testing {

    void add (Object o) {

        System.out.println("Object");
    }

    void add(String s) {
        System.out.println("String");
    }




    public static void main(String[] args) {

        Testing t = new Testing();
        t.add(null);

    }
}
