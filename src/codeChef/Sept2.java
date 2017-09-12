package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 1/9/17.
 */
public class Sept2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            int start=2;

            if (n%2==0) {

                //Even swap adjacent in pairs
                while (start<=n) {


                    System.out.print(start + " ");
                    System.out.print(start - 1 + " ");
                    start += 2;
                }
                System.out.println();

            } else {

                while (start<=n-3) {


                    System.out.print(start + " ");
                    System.out.print(start - 1 + " ");
                    start += 2;
                }

                System.out.print( start+ " ");
                System.out.print(start+1 + " ");
                System.out.print(start-1 +  " ");
                System.out.println();

            }


        }

    }
}
