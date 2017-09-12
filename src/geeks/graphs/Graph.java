package geeks.graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ankur on 24/7/17.
 */
public class Graph {

    private int vertices;

    private int [][]adj = new int[vertices][vertices];


    public Graph (int vertices,int [][]adj) {
        this.vertices = vertices;
        this.adj = adj;

    }


    public void findShortestPath(int startIndex) {

        boolean visited[] = new boolean[vertices];
        visited[startIndex] = true;

        //SortedSet<Integer> tempSet = new TreeSet<>();

        Set<Integer> mainSet = new HashSet<>();

        mainSet.add(startIndex);
        int distance[] = new int[vertices];

        for (int i=0;i<vertices;i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[startIndex] = 0;
        //tempSet.add(distance[startIndex]);

        while (mainSet.size()!=vertices) {

            //Find the min of all the vertices in the array.




        }




    }



}
