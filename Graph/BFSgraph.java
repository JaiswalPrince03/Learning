package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSgraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visit = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        bfs(adj, visit, 0, ans, Q);
        return ans;
    }

    private void bfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int node, ArrayList<Integer> ans, Queue<Integer> q) {
        visit[node] = 1;
        ans.add(node);
        q.add(node);
        while (!q.isEmpty()) {
            node = q.poll();
            for (Integer adjNode : adj.get(node)) {
                if (visit[adjNode] == 0) {
                    visit[adjNode] = 1;
                    ans.add(adjNode);
                    q.add(adjNode);
                }
            }
        }
    }
}
