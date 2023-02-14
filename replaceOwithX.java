class Pair{
    int row;
    int column;
    Pair(int _row,int _column){
        this.row=_row;
        this.column=_column;
    }
}
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
              vis[i][0]=1;
              q.add(new Pair(i,0));
            }
           
        }
        for(int i=0;i<n;i++){
            if(board[i][m-1]=='O'){
              vis[i][m-1]=1;
             q.add(new Pair(i,m-1));
            }
           
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
             vis[0][i]=1;
           q.add(new Pair(0,i));     
            }
           
        }
        for(int i=0;i<m;i++){
            if(board[n-1][i]=='O'){
                vis[n-1][i]=1;
             q.add(new Pair(n-1,i));
            }
           
        }
        int[] delrow={1,-1,0,0};
        int[] delcol={0,0,1,-1};
        while(!q.isEmpty()){
           int row=q.peek().row;
           int column=q.peek().column;
           q.remove();
           for(int i=0;i<4;i++){
               int nrow=row+delrow[i];
               int ncolumn=column+delcol[i];
               if(nrow>=0 && nrow<n && ncolumn>=0 &&
                ncolumn<m && vis[nrow][ncolumn]==0 
                && board[nrow][ncolumn]=='O'  ){
                    vis[nrow][ncolumn]=1;
                    q.add(new Pair(nrow,ncolumn));
                   }
           }

        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }


    }
}