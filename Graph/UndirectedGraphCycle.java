package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycle {
   /* .............................................................................................................................
    // Using DFS
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visit = new int[V];
        for(int i = 0; i < V; i++){
            if(visit[i] == 0){
                if(dfs(adj, visit, i, -1))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int node, int parent) {
        visit[node] = 1; // Mark the current node as visited
        for(int adjNode : adj.get(node)){
            if(visit[adjNode] == 0){
                if(dfs(adj, visit, adjNode, node))
                    return true;
            } else if(adjNode != parent && visit[adjNode] == 1) { // Check if the adjacent node is not the parent and is currently being visited
                return true; // Cycle detected
            }
        }
        visit[node] = 2; // Mark the current node as fully visited
        return false;
    } 
    .........................................................................................................................*/
    // Using BFS
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visit = new int[V];
        for(int i = 0; i < V; i++){
            if(visit[i] == 0){
                if(bfs(adj, visit, i))
                    return true;
            }
        }
        return false;
    }

    private boolean bfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int node) {
        //  java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visit[node] = 1; // Mark the current node as visited
        int parent = -1;
        while(!queue.isEmpty()){
            int currNode = queue.poll();
            for(int adjNode : adj.get(currNode)){
                if(visit[adjNode] == 0){
                    visit[adjNode] = 1; // Mark the adjacent node as visited
                    queue.add(adjNode);
                    parent = currNode;
                } else if(visit[adjNode] == 1 && adjNode != parent) { // Check if the adjacent node is currently being visited and not the parent
                    return true; // Cycle detected
                }
            }
            visit[currNode] = 2; // Mark the current node as fully visited
        }
        return false;
    }
}
