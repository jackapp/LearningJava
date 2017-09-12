package geeks.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by ankur on 24/6/17.
 */
public class BasicGraph {

    private int vertices;
    private LinkedList<Integer> adj[];

    public BasicGraph(int vertices){
        this.vertices = vertices;

        adj = new LinkedList[vertices];

        for (int i=0;i<vertices;i++) {
            adj[i] = new LinkedList();
        }

    }

    public void addEdge(int v1,int v2) {

        adj[v1].add(v2);

    }


    //Code for topological sort

    public void topologicalSort() {

        boolean []visited = new boolean[vertices];
        Stack stack = new Stack();

        for (int i=0;i<vertices;i++) {

            visited[i] = false;

        }

        //Call util
        for (int i=0;i<vertices;i++) {

            if (visited[i]==false) {
                topologicalSortUtil(i,visited,stack);
            }


        }

        while (!stack.empty()) {

            System.out.println(stack.pop() + " ");

        }



    }

    public void topologicalSortUtil(int vertex,boolean []visited,Stack stack) {

        visited[vertex] = true;
        Iterator<Integer> iter = adj[vertex].iterator();

        while (iter.hasNext()){
            Integer i = iter.next();
            if (!visited[i]) {
                topologicalSortUtil(i,visited,stack);
            }


        }

        stack.push(vertex);

    }

}
