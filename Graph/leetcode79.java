class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,word,0))
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int r,int c,String word,int ind){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || ind>=word.length()){
            return false;
        }
        if(board[r][c] == word.charAt(ind) && word.length()-1 ==ind ){
            return true;
        }
        if(board[r][c] == word.charAt(ind)){
            char temp=board[r][c];
            board[r][c]='.';
            if(dfs(board,r+1,c,word,ind+1)||dfs(board,r-1,c,word,ind+1)||dfs(board,r,c+1,word,ind+1)||
            dfs(board,r,c-1,word,ind+1)){
                return true;
            }
            board[r][c]=temp;
        }
        return false;
    }
}
