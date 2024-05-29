import java.util.Arrays;

public class _36 {
    private final boolean[] check = new boolean[9];
    public boolean validRows(char[][] board){
        for(int i = 0; i<9;i++){
            int num;
            for(int j =0; j<9; j++){
                if(board[i][j] == '1' ||board[i][j] == '2' ||board[i][j] == '3' ||
                        board[i][j] == '4' ||board[i][j] == '5' ||board[i][j] == '6' ||
                        board[i][j] == '7' ||board[i][j] == '8' ||board[i][j] == '9' ){
                    num = board[i][j] - 1 - 48;
                    if(check[num]) return false;
                    check[num] = true;
                }
            }
            Arrays.fill(check, false);
        }
        return true;
    }

    public boolean validColumns(char[][] board){
        for(int i = 0; i<9;i++){
            int num;
            for(int j =0; j<9; j++){
                if(board[j][i] == '1' ||board[j][i] == '2' ||board[j][i] == '3' ||
                        board[j][i] == '4' ||board[j][i] == '5' ||board[j][i] == '6' ||
                        board[j][i] == '7' ||board[j][i] == '8' ||board[j][i] == '9' ){
                    num = board[i][j] - 1 - 48;
                    if(check[num]) return false;
                    check[num] = true;
                }
            }
            Arrays.fill(check, false);
        }
        return true;
    }

    public boolean validBox(char[][] board){
        for(int row = 0; row < 9; row+= 3 ){
            for(int column = 0; column < 9; column+=3){
                for(int i = row; i<row+3; i++){
                    int num;
                    for(int j = column; j<column+3; j++){
                        if(board[i][j] == '1' ||board[i][j] == '2' ||board[i][j] == '3' ||
                                board[i][j] == '4' ||board[i][j] == '5' ||board[i][j] == '6' ||
                                board[i][j] == '7' ||board[i][j] == '8' ||board[i][j] == '9' ){
                            num = board[i][j] - 1 - 48;
                            if(check[num]) return false;
                            check[num] = true;
                        }
                    }
                }
                Arrays.fill(check, false);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return validRows(board) & validColumns(board) & validBox(board);
    }

    public static void main(String[] args) {
        for(int row = 0; row < 9; row+= 3 ){
            for(int column = 0; column < 9; column+=3){
                for(int i = row; i<row+3; i++){
                    for(int j = column; j<column+3; j++){
                        System.out.print(i+" "+j+", ");
                        }
                    System.out.println();
                    }
                }
            }
        }

    }

