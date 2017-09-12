package coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ankur on 29/7/17.
 */
public class DistributionProblem {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t=in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();

            }

            int m=in.nextInt();

            Arrays.sort(input);

            //Take a window of m and start comparing
            int i=m-1,min=Integer.MAX_VALUE;
            while (i<n) {

                if (input[i]-input[i-(m-1)]<min) {

                    min=input[i]-input[i-m+1];

                }


                i++;
            }

            System.out.println(min);


        }



        }
}
