//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/overlapping-intervals--170633
import java.util.*;

class Solution {
    public List<int[]> mergeOverlap(int[][] intervals) {
        // Sort intervals based on starting times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0; // Points to the last merged interval

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) {
                // Merge the intervals
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        // Collect merged intervals into a result list
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i <= index; i++) {
            result.add(intervals[i]);
        }

        return result;
    }
}
