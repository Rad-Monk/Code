public class _79 {
    public static boolean backtrack(char[][] board, String word, int i, int j, int index, boolean[][] visited){
        if( index == word.length()) return true;
        if( i < 0 || j < 0 || i>=board.length || j>= board[0].length || visited[i][j] || board[i][j]!=word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        if(     backtrack(board, word, i+1,j,index+1,visited) ||
                backtrack(board, word, i-1,j,index+1,visited) ||
                backtrack(board, word, i,j+1,index+1,visited) ||
                backtrack(board, word, i,j-1,index+1,visited)) return true;
        visited[i][j]=false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean found = false;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(board[i][j] == word.charAt(0)){
                    found = backtrack(board, word, i, j, 0, visited);
                    if(found) return true;
                }
            }
        }
        return false;
    }
}
