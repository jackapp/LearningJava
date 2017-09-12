package coding;

import java.util.Scanner;


/**
 * Created by ankur on 26/7/17.
 */
public class KthSmallestNo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();

        while (cases-- >0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i=0;i<n;i++) {

                input[i] = in.nextInt();
            }

            int k=in.nextInt();

            //Take pivot as last element
            int pivot = input[n-1];
            int pivotPos=-1;
            int high=n-2,low=0,end=n-1;


            while (pivotPos!=k-1) {

              //  System.out.println("Pivot position here is "+end);

                pivotPos = rearrange(input,low,high,end);

             //   System.out.println("After rearranging it is "+pivotPos);

            //System.out.println("Returned position:" + pivotPos);

                if (pivotPos>k-1) {

                    high=pivotPos-2;
                    end=pivotPos-1;
                    pivot=input[end];

                }

                if (pivotPos<k-1) {

                    low=pivotPos+1;
                    pivot=input[end];


                }

            //    System.out.println("Array after iteration is:");
                for (int i=0;i<n;i++) {
                    System.out.print(input[i] + "  ");
                }
                System.out.println();

            }

            System.out.println(input[pivotPos]);
            //System.out.println("Final ans is "+input[pivotPos]);
        }



    }


    static void swap(int input[],int low,int high) {

        int temp;
        temp = input[low];
        input[low] = input[high];
        input[high] = temp;


    }


    static int rearrange(int input[],int start,int finish,int end) {
        int low=start,high=finish;
        int pivot = input[end];
        while (low < high) {

            //Shuffle the array

            if (input[low] < pivot) {

                low++;

            } else {

                //Check if high is okay or not

                if (input[high] > pivot) {

                    high--;

                } else {
                    //Swap
                    KthSmallestNo.swap(input, low, high);


                }

            }


           // System.out.println("Looping");

        }

        //Need to swap the pivot element and low or high
       // System.out.println("Low is "+low+"and high is"+high);
        if (input[high]>pivot){

            KthSmallestNo.swap(input,high,end);
            return high;

        } else {
            //Do nothing
            return end;
        }



    }



}
