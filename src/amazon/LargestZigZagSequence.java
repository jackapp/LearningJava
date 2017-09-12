package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 10/8/17.
 */
public class LargestZigZagSequence {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        while (t-- >0) {

            int n = in.nextInt();

            int matrix[][] = new int[n][n];
            int lookup[][] = new int[n][n];

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            //Initialize the matrix
            int i=n-1;
            for (int j=0;j<n;j++) {
                lookup[i][j] = matrix[i][j];
            }


            for (i=n-2;i>=0;i--) {
                for (int j=0;j<n;j++) {

                    lookup[i][j] =matrix[i][j] +  findMax(lookup,i+1,j,n);

                }
            }

            i=0;
            int max=Integer.MIN_VALUE;
            for (int j=0;j<n;j++) {

                if (max<lookup[i][j]) {
                    max = lookup[i][j];
                }

            }

            /*
            for (i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    System.out.print(lookup[i][j] + " ");
                }
                System.out.println();
            }

            */

            System.out.println(max);

        }

    }


    static int findMax(int matrix[][],int row,int column,int n) {
        int i=row,max=Integer.MIN_VALUE;
        for (int j=0;j<n;j++) {

            if (j!=column) {

                if (max<matrix[i][j]) {
                    max = matrix[i][j];
                }

            }
        }

        return max;
    }
}
