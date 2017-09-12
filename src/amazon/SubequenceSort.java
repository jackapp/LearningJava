package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 29/8/17.
 */
public class SubequenceSort {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int []input = new int[n];

        for (int i=0;i<n;i++) {
            input[i] = in.nextInt();
        }

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int rightMax=Integer.MIN_VALUE;

        for (int i=n-1;i>=0;i--) {

            if (input[i] > rightMax ) {

                rightMax = input[i];

            }

            arr1[i]=rightMax;

        }

        rightMax = arr1[n-2];

        for (int i=n-1;i<n;i++) {

           if (rightMax!=arr1[i]) {


           }

        }






    }
}
