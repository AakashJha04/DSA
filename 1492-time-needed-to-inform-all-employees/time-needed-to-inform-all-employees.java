import java.util.*;

class Solution {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build manager -> subordinates graph
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.get(manager[i]).add(i);
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        // {employee, timeReached}
        queue.offer(new int[]{headID, 0});

        int answer = 0;

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int employee = curr[0];
            int currentTime = curr[1];

            answer = Math.max(answer, currentTime);

            for (int subordinate : adjList.get(employee)) {

                int newTime = currentTime + informTime[employee];

                queue.offer(new int[]{subordinate, newTime});
            }
        }

        return answer;
    }
}