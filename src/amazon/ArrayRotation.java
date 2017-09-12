package amazon;

import java.util.Scanner;

/**
 * Created by ankur on 31/8/17.
 */
public class ArrayRotation {

    public static void main(String[] args) {

        //Will work only for cases where distance <= array size

        long x = System.nanoTime();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = in.nextInt();

        int input[] = new int[n];

        for (int i=0;i<n;i++) {

            input[i] = in.nextInt();

        }

        System.out.println("Enter the distance by which array needs to be right rotated");

        int d = in.nextInt();

        rotate (input[0],0,d,input,n);

        for (int i=0;i<n;i++) {

            System.out.print(input[i] + " ");

        }
        System.out.println();
        long y = System.nanoTime();

        System.out.println("Time:" + (y-x));

    }

    static void rotate (int start,int index,int distance,int input[],int chances) {

        if (chances<0) {
            return;
        }

        int newStart = index+distance>=input.length?input[index+distance-input.length]:input[index+distance];
        int newIndex = index+distance>=input.length?index+distance-input.length:index+distance;
        input[newIndex] = start;
        rotate(newStart,newIndex,distance,input,chances-1);

    }
}
