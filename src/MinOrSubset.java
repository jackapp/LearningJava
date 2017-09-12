import java.util.Scanner;

/**
 * Created by ankur on 25/8/17.
 */
public class MinOrSubset {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i=0;i<n;i++) {

                input[i] = in.nextInt();
            }

            int orVal=input[0];
            for (int i=1;i<n;i++) {

                orVal= orVal | input[i];
            }




        }

    }
}
