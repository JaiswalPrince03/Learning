// package BackTracking;

public class LC37 {
    
        public boolean check(char [][] board,int row,int col,char val){
           //row check
            for(int i=0;i<9;i++){
                if(board[row][i] == val){
                    return false;
                }
            }
            //column check
            for(int i=0;i<9;i++){
                if(board[i][col] == val){
                    return false;
                }
            }     
            //grid
            int sr = (row/3) * 3;
            int sc = (col/3) * 3;
            for(int i = sr; i<sr+3; i++){
                for(int j = sc; j<sc+3; j++){
                    if(i!=row && j!=col && board[i][j]==val){
                        return false;
                    }
                }
            }
            return true;
        }
        public boolean f(char[][] board){
            for(int i = 0; i<9; i++){
                for(int j = 0; j<9; j++){
                    if(board[i][j] == '.'){
                        //all values from 1 to 9
                        for(char k ='1';k<='9';k++){
                            if(check(board,i,j,k)){
                                board[i][j]=k;
                                boolean canfill = f(board);
                                if(canfill){
                                    return true;
                                }
                                board[i][j] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        public void solveSudoku(char[][] board) {
            f(board);
            return;
            
        }
    
}
