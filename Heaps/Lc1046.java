package Heaps;

import java.util.PriorityQueue;
import java.util.Collections;

public class Lc1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.add(stone);
        }
        while(pq.size() > 1){
            int st1 = pq.poll();
            int st2 = pq.poll();
            if(st1 != st2){
                pq.add(Math.abs(st1 - st2));  
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();

    }
}
