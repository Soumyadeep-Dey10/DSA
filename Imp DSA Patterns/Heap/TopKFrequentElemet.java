import java.util.*;

class Solution {
    
    class Pair {
        int first;   // frequency
        int second;  // element

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        // frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // min-heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.first != b.first)
                    return a.first - b.first;
                return a.second - b.second;
            }
        );

        // process map
        for (int key : map.keySet()) {
            int element = key;
            int freq = map.get(key);

            Pair curr = new Pair(freq, element);

            if (pq.size() < k) {
                pq.offer(curr);
                continue;
            }

            if (curr.first < pq.peek().first)
                continue;

            pq.poll();
            pq.offer(curr);
        }

        // build result
        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll().second;
        }

        return res;
    }
}
