package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 5/8/17.
 */
public class CChef01 {


    public static void main(String[] args) {


        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        //System.out.println(1^2^3^4);
        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i = 0; i < n; i++) {
                input[i] = in.nextInt();
            }

            int start=1,end=n-2,flag=0,val=1;

            boolean isPresent[] = new boolean[7];

            for (int i=0;i<7;i++) {
                isPresent[i] = false;
            }

            if (input[0]==1 && input[n-1]==1) {

                isPresent[0] = true;
                while (start <= end && flag != 1) {

                    if (input[start]>7) {
                        flag=1;
                    } else {


                        if (input[start] == input[end]) {


                            //Compare the value
                            if (input[start] != val) {

                                if (input[start] == val + 1) {
                                    isPresent[input[start]-1] = true;
                                    val++;
                                } else {
                                    flag = 1;
                                }
                            }


                        } else {
                            flag = 1;
                        }

                        start++;
                        end--;
                    }

                }



            } else {

                flag=1;

            }
            if (flag == 1) {
                System.out.println("no");
            } else {
                boolean temp=true;
                for (int i=0;i<7;i++) {
                   // System.out.print(isPresent[i] + " ");
                    temp= temp & isPresent[i];
                }

                if (temp) {
                    System.out.println("yes");

                } else {

                    System.out.println("no");

                }

            }


        }
    }
}
