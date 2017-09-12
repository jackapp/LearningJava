package coding;

import java.util.Scanner;

import static coding.KthSmallestNo.swap;

/**
 * Created by ankur on 31/7/17.
 */
public class ArrayZigZag {


    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();

            }


            for (int i=0;i<n-1;i++) {

                if (i%2==0) {

                    //less than

                    if (input[i]<input[i+1]) {

                    } else {
                        //Swap
                        swap(input,i,i+1);
                    }

                } else {

                    if (input[i]>input[i+1]) {

                    } else {
                        //Swap
                        swap(input,i,i+1);
                    }
                }


            }


            for (int i=0;i<n;i++) {

                System.out.print(input[i] + " ");
            }

        }

    }

}
