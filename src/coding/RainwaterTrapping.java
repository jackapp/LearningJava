package coding;

import java.util.Scanner;

/**
 * Created by ankur on 29/7/17.
 */
public class RainwaterTrapping {

    public static void main(String[] args) {
        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];
            int right[] = new int[n];
            int left[] = new int[n];

            for(int i=0;i<n;i++) {

                input[i] = in.nextInt();

            }


            //Creating NGE left to right.


            //Code for NGE
            int leftMax=input[0];
            for (int i=1;i<n;i++) {

                if (leftMax<input[i]) {
                    leftMax = input[i];

                }

                left[i]=leftMax;

            }
            int rightMax=input[n-1];

            for (int i=n-2;i>=0;i--) {

                if (rightMax < input[i]){
                    rightMax=input[i];
                }

                right[i] = rightMax;
            }

            right[n-1] = -1;
            left[0] = -1;
            int i=0;
            /*
            System.out.print("Right array is");
            for (i=0;i<n;i++) {

                System.out.println(right[i]);
            }

            System.out.print("Left array is");
            for (i=0;i<n;i++) {

                System.out.println(left[i]);
            }

            */


            int sum=0;
            for (i=0;i<n;i++) {

                int r=right[i];
                int l=left[i];

                if (r==-1 || l==-1) {

                }   else {

                    if (l>r) {

                        sum+=(r-input[i]);

                    } else {

                        sum+=(l-input[i]);
                    }
                }





            }

            System.out.println(sum);






        }
    }
}
