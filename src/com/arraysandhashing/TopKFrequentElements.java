package com.arraysandhashing;
import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int a[] = new int[k];

        // Build frequency map
        for (int num : nums) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }

        // Create a list of Map.Entry (element, frequency) for sorting
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hp.entrySet());

        // Sort by frequency in descending order
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        // Collect the top k frequent elements
        for (int i = 0; i < k; i++) {
            a[i] = list.get(i).getKey();
        }

        return a;
    }
}

//Time Complexity is O(n)
// Space Complexity is O(n)
