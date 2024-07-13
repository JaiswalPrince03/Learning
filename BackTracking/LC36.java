package BackTracking;

public class LC36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.' && !check(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check(char[][] board,int row,int col){
        //row check
        for(int i=0;i<9;i++){
            if(board[row][i] == board[row][col] && i != col){
                return false;
            }
        }
        //column check
        for(int i=0;i<9;i++){
            if(board[i][col] == board[row][col] && i != row){
                return false;
            }
        }
        //Sub grid check
        int startRow = (row / 3)*3;
        int startCol = (col / 3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j] == board[row][col] && (i != row || j != col)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                         {'.','.','.','2','4','8','.','.','.'},
                         {'.','.','7','.','.','.','5','2','.'},
                         {'.','.','.','1','5','9','.','.','.'},
                         {'.','.','.','.','8','.','.','7','9'},
                         {'.','.','.','4','1','9','.','.','.'},
                         {'.','.','.','.','6','.','.','.','.'},
                         {'.','.','2','8','.','.','.','4','.'},
                         {'.','.','9','.','.','.','3','.','.'}};
        System.out.println(isValidSudoku(board));
    }
}
