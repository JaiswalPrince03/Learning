// package Heaps;

import java.util.PriorityQueue;
import java.util.Collections;

public class LC295 {
    // Using two heaps to divide the numbers into two parts
    // maxHeap to store the smaller half of the numbers
    private PriorityQueue<Integer> maxHeap;
    // minHeap to store the larger half of the numbers
    private PriorityQueue<Integer> minHeap;

    public LC295() {
        // Initialize the heaps
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        // Add the number to the correct heap
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        
        // Balance the heaps to ensure the size difference is at most 1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        // Calculate the median based on the size of the heaps
        if (maxHeap.size() == minHeap.size()) {
            // If the total number of elements is even, the median is the average of the top elements of both heaps
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            // If the total number of elements is odd, the median is the top element of the maxHeap
            return maxHeap.peek();
        }
    }
    
}
