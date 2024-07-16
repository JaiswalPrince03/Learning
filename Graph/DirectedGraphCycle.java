package Graph;

import java.util.ArrayList;

class DirectedGraphCycle {
    boolean dfs(ArrayList<ArrayList<Integer>> adj, int vis[], int pathvisit[], int node, int parent) {
        vis[node] = pathvisit[node] = 1;
        for (Integer adjNode : adj.get(node)) {
            if (vis[adjNode] == 0) {
                if (dfs(adj, vis, pathvisit, adjNode, node)) {
                    return true;
                }
            } else if (vis[adjNode] == 1 && pathvisit[adjNode] == 1 && adjNode != parent) {
                return true;
            }
        }
        pathvisit[node] = 0; // Mark the current node as fully visited
        return false;
    }

    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int pathvisit[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(adj, vis, pathvisit, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}