package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 10/8/17.
 */
public class SteppingNumbers {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int ans[] = new int[1000001];

        for (int i=0;i<1000001;i++) {
            ans[i]=0;
        }

        int count=1;
        for (int i=0;i<=9;i++) {
            ans[i] = count++;
        }



        generateNextNo(new int[]{1,0},0,ans);
        generateNextNo(new int[]{1,0,0},0,ans);
        generateNextNo(new int[]{1,0,0,0},0,ans);
        generateNextNo(new int[]{1,0,0,0,0},0,ans);
        generateNextNo(new int[]{1,0,0,0,0,0},0,ans);



        int prev= ans[9];
        for (int i=10;i<1000001;i++) {

            ans[i] +=prev;
            prev=ans[i];

        }



        while (t-- >0) {

            int n = in.nextInt();
            int m = in.nextInt();

            if (n!=0) {
                System.out.println(ans[m]-ans[n-1]);
            } else {
                System.out.println(ans[m]);
            }


        }


    }


    static void generateNextNo(int[] digits,int pos,int []ans) {

        if (pos==digits.length) {
            int i, k = 0;
            for (i = 0; i < digits.length; i++)
                k = 10 * k + digits[i];

            int n = k;
            ans[n]=1;

        } else {

            if (pos!=0) {

                //Check if previous digit +-1
                if (digits[pos - 1] == 0) {
                    digits[pos] = 1;
                    generateNextNo(digits, pos + 1, ans);
                } else if (digits[pos - 1] == 9) {

                    digits[pos] = digits[pos-1]-1;
                    generateNextNo(digits,pos+1,ans);

                }
                else{

                    digits[pos] = digits[pos-1]-1;
                    generateNextNo(digits,pos+1,ans);
                    digits[pos] = digits[pos-1]+1;
                    generateNextNo(digits,pos+1,ans);


                }

            } else {

                digits[0] = 1;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 2;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 3;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 4;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 5;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 6;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 7;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 8;
                generateNextNo(digits,pos+1,ans);
                digits[0] = 9;
                generateNextNo(digits,pos+1,ans);
            }

        }

    }
}
