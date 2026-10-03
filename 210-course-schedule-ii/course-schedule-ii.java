class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // We have numCourses nodes
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        // Build graph + indegree
        for (int i = 0; i < prerequisites.length; i++) {
            int next = prerequisites[i][0];
            int prev = prerequisites[i][1];

            adj.get(prev).add(next);
            indegree[next]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // Find courses with no prerequisites
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        ArrayList<Integer> topoSort = new ArrayList<>();

        while (!q.isEmpty()) {
            int current = q.poll();

            topoSort.add(current);

            for (int neighbour : adj.get(current)) {
                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    q.offer(neighbour);
                }
            }
        }

        // Cycle exists
        if (topoSort.size() != numCourses) {
            return new int[0];
        }

        // ArrayList<Integer> -> int[]
        int[] result = new int[topoSort.size()];

        for (int i = 0; i < topoSort.size(); i++) {
            result[i] = topoSort.get(i);
        }

        return result;
    }
}