package Heaps;

import java.util.PriorityQueue;

public class LC215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(LC215.findKthLargest(nums, k));
    }
}
