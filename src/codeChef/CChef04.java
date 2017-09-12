package codeChef;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ankur on 8/8/17.
 */
public class CChef04 {


    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        while (t-- > 0) {

            String a = in.next();
            String b = in.next();

            int flag=2; //1 means A will win 2 means B will win.
            //Make all the cases

            if (a.equals(b)) {

                flag=2;

            }  else {

                //The case in which A will win

                char [] aChar = a.toCharArray();
                char [] bChar = b.toCharArray();

                HashMap<Character,Integer> aMap = new HashMap<>();

                for (char i : aChar) {
                    aMap.put(i,(aMap.containsKey(i)?aMap.get(i)+1:1));
                }

                HashMap<Character,Integer> bMap = new HashMap<>();

                for (char i : bChar) {
                    bMap.put(i,(bMap.containsKey(i)?bMap.get(i)+1:1));
                }



                //Find if there is any key which is there in A but not B

                Iterator i = aMap.entrySet().iterator();

                while (i.hasNext() && flag!=1) {

                    Map.Entry entry = (Map.Entry)i.next();

                    if (!bMap.containsKey(entry.getKey())) {

                        if ((Integer)entry.getValue() > 1) {
                            flag =1;
                        }

                    }

                }

                if (aMap.keySet().equals(bMap.keySet())) {

                    flag=2;

                } else {

                    Iterator j = bMap.entrySet().iterator();

                    int val=0;
                    while (j.hasNext() && val!=-1 && flag!=1 ) {

                        Map.Entry entry = (Map.Entry)j.next();

                        if (aMap.containsKey(entry.getKey())) {
                            val=1;
                        } else {
                            val=-1;
                        }

                    }

                    if (val==1){
                        flag=1;
                    }

                }






            }


            if (flag==1) {
                System.out.println("A");
            } else {

                System.out.println("B");
            }

        }



    }
}
