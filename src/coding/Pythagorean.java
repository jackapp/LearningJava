package coding;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ankur on 29/7/17.
 */
public class Pythagorean {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t=in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            int input[] = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();
                input[i]*=input[i];
                map.put(input[i],1);

            }

            System.out.println(findTriplet(map,input)?"Yes":"No");

        }


    }


    public static boolean findTriplet(HashMap<Integer,Integer>map,int []input) {

        int n=input.length;
        for (int i=0;i<n;i++) {

            for (int j=i;i<n;j++) {

                if (map.containsKey(input[i]+input[j])) {
                    return true;
                }

            }

        }
        return false;

    }
}
