package Graph;

import java.util.ArrayList;


class DFSgraph {
     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] visit = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(adj, visit, 0, ans);
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int node, ArrayList<Integer> ans){
        visit[node] = 1;
        ans.add(node);
        for(int adjNode : adj.get(node)){
            if(visit[adjNode] == 0){
                dfs(adj, visit, adjNode, ans);
            }
        }
    }

 public static void main(String[] args) {
    }
}