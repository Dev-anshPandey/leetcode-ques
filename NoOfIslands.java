class Pair{
    int first;
    int second;
    Pair(int fst,int snd){
        this.first=fst;
        this.second=snd;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int[][] visited=new int[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                 if(visited[i][j]==0 && grid[i][j] =='1'){
                     count++;
                     bfs(i,j,visited,grid);
                 }
            }
        }
        return count;
    }
    void bfs(int i,int j,int[][] visited,char[][] grid){
        visited[i][j]=1;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        int n=grid.length;
        int m=grid[0].length;
        int delrow[]={-1,1,0,0};
        int delcol[]={0,0,-1,1};
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int k=0;k<4;k++){
             int nrow= row +delrow[k];
              int ncol= col+ delcol[k];
              if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                  visited[nrow][ncol]=1;
                  q.add(new Pair(nrow,ncol));
              }
        }



        }
    }
}