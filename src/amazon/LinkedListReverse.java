package amazon;

import java.util.*;

/**
 * Created by ankur on 4/9/17.
 */
public class LinkedListReverse {


    public static void main(String[] args) {


        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        for (Integer i : ll){
            System.out.println(i);
        }

        Iterator<Integer> i = ll.iterator();

        while (i.hasNext()) {

            Integer x =  i.next();
            System.out.println(x);
        }



    }

    static void reverseList(LinkedList<Integer> ll) {


        Set<Integer> l = new HashSet<>();

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

    }
}
