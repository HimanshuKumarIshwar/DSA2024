package array6;

public class MainClass {
    public static void main(String[] args) {
        int grid[][] = {{1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}};

        int countZero = 0;
        int sx = -1;
        int sy = -1;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 0)countZero++;
                if(grid[i][j] == 1){
                    sx = i;
                    sy = j;
                }

            }
        }

        System.out.println(dfs(grid, sx, sy, countZero));
    }

    static int dfs(int [][]grid, int sx, int sy, int countZero){
        if(sx<0 || sx >= grid.length || sy<0 || sy >=grid[0].length || grid[sx][sy] ==-1)return 0;
        if(grid[sx][sy] == 2)return countZero ==0 ? 1: 0;
        if(grid[sx][sy] == 0)countZero--;


        grid[sx][sy] = -1;
        int totalPath = dfs(grid,sx+1, sy, countZero) + dfs(grid, sx-1, sy, countZero) + dfs(grid, sx, sy-1, countZero) + dfs(grid, sx, sy+1, countZero);
        grid[sx][sy] = 0;
        return totalPath;
    }
}
