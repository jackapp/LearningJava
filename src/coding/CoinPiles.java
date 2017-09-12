package coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ankur on 3/8/17.
 */
public class CoinPiles {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();
            int k = in.nextInt();
            int input[] = new int[n];

            for (int i=0;i<n;i++) {

                input[i] = in.nextInt();
            }

            Arrays.sort(input);

            for (int i=0;i<n;i++) {

                System.out.print(input[i] + " ");
            }

            int start=0,end=n-1,flag=0;
            int coins = 0,temp=0,prevStart=0;
            while (start<end &&flag!=1)  {

                if (input[end] - input[start]<=k ) {

                    flag =1;

                } else {

                    if (input[end]-k-input[start] > input[start]) {


                        if (temp == 0) {

                            prevStart = start;
                        }

                        if (input[end]-k-input[start] < temp) {

                            start = prevStart;
                            end --;
                            coins-=temp;
                            coins+= input[end]-k-input[start];
                            temp =0;

                        }  else {
                            temp+=input[start];
                        }
                         //Removing the pile

                        coins+=input[start];
                        start++;
                    } else {

                        if (temp!=0) {

                            start = prevStart;

                            coins-=temp;



                        }

                        temp=0;
                        coins+=input[end]-input[start]-k;
                        end--;

                    }


                }

            }
            System.out.println();
            System.out.println(coins);
        }
    }
}
