package amazon;

import java.util.*;

/**
 * Created by ankur on 11/8/17.
 */
public class MaxAmount {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {


            HashMap<List<Integer>, Integer> map = new HashMap();

            int n = in.nextInt();
            int input[] = new int[n];
            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();


            }


            for (int i = 0; i < n - 1; i++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(input[i]);
                list.add(input[i + 1]);

                map.put(list, (input[i]>input[i + 1])?input[i]:input[i+1]);
            }


            for (int i = 3; i <= n; i++) {

                generateDp(input, i, map);
            }
            /*
            Iterator iter= map.entrySet().iterator();

            while (iter.hasNext()){

                Map.Entry entry = (Map.Entry) iter.next();
                System.out.println(entry.getKey() + " : "+ entry.getValue() );
            }
            */

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(input[i]);
            }

            System.out.println(map.get(temp));

            long endTime   = System.currentTimeMillis();
            long totalTime = endTime - startTime;

            System.out.println(totalTime);

        }
    }


    static void generateDp(int input[],int size,HashMap<List<Integer>,Integer> map) {

        int start = 0;

        for(int i=0;i<=input.length-size;i++) {
            int j=i+1,sum=0;
            List<Integer> list = new ArrayList<Integer>();
            while (j<i+size) {
                list.add(input[j]);
                sum+=input[j];
                j++;

            }

            //Compare first with first element
           // System.out.println("Before" +list);
            int first = sum-map.get(list);

            list.remove(list.size()-1);

            list.add(0,input[i]);

            //System.out.println("After " +list);

            sum=sum-input[j-1]+input[i];

            int second = sum-map.get(list);

            list.add(input[j-1]);




        }


    }
}
