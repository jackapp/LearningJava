package coding;

import java.util.Scanner;

/**
 * Created by ankur on 3/8/17.
 */
public class FourKeysKeyboard {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int dp[] = new int[n+1];
        int buffArr[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int temp=0;
        int a=0,b=0,c=0,buff=0;
        for (int i=2;i<n+1;i++) {

            if (i-1>=0) {

                a=Math.max(dp[i - 1] + buffArr[i-1],dp[i-1] + 1);
               // System.out.println("A is "+a);
            }

            if (i-2 >=0) {
                    b=Math.max(dp[i-2] + 2*(buffArr[i-2]),dp[i-1] + 1);
                   // System.out.println("B is "+b);
            }

            if (i-3 >=0) {

                    temp = 2*dp[i-3];
                    int x = Math.max((3*(buffArr[i-3])) + dp[i-3],temp);
                    c = Math.max(x,dp[i-1]+1);
                    //System.out.println("C is "+c);



            }

            int overallMax = Math.max(Math.max(a,b),c);

            if (overallMax == temp) {
                buff=dp[i-3];
            }
            dp[i] = overallMax;
            buffArr[i] = buff;
           // System.out.println(" DP :"  +dp[i] + " Buff:" + buff);
        }
        System.out.println(dp[n]);

    }
}
