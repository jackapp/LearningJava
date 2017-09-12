package amazon;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by ankur on 10/8/17.
 */
public class MinimumRopes {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i=0;i<n;i++) {

                int temp = in.nextInt();
                pq.add(temp);

            }

            int res=0;
            while (pq.size()!=0) {

               int x = pq.peek();

                pq.remove(x);

                if (pq.size()!=0) {

                    int y=pq.peek();
                    pq.remove();
                    res+=x+y;
                    pq.add(x+y);

                } else {
                    break;
                }

            }


            System.out.println(res);




        }

    }
}
