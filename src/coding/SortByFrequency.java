package coding;

import java.util.*;

/**
 * Created by ankur on 1/8/17.
 */
public class SortByFrequency {

    public static void main(String[] args) {


        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();
                if (!map.containsKey(input[i])) {

                    map.put(input[i],1);

                } else {

                    map.put(input[i],map.get(input[i])+1);

                }

            }


            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
            Collections.sort( list, new Whatever());

            for(Map.Entry<Integer, Integer> entry:list){

                for (int i=0;i<(Integer)entry.getValue();i++) {
                    System.out.print(entry.getKey()+" ");
                }

            }

            System.out.println("");
        }

    }


    }

class Whatever implements Comparator<Map.Entry<Integer, Integer>>{


    @Override
    public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ) {
        return (o2.getValue()).compareTo( o1.getValue() );
    }
}



