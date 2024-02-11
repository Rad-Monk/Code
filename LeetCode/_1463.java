class _1463 {

    Integer[][][] memo;
    public int helper(int[][] grid, int currrow, int robot1, int robot2){
        if( robot1<0 || robot1>= grid[0].length || robot2<0 || robot2>= grid[0].length) return 0;
        if( currrow == grid.length) return 0;
        if( memo[currrow][robot1][robot2]!=null) return memo[currrow][robot1][robot2];
        int result=0;
        result+= grid[currrow][robot1];
        result+= grid[currrow][robot2];
        int max=0;
        for(int i= robot1-1; i<=robot1+1;i++){
            for(int j= robot2-1; j<= robot2+1;j++){
                if(i < j){
                    max= Math.max(max,helper(grid, currrow+1, i, j));
                }
            }
        }
        result+=max;
        return memo[currrow][robot1][robot2]= result;
    }

    public int cherryPickup(int[][] grid) {
        int rows= grid.length;
        int cols= grid[0].length;
        memo= new Integer[rows+1][cols+1][cols+1];
        return helper(grid,0,0,cols-1);
    }
}