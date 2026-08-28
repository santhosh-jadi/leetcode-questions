class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] d = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotten = false;

            for (int k = 0; k < size; k++) {
                int[] cor = queue.poll();
                int x = cor[0];
                int y = cor[1];

                for (int i = 0; i < 4; i++) {
                    int newX = x + d[i][0];
                    int newY = y + d[i][1];

                    if (newX >= 0 && newX < rows &&
                        newY >= 0 && newY < cols &&
                        grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        queue.add(new int[]{newX, newY});
                        rotten = true;
                    }
                }
            }

            if (rotten) {
                time++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }
}