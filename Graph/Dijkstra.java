package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    int node;
    int distance;
    public Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }
}

public class Dijkstra {
    public int shortestPathLength(int[][] graph) {
        
    
        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[S] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getDistance));
        pq.offer(new Pair(S, 0));
        while (!pq.isEmpty()) {
            Pair temp = pq.poll();
            if (dis[temp.node] < temp.distance) {
                continue;
            }
            dis[temp.node] = temp.distance;
            for (ArrayList<Integer> adjN : adj.get(temp.node)) {
                if (dis[adjN.get(0)] > temp.distance + adjN.get(1)) {
                    pq.offer(new Pair(adjN.get(0), temp.distance + adjN.get(1)));
                }
            }
        }
        return dis;
    }
}
