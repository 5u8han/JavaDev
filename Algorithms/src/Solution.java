import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input  = new Scanner(System.in);
        int nodeU, nodeV, Weight;
        int nodes = input.nextInt();
        int edges = input.nextInt();
        int [][] Graph = new int[nodes][nodes];

        for (int i=0; i<edges; i++){
            nodeU = input.nextInt(); nodeV = input.nextInt(); Weight = input.nextInt();

            Graph[nodeU][nodeV] = Weight;
            Graph[nodeV][nodeU] = Weight;

        }

        Solution Sol = new Solution();
        Sol.MST(Graph, nodes);
    }

    public void MST(int [][] Graph, int V){
        int inf = Integer.MAX_VALUE;

        boolean [] visited = new boolean [V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }

        visited[0] = true;
        int cost = 0, numEdge = 0;

        while (numEdge < V - 1) {
            int min_Weight = inf, u = 0,v = 0;

            for (int i = 0; i < V; i++) {
                if (visited[i] == true) {

                    for (int j = 0; j < V; j++) {
                        if (!visited[j] && Graph[i][j] != 0) {

                            if (min_Weight > Graph[i][j]) {
                                min_Weight = Graph[i][j];
                                u = i;
                                v = j;
                            }
                        }

                    }
                }
            }
            cost += Graph[u][v];
            visited[v] = true;
            numEdge++;
        }
        System.out.println(cost);
    }
}