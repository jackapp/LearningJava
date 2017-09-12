package coding;

import java.util.Scanner;

/**
 * Created by ankur on 30/7/17.
 */
public class StockBuySell {

    public static void main(String[] args) {


        int t;

        Scanner in = new Scanner(System.in);

        t=in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();
            }

            //Keep scanning for the min and then when there s a decreasing seq repeat it again

            int min=0;
            int profit=0,tempval=0;
            boolean flag=false;
            for (int i=0;i<n-1;i++) {

                if (input[i]<input[i+1]) {

                    tempval=i+1;
                    flag=true;

                } else {

                    if (tempval!=0) {
                        System.out.print("(" +  min + " " + tempval + ")" + " ");
                    }

                    min=i+1;
                    tempval=0;
                }


            }

            if (tempval!=0) {
                System.out.print("(" +  min + " " + tempval + ")" + " ");
            }

            if (!flag) {
                System.out.print("No Profit");
            }

            System.out.println();



        }

        }
}


