package coding;

import java.util.Scanner;

/**
 * Created by ankur on 2/8/17.
 */
public class CuttedSegments {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();


            int dp[] = new int[n+1];


            dp[0] = 0;
            for (int i = 1; i < n+1; i++) {
                dp[0] = 0;
            }


            if (x<=n) {
                dp[x] = 1;
            }

            if (y<=n) {
                dp[y] = 1;
            }

            if (z<=n) {
                dp[z] = 1;
            }

            for (int i = min(x,y,z)+1; i < n + 1; i++) {
                int a=0,b=0,c=0;
                if (i-x>=0 &&  dp[i-x]>0) {
                    a = dp[i-x]+1;
                }

                if (i-y>=0 && dp[i-y]>0) {
                    b = dp[i-y]+1;
                }

                if (i-z>=0 &&  dp[i-z]>0) {
                    c = dp[i-z]+1;
                }


                dp[i] = Math.max(Math.max(Math.max(a,b),c),dp[i]);

            }
            System.out.println(dp[n]);
            /*
            for (int i=0;i<=n;i++) {
                System.out.println(dp[i]);
            }

            */

        }
    }

    static int min(int x, int y, int z) {

        return Math.min(Math.min(x, y), z);
    }


}