package coding;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ankur on 1/8/17.
 */
public class KthGreatestElement {

    public static void main(String[] args) {
        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {
            int k = in.nextInt();
            int n = in.nextInt();

            int input[] = new int[n];
            //System.out.println("N and K are" + n +" "+ k);
            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();

            }

            Queue<Integer> pq = new PriorityQueue<>();
           // pq.add(input[0]);
           // System.out.print(pq.peek() + " ");
            for (int i=0;i<n;i++) {

                if (pq.size()<k) {

                    if (pq.size()!=k-1) {
                        System.out.print("-1 ");
                    }

                    pq.add(input[i]);
                } else  {

                    //If the value of array is greater than peek then pop the value then push
                    if (input[i]>pq.peek()) {
                        System.out.print(pq.peek() + " ");
                        pq.remove(pq.peek());
                        pq.add(input[i]);

                    } else {
                        System.out.print(pq.peek() + " ");
                    }

                }



            }
            System.out.print(pq.peek() + " ");
            System.out.println("");

        }
    }

}
