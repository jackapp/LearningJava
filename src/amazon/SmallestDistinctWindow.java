package amazon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ankur on 10/8/17.
 */
public class SmallestDistinctWindow {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        while (t-- >0) {

            String s = in.next();

            char input[] = s.toCharArray();

            HashMap<Character,Integer> map = new HashMap<>();

            for (Character i : input) {

                map.put(i,1);

            }

            HashMap<Character,Integer> tempMap = new HashMap<>();
           // System.out.println("Length is " + input.length);
            boolean lastFlag=false,found=false;
            int min=input.length;
            int i=0,start=0;
            tempMap.put(input[0], 1);
            while (i<input.length) {

                //System.out.println("start is" + start + "i" + i + "Min is:" +min);


                //System.out.println("Map key is" + tempMap.keySet() + "value is" + tempMap.values());

                if (tempMap.keySet().equals(map.keySet())) {

                    if (min>i-start+1){
                        min = i-start+1;

                    }


                    found= true;


                    //Remove the start element
                    if (tempMap.get(input[start])!=1) {

                        tempMap.put(input[start],tempMap.get(input[start])-1);

                    } else {

                        tempMap.remove(input[start]);

                    }

                    start++;

                } else {

                    found=false;

                    if (i != (input.length - 1)) {
                        i++;
                    } else {
                        lastFlag = true;
                    }

                    if (!lastFlag) {

                        if (!tempMap.containsKey(input[i])) {

                            tempMap.put(input[i], 1);

                        } else {

                            tempMap.put(input[i], tempMap.get(input[i]) + 1);
                        }


                    } else {
                        break;
                    }
                }

            }
/*
            for (int j=start;j<=i;j++) {
                System.out.print(input[j]);
            }

            System.out.println();
*/
            System.out.println(min);

            }




        }
    }

