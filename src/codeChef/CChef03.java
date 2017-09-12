package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 8/8/17.
 */
public class CChef03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();
            int m = in.nextInt();

            int minSalary[] = new int[n];
            for (int i=0;i<n;i++) {

                minSalary[i] = in.nextInt();
            }

            int offeredSalary[] = new int[m];
            int maxOffers[] = new int[m];


            for (int i=0;i<m;i++) {

                offeredSalary[i] = in.nextInt();
                maxOffers[i] = in.nextInt();

            }

            int qual[][] = new int[n][m];

            for (int i=0;i<n;i++) {

                for (int j=0;i<m;j++) {

                    qual[i][j] = in.nextInt();

                }
            }







        }

    }
}
