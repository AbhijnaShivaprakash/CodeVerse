import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] lastMerged = merged.get(merged.size() - 1);
            if (intervals[i][0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], intervals[i][1]);
            } else {
                merged.add(intervals[i]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

