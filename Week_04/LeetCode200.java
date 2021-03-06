package 每日一题;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-05-10 17:13
 **/

public class LeetCode200 {

    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }

        int res = 0;
        int il = grid.length;
        int jl = grid[0].length;

        for (int i = 0; i <il ; i++) {
            for (int j = 0; j <jl ; j++) {

                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j,il,jl);
                }
            }
        }

        return res;
    }

    private void dfs(char[][] grid, int i, int j, int il, int jl) {
        if(i<0 || j<0 || i>=il || j>=jl || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i,j+1,il,jl);
        dfs(grid,i+1,j,il,jl);
        dfs(grid,i,j-1,il,jl);
        dfs(grid,i-1,j,il,jl);
    }


}
