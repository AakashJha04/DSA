class Solution {

    public boolean bfs(int start, int[][] graph, int[] vis, int[] color) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        vis[start] = 1;
        color[start] = 1;

        while (!q.isEmpty()) {

            int topElement = q.poll();

            for (int neighbour : graph[topElement]) {

                if (vis[neighbour] == 0) {

                    vis[neighbour] = 1;
                    color[neighbour] = 1 - color[topElement];
                    q.offer(neighbour);

                } else if (color[neighbour] == color[topElement]) {

                    return false;
                }
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {

        int vertices = graph.length;

        int[] vis = new int[vertices];
        int[] color = new int[vertices];
        Arrays.fill(color, -1);

        for (int i = 0; i < vertices; i++) {

            if (vis[i] == 0) {

                if (!bfs(i, graph, vis, color)) {
                    return false;
                }
            }
        }

        return true;
    }
}