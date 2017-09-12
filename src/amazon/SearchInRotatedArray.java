package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 31/8/17.
 */
public class SearchInRotatedArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int input[] = new int[n];

        for (int i=0;i<n;i++) {

            input[i] = in.nextInt();

        }

        int element = in.nextInt();

        boolean found = bSearch(input,element,0,n);
        System.out.println(found);

    }

    static boolean bSearch(int input[],int element,int low,int high) {

        if (low<=high) {

            int mid = low + ((high-low)/2);

            if (input[mid]==element) {
                return true;
            } else if (input[mid]<element) {

                if (input[low] < element ) {

                    return bSearch(input,element,mid,high);

                } else if (input[low] == element) {
                    return  true;

                } else {
                    if (element < input[high]) {


                        return bSearch(input, element,low,mid );
                    } else {

                        return bSearch(input,element,mid,high);
                    }
                }




            } else {

                //Mid is smaller than element

                if (input[low] < element ) {

                    return bSearch(input,element,mid,high);

                } else if (input[low] == element) {
                    return  true;

                } else {
                    if (element < input[high]) {


                        return bSearch(input, element,mid,high );
                    } else {

                        return bSearch(input,element,low,mid);
                    }
                }



            }



        }

        return false;

    }
}
