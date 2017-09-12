package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 7/8/17.
 */
public class CChef02 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        while (t-- >0) {

            int n = in.nextInt();
            int d = in.nextInt();

            int input[] = new int[n] ;

            long sum =0;
            for(int i=0;i<n;i++) {

                input[i] = in.nextInt();
                sum=(sum+ input[i]);
            }

            int flag =0;
            long requiredVal = sum/n;

            if (sum%n!=0) {
                flag=1;
            }
            long countAns=0;
            for (int i=0;i<d&&flag!=1;i++) {
                int j=i;
                long dSum=0,noOfElements=0,prev=0,tempAns=0;
                while (j<n-1) {

                    tempAns= (tempAns + (Math.abs((input[j] - requiredVal + prev))));
                   // System.out.println(input[j] - requiredVal + prev);
                    prev=(input[j] - requiredVal + prev);
                    dSum=(dSum + input[j]);
                    noOfElements++;
                    j+=d;
                }

                if (j==n-1) {
                    dSum= (dSum  + input[j]);
                    noOfElements++;
                }
                countAns=(countAns+tempAns);

                if (dSum != (noOfElements*(requiredVal))) {
                    flag=1;
                }


            }

            if (flag == 1) {
                System.out.println("-1");
            } else {
                System.out.println(countAns);

            }

        }
    }
}
