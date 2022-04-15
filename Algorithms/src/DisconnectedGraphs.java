public class DisconnectedGraphs {
    public static void main(String[] args) {

    }
    public static int numberComponentsDFS(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if (visited[i] == true){
                dfsHelper(graph,visited,i);
            }
        }
        return 0;
    }
    public static void dfsHelper(int[][] graph, boolean[] visited, int sv){
        System.out.println(""+ sv);
        visited[sv] = true;
        for(int i=0; i<graph.length;i++){
            if(graph[sv][i] ==1 && visited[i]==false){
                dfsHelper(graph,visited,i);
            }
        }
    }
    public static int numberComponentsBFS(int[][] graph) {
        return 0;

    }
    private static int[][] graph1 = {
            {0, 1, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 1, 1, 0}
    };

    private static int[][] graph2 = {
            {0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 1, 1, 0}
    };
}