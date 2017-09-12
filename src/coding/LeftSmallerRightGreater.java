package coding;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ankur on 30/7/17.
 */
public class LeftSmallerRightGreater {

    public static void main(String[] args) {


        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int input[] = new int[n];

            for (int i = 0; i < n; i++) {

                input[i] = in.nextInt();

            }

            Stack<Integer> stack = new Stack<>();
            //If we encounter a maximum then push it to stack
            int max=input[0];
            boolean flag = false;
            for (int i=1;i<n;i++) {

                if (input[i]>=max) {


                    if (i==n-1 && stack.isEmpty()) {

                        flag = false;
                    } else {
                        max=input[i];
                        stack.push(max);
                        flag=true;
                    }




                } else {
                    //System.out.println("Element here is"+input[i]);
                    while (stack.size()>0 && stack.peek()>input[i]) {
                     //   System.out.println("Popped" + stack.peek());
                        stack.pop();

                    }

                }


            }


            if (stack.isEmpty()) {
                System.out.println("-1");
            } else if (flag==false) {
                System.out.println("-1");
            } else {
                while (stack.size()!=1) {
                    stack.pop();
                }
                System.out.println(stack.peek());
            }

        }
    }
}
