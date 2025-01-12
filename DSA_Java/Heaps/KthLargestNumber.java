/*
 * leetcode 703
 * Implement the KthLargest class:
 * 
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and
 * the stream of test scores nums.
 * 
 * int add(int val) Adds a new test score val to the stream and returns the
 * element representing the kth largest element in the pool of test scores so
 * far.
 * 
 * Approach is that for Kth Largest or samllest the most efficient is Heap.
 * in case of Max heap the Time complexity would be O(nlog n) in this qn.
 * but if we use Min Heap the time compplexity would be O(n log k)
 * where k is the position we want
 * 
 * now we maintain min heap in which we insert element and maintain it at size of k
 * when heap size > k we remove the smallest element in the heap
 */
import java.util.*;
class KthLargest {
    public PriorityQueue<Integer> p;
    public int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        p = new PriorityQueue<>(k);
        for (int ele : nums) {
            p.offer(ele);
            if (p.size() > k) {
                p.poll();
            }
        }
    }

    public int add(int val) {
        p.offer(val);
        if (p.size() > k) {
            p.poll();
        }
        return p.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */