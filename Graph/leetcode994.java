class Solution {
    public int orangesRotting(int[][] grid) {
        int cntFresh = 0;
        Queue<int []> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }
        if(cntFresh == 0) {
            return 0;
        }
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};
        int min = 0;
        int change= 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                int[] point = queue.poll(); // 0, 0
                for(int j=0;j<4;j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j]; // 1, 0 -- -1,0 -- 1,1 -- 1,-1
                    if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || 
            grid[x][y] == 2 || grid[x][y] == 0){
                        continue;
                    }
                    grid[x][y] = 2;
                    change=change+1;
                    queue.add(new int[]{x,y}); // 1,0 & 1,1
                }
            }
            if (!queue.isEmpty())
            min = min + 1;
        }
        if(cntFresh != change) return -1;
        return min;
    }
}
