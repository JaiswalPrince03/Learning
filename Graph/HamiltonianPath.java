package Graph;

import java.util.ArrayList;

public class HamiltonianPath {
    // Function to detect Hamiltonian path in an undirected graph.
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=N; i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : Edges){
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        int pathvisit[] = new int[N+1];
        int vis[] = new int[N+1];
        for(int i=1;i<=N;i++){
            if(dfs(adj, vis, pathvisit, i, 0, N)){
                return true;
            }
        }
        return false;
    }

    boolean dfs(ArrayList<ArrayList<Integer>> adj, int vis[], int pathvisit[], int node, int count,int n) {
        count++;
        if (count==n) return true;
        pathvisit[node] = 1;
        
        for (Integer adjNode : adj.get(node)) {
            if (pathvisit[adjNode] == 0) {
                if (dfs(adj, vis, pathvisit, adjNode, count,n)) {
                    return true;
                }
            }
        }
        pathvisit[node] = 0; // Mark the current node as fully visited
        count--;
        return false; // Placeholder return statement
    }
}
