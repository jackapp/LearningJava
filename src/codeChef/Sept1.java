package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 1/9/17.
 */
public class Sept1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        while (t-- >0) {

            int n= in.nextInt();

            int input[] = new int[n];
            long suffixSum=0;
            for (int i=0;i<n;i++) {

                input[i] = in.nextInt();
                suffixSum+=input[i];

            }
            long prefixSum=0;
            long minSum=Long.MAX_VALUE,sum;
            int index=0;

            for (int i=0;i<n;i++) {

                prefixSum+=input[i];
                suffixSum-=i>0?input[i-1]:0;

                sum = prefixSum + suffixSum;
                if (sum<minSum) {
                    minSum=sum;
                    index = i;
                }

            }

            System.out.println(index+1);






        }

    }

}
