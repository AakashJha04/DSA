class Solution {
    public int findCircleNum(int[][] isConnected) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int r = isConnected.length;
        int c = isConnected[0].length;
        for (int i = 0; i < r; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    continue;
                }
                if (isConnected[i][j] == 1) {
                    adjList.get(i).add(j);
                }
            }
        }
        int components = 0;
        int[] vis = new int[r];
        for (int i = 0; i < r; i++) {
            if (vis[i] == 0) {
                components++;
                bfs(q, vis, adjList, i);
            }
        }
        return components;
    }

    void bfs(Queue<Integer> q, int[] vis, ArrayList<ArrayList<Integer>> adjList, int node) {
        q.offer(node);
        vis[node] = 1;

        while (!q.isEmpty()) {
            int top = q.poll();
            for (int neighbour : adjList.get(top)) {
                if (vis[neighbour] == 0) {
                    q.offer(neighbour);
                    vis[neighbour] = 1;
                }
            }
        }
    }
}
