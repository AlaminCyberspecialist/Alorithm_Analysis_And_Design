import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[]adjacencyList;

    public Graph(int vertices){
        this.vertices =vertices;
        this.adjacencyList=new  LinkedList[vertices];

        for(int i=0;i<vertices;i++){
            this.adjacencyList[i] =new LinkedList<>();
        }
    }

    public void addEdge(int from,int to){
        adjacencyList[from].add(to);
    }





    public void  BFS(int start){

        boolean[]  visited = new boolean[vertices];
        Queue<Integer>q=new LinkedList<>();

        visited[start] =true;

        q.add(start);

        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.println(curr+ " ");

            for(int neigh:adjacencyList[curr]){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }
}
