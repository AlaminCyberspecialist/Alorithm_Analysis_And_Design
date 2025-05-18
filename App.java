import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       

        Graph g = new Graph(7);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,5);
        g.addEdge(2,6);
       
        System.out.println("DFS starting from vertex 0: ");

        g.DFS(0);
    }
}
