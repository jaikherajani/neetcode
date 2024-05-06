package org.example;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> fMap = new HashMap<>();

        for (int n : nums) {
            fMap.put(n, fMap.getOrDefault(n, 0) + 1);
        }

        Set<Integer> fSet = fMap.keySet();
        Queue<Integer> fQueue = new PriorityQueue<>((a, b) -> fMap.get(a) - fMap.get(b));
        for (int s : fSet) {
            fQueue.add(s);
            if (fQueue.size() > k) {
                fQueue.remove();
            }
        }

        int i = 0;
        while (!fQueue.isEmpty()) {
            res[i++] = fQueue.remove();
        }
        return res;
    }
}