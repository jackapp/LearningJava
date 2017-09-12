package coding;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ankur on 29/7/17.
 */
public class NextGreatestElement {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t=in.nextInt();

        while (t-- >0) {

            int n=in.nextInt();

            int input[] = new int[n];

            for(int i=0;i<n;i++) {

                input[i] = in.nextInt();

            }

            Stack<Integer> stack = new Stack<>();
            int next=1;
            int i=0;
            while (i<n-1 && next<n){

                if (input[i]<input[next]) {
                    //Pop the stack untill its empty
                    while (stack.size()>0){
                        System.out.println(input[next]);
                        stack.pop();
                    }
                    System.out.println(input[next]);
                    i=next;
                    next+=1;
                } else if (stack.size()>0 && input[next]>stack.peek()) {

                    System.out.println(input[next]);
                    stack.pop();

                } else {

                    //Keep pushing element in the stack

                    stack.push(input[next]);
                    next++;

                }



            }

            while (stack.size()>0) {
                System.out.println("-1");
                stack.pop();
            }

            System.out.println(input[n-1]);


        }

    }
}
