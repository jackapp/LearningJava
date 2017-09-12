package coding;

import java.util.Scanner;

/**
 * Created by ankur on 3/8/17.
 */
public class MinNoOfCoins {


    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int t = in.nextInt();
        int []arr= new int[]{ 1, 2, 5, 10, 20, 50, 100, 500, 1000};
        while (t-- >0) {

            int n= in.nextInt();
            int temp = n;
            int coins=0;
            int i=arr.length-1;
            while (temp>0) {
                if (arr[i]>temp) {

                    i--;

                } else {

                    coins+=temp/arr[i];
                    int j= temp/arr[i];
                    while (j>0 ) {
                        System.out.print(arr[i] + " ");
                        j--;
                    }

                    temp=temp%arr[i];

                }



            }

           // System.out.println(coins);


        }
    }
}
