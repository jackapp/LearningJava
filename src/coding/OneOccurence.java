package coding;

import java.util.Scanner;

/**
 * Created by ankur on 31/7/17.
 */
public class OneOccurence {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];
            int x;
            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();

            }
            x=input[0];
            for (int i=1;i<n;i++) {

                x=x^input[i];

            }

            System.out.println(x);



        }
    }
}
