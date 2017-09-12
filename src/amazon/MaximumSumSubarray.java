package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 18/8/17.
 */
public class MaximumSumSubarray {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int d=14;

        double x = d/5.0;
        System.out.println(x);

        System.out.println("Enter the length of the array and k");

        int n =in.nextInt();
        int k=in.nextInt();

        int input[] = new int[n];
        for (int i=0;i<n;i++) {

            input[i] = in.nextInt();
        }


        int temp[] = new int[n-k+1];

        int start=0;
        for (int j=0;j<k;j++) {
            temp[start] += input[j];
        }

        for (int i=k;i<n&&start<n-k+1;i++) {

            temp[start+1]= temp[start]-input[start]+input[i];
            start++;

        }



        int maxArray[] = new int[n-k+1];
        int max=Integer.MIN_VALUE;
        for (int i=maxArray.length-1;i>=0;i--) {

            if (temp[i]>max) {
                max=temp[i];
            }

            maxArray[i]=max;

        }

        max=Integer.MIN_VALUE;
        for (int i=0;i<n-k-k;i++) {

            if (temp[i]+maxArray[i+k]>max){
                max=temp[i]+maxArray[i+k];
            }

        }

        System.out.println("Ans is" + max);
    }


}
