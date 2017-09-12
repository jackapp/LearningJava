package coding;

import java.util.*;

/**
 * Created by ankur on 2/8/17.
 */
public class LargestNumber {

    public static void main(String[] args) {

        int t;

        Scanner in = new Scanner(System.in);

        t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            List<List<Integer>> list = new ArrayList<List<Integer>>(10);

            for (int i=0;i<10;i++) {
                list.add(i,new ArrayList<Integer>());
            }

            for (int i = 0; i < n; i++) {

                int temp = in.nextInt();

                if (temp<10) {

                    List<Integer> x = list.get(temp);
                    x.add(temp);

                } else if (temp<100) {
                    List<Integer> x = list.get(temp/10);
                    x.add(temp);
                } else if (temp<1000) {
                    List<Integer> x = list.get(temp/100);
                    x.add(temp);
                } else {
                    list.get(1).add(1000);
                }

            }

            for (int i=1;i<10;i++) {
                //Sort the list

                sortList(list.get(i));

            }

            for (int i=9;i>0;i--) {

                for (Integer x :list.get(i)) {
                    System.out.print(x);
                }
            }
            System.out.println();

        }

    }

    public static void sortList(List<Integer> list) {

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                String x = a.toString();
                String y = b.toString();
               // System.out.println("Comparing "+x + " :" + y);
                if (x.length() == 1) {


                    if (y.length() > 1 && y.toCharArray()[1]>y.toCharArray()[0]) {

                        return 1;

                    } else if (y.length()==1) {
                        return 0;

                    } else {

                        return -1;
                    }

                } else if (y.length() == 1) {

                    //System.out.println("comparng " + x + " " + y);
                    if (x.length() > 1 && x.toCharArray()[1]>x.toCharArray()[0]) {

                        return -1;

                    } else if (x.length()==1) {
                        return 0;

                    } else {

                        return 1;
                    }

                } else if (x.length()<y.length()) {

                    if (x.toCharArray()[1] > y.toCharArray()[1]) {

                        return -1;
                    } else if (x.toCharArray()[1] < y.toCharArray()[1]) {

                        return 1;
                    } else {
                        if (y.toCharArray()[2]>y.toCharArray()[0]) {
                            return 1;
                        } else {
                            return -1;
                        }

                    }

                } else if (x.length()>y.length()) {

                    if (x.toCharArray()[1] > y.toCharArray()[1]) {

                        return -1;
                    } else if (x.toCharArray()[1] < y.toCharArray()[1]) {

                        return 1;
                    } else {
                        if (x.toCharArray()[2]>x.toCharArray()[0]) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                } else if (x.length()== y.length()) {

                    if (x.toCharArray()[1] > y.toCharArray()[1]) {
                        return -1;
                    } else if (x.toCharArray()[1] == y.toCharArray()[1]) {

                        if (x.length()==3) {
                            if (x.toCharArray()[2] > y.toCharArray()[2]) {

                                return -1;

                            } else {
                                return 1;
                            }
                        } else {
                            return 0;
                        }

                    }

                }

                return 1;
            }
        });

    }
}
