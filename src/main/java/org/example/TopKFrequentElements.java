package org.example;

import java.util.HashMap;

public class TopKFrequentElements{

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> fMap = new HashMap<>();

        for (int n : nums) {
            fMap.put(n, fMap.getOrDefault(n, 0) + 1);
        }


    }
}