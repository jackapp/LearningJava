package Collections;

import geeks.graphs.Graph;

/**
 * Created by ankur on 24/7/17.
 */
public class LinkedListCreation {


        public static void main(String[] args) {

            int adj[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                    {4, 0, 8, 0, 0, 0, 0, 11, 0},
                    {0, 8, 0, 7, 0, 4, 0, 0, 2},
                    {0, 0, 7, 0, 9, 14, 0, 0, 0},
                    {0, 0, 0, 9, 0, 10, 0, 0, 0},
                    {0, 0, 4, 14, 10, 0, 2, 0, 0},
                    {0, 0, 0, 0, 0, 2, 0, 1, 6},
                    {8, 11, 0, 0, 0, 0, 1, 0, 7},
                    {0, 0, 2, 0, 0, 0, 6, 7, 0}
            };

            Graph g = new Graph(9,adj);




            /*

            LinkedList<Integer> list = new LinkedList<>();

            list.add(1);
            list.add(2);
            list.add(3);

            Iterator iter = list.iterator();

            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

            */
            /*
            CustomLinkedList node3 = new CustomLinkedList(3,null);
            CustomLinkedList node2 = new CustomLinkedList(2,node3);
            CustomLinkedList node1 = new CustomLinkedList(1,node2);

            CustomLinkedList head = node1;
            while (head!=null) {
                System.out.println("Value of this linked list :"+head.getData());
                head = head.next;
            }
            */
        }

}
