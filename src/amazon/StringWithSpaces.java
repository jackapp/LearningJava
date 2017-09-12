package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ankur on 2/9/17.
 */
public class StringWithSpaces {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next();
        char []c = input.toCharArray();
        List<Character> x = new ArrayList<Character>();

        for (Character ch : c) {
            x.add(ch);
        }

        printString(x,0,c.length,x.get(c.length-1));
        //System.out.println(x.get(c.length-1));

    }

    static void printString(List<Character> input, int index,int size,Character c) {

        if (index == size) {
            System.out.println(input);
            return;
        }

        if (index > size ) {
            return;
        }


        printString(input,index+1,size,c);

        if (input.get(index) != c) {

            List<Character> temp = new ArrayList<Character>(input);

            temp.add(index+1,' ');

            printString(temp,index+2,size+1,c);

        }


    }

}
