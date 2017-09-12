package codeChef;

import java.util.Scanner;

/**
 * Created by ankur on 3/9/17.
 */
public class Sept3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {

            String input = in.next();

            char []ch = input.toCharArray();

            int []numbers = new int[10];

            for (int i=0;i<10;i++) {
                numbers[i] =0;
            }

            for (char c : ch) {

                int x =Character.getNumericValue(c);
                if (numbers[x]<2) {
                    numbers[x]++;
                }

            }

            int start = 65;

            while (start<=90) {

                if (isPresent(start,numbers)) {
                    System.out.print((char)start + "");
                }

                start++;
            }

            System.out.println();


        }

    }

    static boolean isPresent(int n,int []numbers) {

        int first = n/10;
        int second = n%10;

        //Search if both are present.

        if (numbers[first]!=0) {

            numbers[first]--;

            if (numbers[second]!=0) {
                numbers[first]++;
                return true;
            } else {
                numbers[first]++;
                return false;
            }



        } else {
            return false;
        }

    }

}
