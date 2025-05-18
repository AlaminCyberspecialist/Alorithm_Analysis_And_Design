import java.util.*;

public class Graph {

private int vertices;
private LinkedList<Integer>[]adjacencyList;

public Graph(int vertices){
    this.vertices = vertices;
    this.adjacencyList = new LinkedList[vertices];

    for(int i=0;i<vertices;i++){
        this.adjacencyList[i] =new LinkedList<>();
    }
}
public void addEdge(int from,int to){
    adjacencyList[from].add(to);
}

public void DFS(int start){
    boolean[] visited = new boolean[vertices];

    DFSUtil(start,visited);
}
public void DFSUtil(int curr,boolean[] visited){
    visited[curr] = true;
    System.out.println(curr+ " ");

    for(int neigh:adjacencyList[curr]){
        if(!visited[neigh]){
            DFSUtil(neigh, visited);
        }
    }
}
    
}
