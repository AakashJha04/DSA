class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        List<int[]> ans = new ArrayList<>();

        int start = intervals[0][0]; //1
        int end = intervals[0][1]; //3

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) { //2<=3
                end = Math.max(end, intervals[i][1]); //3, 6 
            } else {
                ans.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];

            }
        }

        ans.add(new int[] { start, end });
        return ans.toArray(new int[ans.size()][]);

    }
}