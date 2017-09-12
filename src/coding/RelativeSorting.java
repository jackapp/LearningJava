package coding;

import java.util.*;

/**
 * Created by ankur on 1/8/17.
 */
public class RelativeSorting {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();
            int m = in.nextInt();

            int input[] = new int[n];
            int second[] = new int[m];

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();
                if (!map.containsKey(input[i])) {

                    map.put(input[i],1);

                } else {

                    map.put(input[i],map.get(input[i])+1);

                }

            }

            for (int i=0;i<m;i++) {

                second[i] = in.nextInt();

            }
            for (int i=0;i<m;i++) {
                if (map.get(second[i])!=null) {
                    for (int j=0;j<map.get(second[i]);j++) {

                        System.out.print(second[i] +" ");

                    }

                    map.remove(second[i]);
                }


            }

            //Sort the hashmap now

            Map<Integer, Integer> newMap = new TreeMap<Integer, Integer>(map);

            Iterator it = newMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();

                for (int j=0;j<(Integer) pair.getValue();j++) {

                    System.out.print(pair.getKey() + " " );

                }

                it.remove(); // avoids a ConcurrentModificationException
            }




        }
    }
}
