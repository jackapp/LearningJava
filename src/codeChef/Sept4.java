package codeChef;

import java.util.*;

/**
 * Created by ankur on 6/9/17.
 */
public class Sept4 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {

            int n= in.nextInt();
            int q = in.nextInt();

            Node nArr[] = new Node[n+1];

            for (int i=0;i<=n;i++) {

                nArr[i] = new Node();
            }

            boolean flag = false;
            int start1=0,start2=0;

            List<List<Integer>> list = new ArrayList<List<Integer>>();
            for (int i=0;i<q && !flag;i++) {

                int v1 = in.nextInt();
                int v2 = in.nextInt();
                int val = in.nextInt();


                if (v1>v2) {
                    //Swap
                    int temp = v2;
                    v2=v1;
                    v1=temp;
                }

                if (v1 == v2 && val!=0) {
                    flag=true;
                    break;
                }



                if (nArr[v1].visited == false && nArr[v2].visited == false) {

                    list.add(new ArrayList<>(Arrays.asList(v1, v2)));

                    start1=v1;
                    start2=v2;
                    nArr[v1].visited = true;
                    nArr[v2].visited = true;

                    nArr[v1].xorVal = val;
                    nArr[v2].xorVal = val;


                } else if (nArr[v1].visited == true && nArr[v2].visited == true) {

                    //Cycle possible or same value repeated again!

                    //Check if cycle starts from starting node

                    if (Collections.indexOfSubList(list,new ArrayList<>(Arrays.asList(v1, v2)))!=-1) {
                        System.out.println("Here");
                        flag = true;
                    } else {

                        list.add(new ArrayList<>(Arrays.asList(v1, v2)));



                    if (v1 == start1 || v1 == start2) {

                        if ((v1 ^ val) == v2) {

                            // Legit
                        } else {

                            flag = true;
                        }


                    } else if (v2 == start2 || v2 == start1) {

                        if ((v1 ^ val) == v2) {

                            // Legit
                        } else {

                            flag = true;
                        }


                    } else {

                        if ((v1 ^ val) == v2) {

                            // Legit
                        } else {

                            flag = true;
                        }


                    }

                    }

                } else if (nArr[v1].visited == true || nArr[v2].visited == true ) {


                    list.add(new ArrayList<>(Arrays.asList(v1, v2)));

                    if (nArr[v1].visited == true) {

                        nArr[v2].xorVal = nArr[v1].xorVal ^ val;

                    } else {

                        nArr[v1].xorVal = nArr[v2].xorVal ^ val;

                    }


                }

            }

            System.out.println(list);
            if (!flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }




        }
    }
}

class Node {

    int xorVal;
    boolean visited;
    boolean selected;

    Node() {
        xorVal=0;
        this.visited=false;
        this.selected=false;
    }

}
