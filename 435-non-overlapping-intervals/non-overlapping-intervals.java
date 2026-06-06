class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int keep = 1;
        int prevEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= prevEnd) {
                keep++;
                prevEnd = intervals[i][1];
            }
        }
        return intervals.length - keep;
    }
}


/*
intervals : [[1,2],[2,3],[3,4],[1,3]]
sort : [[1,2],[2,3],[1,3],[3,4]]


*/