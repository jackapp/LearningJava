package coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ankur on 26/7/17.
 */
public class MinPlatform {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        while (cases-- >0) {

            int n=in.nextInt();

            int arrival[] = new int[n];
            int dept[] = new int[n];

            for (int i=0;i<n;i++) {

                arrival[i] = in.nextInt();
            }

            for (int i=0;i<n;i++) {

                dept[i] = in.nextInt();
                /*
                if (arrival[i]>dept[i]) {
                    if (arrival[i]>=1200) {
                        if (dept[i]>1200) {

                            dept[i]+=(24+(arrival[i]-dept[i]));

                        } else {

                            dept[i]+=(12+(arrival[i]-dept[i]));

                        }


                    } else {


                    }
                    dept[i]+=arrival[i];
                }
                */
            }

            Arrays.sort(arrival);
            Arrays.sort(dept);

            //merge the arrays
            int  i=0,j=0;
            int platform=0,maxPlatform=0,platform_flag=0;

            while (i!=n && j!=n) {

                if (arrival[i] < dept[j]) {
                    i++;
                    platform++;

                } else if (arrival[i]==dept[j]) {

                    i++;
                    j++;
                    if (maxPlatform == 0) {
                        platform_flag=1;
                    }

                }else {
                    platform--;
                    j++;
                }

                if (maxPlatform<platform) {
                    maxPlatform=platform;
                }

            }

            if (platform_flag==1 &&maxPlatform==0) {
                maxPlatform+=1;
            }

            System.out.println(maxPlatform);


        }



    }
}
